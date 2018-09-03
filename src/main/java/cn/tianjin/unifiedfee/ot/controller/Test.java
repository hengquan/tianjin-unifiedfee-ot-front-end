package cn.tianjin.unifiedfee.ot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Test {

	@RequestMapping("str")
	@ResponseBody
	public String test(){
		return "字符串";
	}
	
	@RequestMapping("page")
	public String page(){
		return "/index";
	}
}
