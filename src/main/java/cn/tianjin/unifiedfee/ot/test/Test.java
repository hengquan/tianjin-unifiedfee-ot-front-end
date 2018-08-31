package cn.tianjin.unifiedfee.ot.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("/page")
	@ResponseBody
	public String page(){
		return "12312";
	}
	
	@RequestMapping("/page1")
	public String page1(){
		return "/index";
	}
}
