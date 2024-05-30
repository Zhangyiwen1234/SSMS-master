package dao.Impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import db.DBCon;

import model.PageBean;
import model.UsRole;
import model.User;

public class EmpBiz {
	DBCon dbCon=new DBCon();
	User user;
	PageBean pageBean;
	public EmpBiz() {
		super();

	}

	//����ʵ�ַ�ҳ�ķ�������������������һ���ڼ�ҳ��һ��ÿҳ������
	public PageBean listEmps(int pageNo, int pageCount){

		ResultSet rs=null;
		ArrayList<User> list=new ArrayList<User>();
		String sqlCount="select count(*) from user where role_name = '��Ϣ¼����Ա' or role_name='��Ϣ��ѯ��Ա'";
		String sql="select user_id,user_num,user_name,password,phone,role_name " +
				"from user where role_name = '��Ϣ¼����Ա' or role_name='��Ϣ��ѯ��Ա' " +
				"limit "+((pageNo-1)*pageCount)+","+pageCount;
		rs=dbCon.find(sql);
		try {
		/*	con=dbCon.dbCon();
			st=con.createStatement();
			rs=st.executeQuery(sql);*/
			while(rs.next()){
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

			rs=dbCon.find(sqlCount);

			//	rs=st.executeQuery(sqlCount);
			int totalCount=0;
			while(rs.next()){
				totalCount=rs.getInt(1);
			}

			pageBean=new PageBean(list,totalCount,pageNo,pageCount);
			return pageBean;
		} catch (SQLException e) {

			e.printStackTrace();
			//	return null;
		}
		return pageBean;
	}

}
