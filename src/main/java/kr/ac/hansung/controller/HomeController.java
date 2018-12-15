package kr.ac.hansung.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //@Component + 컨트롤러 역할
public class HomeController {//메인 홈 페이지 처리

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showhome(Locale locale, Model model) {
				
		return "home";
	}
	
}
