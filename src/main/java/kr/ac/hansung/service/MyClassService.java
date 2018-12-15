package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.MyClassDAO;
import kr.ac.hansung.model.MyClass;

@Service
public class MyClassService {
	@Autowired
	private  MyClassDAO myclassDAO;//myclass table 접근 객체
	
	//년도와 학기를 매개변수로 받아 DAO 객체를 이용해 교과목 리스트 반환
	public List<MyClass> getCurrent(String year, String semester) {
		
		return myclassDAO.getMyClass(year, semester);
		
	}

}
