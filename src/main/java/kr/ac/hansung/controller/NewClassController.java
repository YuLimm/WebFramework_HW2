package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.NewClass;
import kr.ac.hansung.service.NewClassService;

@Controller
public class NewClassController {//학년/학기별 이수학점 조회, 수강 신청, 수강 신청 조회페이지 처리
	@Autowired
	private NewClassService newclassService;
	
	//학년/학기별 이수학점 조회 페이지 처리
	@RequestMapping("/showGrade")
	public String showGrade(Model model) {
		List<NewClass> newclass = newclassService.getCurrent();
		model.addAttribute("newclass", newclass);
		
		return "showGrade";
	}
	
	//수강신청 입력처리
	@RequestMapping("/applyClass")
	public String applyClass(Model model) {
	
		model.addAttribute("newclass", new NewClass());
		
		return "applyClass";
	}
	
	//수강신청 정상/오류 처리
	@RequestMapping("/createClass")
	public String createClass(@ModelAttribute("newclass") @Valid NewClass newclass, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("---Class data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			return "applyClass";
		}
		
		newclassService.insert(newclass);
		
		return "home";
	}
	
	//수강 신청 조회페이지 처리
	@RequestMapping("/showClass")
	public String showClass(Model model) {
		List<NewClass> newclass = newclassService.getCurrent();
		model.addAttribute("newclass", newclass);
		
		return "showClass";
	}
}
