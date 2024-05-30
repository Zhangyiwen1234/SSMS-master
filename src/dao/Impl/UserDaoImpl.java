package dao.Impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.UserDao;
import model.PageBean;
import model.Student;
import model.UsRole;
import model.User;
import db.DBCon;

public class UserDaoImpl implements UserDao {
    private DBCon dbCon = new DBCon();
    private User user;

    public User login(User user) {
        String sql = "select * from user where user_num='" + user.getUserNum()
                + "'";
        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                int userID = rs.getInt("user_id");
                String userNum = rs.getString("user_num");
                String userName = rs.getString("user_name");
                String pwd = rs.getString("password");
                String phone = rs.getString("phone");
                String roleName = rs.getString("role_name");
                user = new User(userID, userNum, userName, pwd, phone, roleName);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
        return user;
    }

    public int editPwd(User user) {
        String sql = "update user set password='" + user.getPassword()
                + "' where user_num='" + user.getUserNum() + "'";
        int rs = dbCon.query(sql);
        return rs;
    }

    public int addUser(User user) {
    /*    String sql = "insert into user(user_num,user_name,password,phone,role_name) values('"
                + user.getUserNum()
                + "','"
                + user.getUserName()
                + "','"
                + user.getPassword()
                + "',"
                + user.getPhone()
                + ","
                + user.getRoleName() + ")";*/
        String sql = "INSERT INTO user(user_num, user_name, password, phone, role_name) " +
                "VALUES('" + user.getUserNum() + "', '" + user.getUserName() + "', '" +
                user.getPassword() + "', " + user.getPhone() + ", '" + user.getRoleName() + "')";

        int rs = dbCon.query(sql);
        return rs;
    }

    public List findAll() {
        List<User> list = new ArrayList<User>();

        String sql = "select * from user where role_name = '信息录入人员' or role_name='信息查询人员'";
        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                int userID = rs.getInt("user_id");
                String userNum = rs.getString("user_num");
                String userName = rs.getString("user_name");
                String pwd = rs.getString("password");
                String phone = rs.getString("phone");
                String roleName = rs.getString("role_name");
                user = new User(userID, userNum, userName, pwd, phone,
                        roleName);
                list.add(user);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return list;
    }

    public int deleteUser(String userNum) {
        String sql = "delete from user where user_num='" + userNum + "'";
        int rs = dbCon.query(sql);
        return rs;
    }

    public List selectOneUser(int userID) {
        List<User> list = new ArrayList<User>();
        String sql = "select * from user where user_id=" + userID;
        ResultSet rs = dbCon.find(sql);
        try {
            while (rs.next()) {
                int userid = rs.getInt("user_id");
                String userNum = rs.getString("user_num");
                String userName = rs.getString("user_name");
                String pwd = rs.getString("password");
                String phone = rs.getString("phone");
                String roleName = rs.getString("role_name");
                user = new User(userid, userNum, userName, pwd, phone, roleName);
                list.add(user);
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return list;
    }

    public int editUser(User user) {
        String sql = "update user set user_name='" + user.getUserName()
                + "',password='" + user.getPassword() + "',user_num='"+user.getUserNum()+
                "',phone='" + user.getPhone() + "' where user_id=" + user.getUserID()
                + "";

        int rs = dbCon.query(sql);
        return rs;
    }
    public PageBean userListPage(int pageNo, int pageCount) {
        PageBean pageBean = new PageBean();
        int totalCount=0;
        List<User> list = new ArrayList<User>();
        String sql="select * from user where role_name = '信息录入人员' or role_name='信息查询人员' limit "+((pageNo-1)*pageCount)+","+pageCount;
        String sqlCount="select count(*) from user where role_name = '信息录入人员' or role_name='信息查询人员'";

        try {
            ResultSet rs=dbCon.find(sql);
            while(rs.next()){
                //int userid = rs.getInt("user_id");
                String userNum = rs.getString("user_num");
                String userName = rs.getString("user_name");
                String pwd = rs.getString("password");
                String phone = rs.getString("phone");
                String roleName = rs.getString("role_name");
                user = new User( userNum, userName, pwd, phone, roleName);

                list.add(user);
            }
            rs=dbCon.find(sqlCount);

            while(rs.next()){
                totalCount=rs.getInt(1);
            }
            pageBean=new PageBean(list ,  totalCount,  pageNo,  pageCount);
        } catch (SQLException e) {
            dbCon.close();
            e.printStackTrace();
        }
        return pageBean;
    }
    public List findOne(String useNum) {
        List<User> list = new ArrayList<User>();
        String sql="select * from user where user_num='"+useNum+"'";
        ResultSet rs=dbCon.find(sql);
        try {
            while(rs.next()){
                int userid = rs.getInt("user_id");
                String userNum = rs.getString("user_num");
                String userName = rs.getString("user_name");
                String pwd = rs.getString("password");
                String phone = rs.getString("phone");
                String roleName = rs.getString("role_name");
                user = new User(userid, userNum, userName, pwd, phone, roleName);
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
