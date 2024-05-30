package service;

import java.util.List;

import model.PageBean;
import model.UsRole;
import model.User;

public interface UserService {
	/*
	 * ��¼��֤����ѯ���롢��ѯ��Ϣ
	 */
	User login(User user);

	/*
	 * �޸�����
	 */
	int editPwd(User user);

	/*
	 * ���
	 */
	int addUser(User user);

	/*
	 * ��ѯ�����˺���Ϣ
	 */
	List findAll();

	/*
	 * ��ѯһ���˺���Ϣ
	 */
	List selectOneUser(int userID);

	/*
	 * �޸������˺���Ϣ
	 */
	int editUser(User user);

	List findOne(String userNum);

	public PageBean userListPage(int pageNo, int pageCount);


	int deleteUser(String userNum);
}
