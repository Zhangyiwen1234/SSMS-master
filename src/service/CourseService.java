package service;

import model.Course;
import model.PageBean;

import java.util.List;

public interface CourseService {
	// * ��ӿγ�


	int addCos(Course course, String courseDate);
	// * ɾ���γ�


	int deleteCos(int courseID);
	// * �޸Ŀγ�


	int editCos(Course course,String courseDate);
	 //* ��ѯ���пγ�


	List findAll();
	 //* ��ѯһ���γ�


	List findOne(int courseID);
	// * ��ѯ�ÿγ��Ƿ����


	Course selectOneCos(Course cours);
	// * ��ҳ��ѯ�γ�


	PageBean courseListPage(int pageNo,int pageCount);


}
