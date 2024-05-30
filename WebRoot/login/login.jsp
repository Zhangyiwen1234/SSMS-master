<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>登陆</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <style type="text/css">
        html, body {

            font-family: 'Sacramento', cursive;
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
            background-image: url('../images/login.jpg?random=');
            background-size: cover;
            overflow: hidden;

        }

        container {
            text-align: center;
            padding: 100px;
        }


        canvas{
            position: absolute;
            top: 0;
            z-index: -1;
        }
        #_top {
            text-align: center;
            height: 100px;
            font-size: 30px;
            padding-top: 30px;
            letter-spacing: 10px; /*字与字之间的间距*/
        }
        #_top span{
            color: aliceblue;
        }

        .div_body {
            height: 460px;
            width: 35%;
            position: absolute;
            top: 50%; /* Positions the top of the element at the vertical center */
            right: 5%; /* Positions the element 5% from the right edge of the screen */
            transform: translate(0, -50%); /* Translates the element up by 50% of its height to center it vertically */
            background-color: rgba(255, 255, 255);
            border-radius: 6px;
            z-index: 2;
        }

        #_body {
            width: 100%;
            text-align: center;
        }
        .msg{
            padding-top: 20px;
            color: #374b5d;
            height: 40px;
        }
        table{
            margin: 0 10%;
            width: 100%;
            height: 45%;
        }
        table tr{
            width: 100%;
            height: 15%;
        }
        table tr td{
            font-size: 20px;
            width: 100%;
        }
        .input{
            width: 80%;
            height: 90%;
            border-radius: 40px;
            text-align: center;
            font-size: 15px;
            border:1px solid #ccc;
            color: #ccc;
            margin-bottom: 1px;!important;

        }

        .btn {
            margin-top: 1px; !important;
            color: #ffffff;
            background-color: #08589f;
            border-color: #1485ee;

            width:80%; /*登录选项的宽度*/
            margin-right: 60%;
        }


    </style>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>


    <script type="text/javaScript">
        window.onload = function() {
            particleBg('body', {
                color: 'rgba(255, 255, 255)'
            });
        }
    </script>
</head>

<body>
<div class="div_body">
    <div id="_body">
        <h1 style="margin-top: 60px; text-align: center; color:  #1485ee;font-size: 2.5em;">登录</h1>
        <h3 class="msg" style="cursor:default">${massage }</h3>
        <form action="ServletLogin" method="post"
              onsubmit="return checked(this)">
            <table>

                <tr>
                    <td><input class="input" type="text" name="ID" placeholder="账号">
                    </td>
                </tr>
                <tr>
                    <td><input class="input" type="password" name="pwd" placeholder="密码">
                    </td>
                </tr>

                <tr>
                    <td>
                        <input class="btn" type="submit" value="登录">
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>