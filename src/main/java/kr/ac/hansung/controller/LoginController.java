package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {//로그인, 로그아웃 처리
	
	@RequestMapping("/login")
	public String showLogin( @RequestParam(value="error", required=false) String error,
			@RequestParam(value="logout", required=false) String logout, Model model) {
		
		if(error!=null) {
			//로그인 오류
			model.addAttribute("errorMsg", "아이디 또는 비밀번호를 다시 확인하세요.");
		}
		
		if(logout!=null) {
			//로그아웃 성공시
			model.addAttribute("logoutMsg", "로그아웃을 성공적으로 마쳤습니다.");
		}
		
		return "login";
	}
}
