package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.NewClassDAO;
import kr.ac.hansung.model.NewClass;


@Service
public class NewClassService {

	@Autowired
	private  NewClassDAO newclassDAO;//newclass table 접근 객체
	
	//DAO 객체를 이용해 newclass 테이블의 레코드(2019년 1학기에 신청할 예상 교과목리스트) 반환
	public List<NewClass> getCurrent() {
		
		return newclassDAO.getNewClass();
		
	}
	
	//newclass 테이블에  입력받은 교과목 저장
	public void insert(NewClass newclass) {
		newclassDAO.insert(newclass);
	}

}
