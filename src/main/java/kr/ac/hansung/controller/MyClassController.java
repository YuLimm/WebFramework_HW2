package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.MyClass;
import kr.ac.hansung.service.MyClassService;

@Controller
public class MyClassController {//각 학년,학기별 링크에 따른 페이지 처리
	@Autowired
	private MyClassService myclassService;
	
	//2016학년 1학기 교과목페이지 처리
	@RequestMapping("/myclass1")
	public String showmyClass1(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2016","1");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2016");
		model.addAttribute("semester", "1");
		
		return "showMyClass";
	}
	
	//2016학년 2학기 교과목페이지 처리
	@RequestMapping("/myclass2")
	public String showmyClass2(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2016","2");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2016");
		model.addAttribute("semester", "2");
		
		return "showMyClass";
	}
	
	//2017학년 1학기 교과목페이지 처리
	@RequestMapping("/myclass3")
	public String showmyClass3(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2017","1");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2017");
		model.addAttribute("semester", "1");
		
		return "showMyClass";
	}
	
	//2017학년 2학기 교과목페이지 처리
	@RequestMapping("/myclass4")
	public String showmyClass4(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2017","2");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2017");
		model.addAttribute("semester", "2");
		
		return "showMyClass";
	}
	
	//2018학년 1학기 교과목페이지 처리
	@RequestMapping("/myclass5")
	public String showmyClass5(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2018","1");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2018");
		model.addAttribute("semester", "1");
		
		return "showMyClass";
	}
	
	//2018학년 2학기 교과목페이지 처리
	@RequestMapping("/myclass6")
	public String showmyClass6(Model model) {
		List<MyClass> myclass = myclassService.getCurrent("2018","2");
		model.addAttribute("myclasses", myclass);
		model.addAttribute("year", "2018");
		model.addAttribute("semester", "2");
		
		return "showMyClass";
	}

}

