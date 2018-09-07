package cn.tianjin.unifiedfee.ot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.tianjin.unifiedfee.ot.entity.Tmp;
import cn.tianjin.unifiedfee.ot.service.TmpService;

@Controller
public class Test {

	@Autowired
	private TmpService tmpService;
	
	@RequestMapping("str")
	@ResponseBody
	public String test(){
		return "字符串";
	}
	
	@RequestMapping("page")
	public String page(){
		return "/index";
	}
	
	@RequestMapping("table")
	public String table(){
		return "/table";
	}
	
	@RequestMapping("str123")
	@ResponseBody
	public Map<String, Object> data(){
		//当前页数
		int pageNum = 1;
		//一页多少条
		int pageSize = 10;
		PageHelper.startPage(pageNum,pageSize);
		Map<String,Object> map = new HashMap<String,Object>();
		//List<UserInfo> userInfos = userInfoService.getAll();
		//放入分页
		//PageInfo<UserInfo> pageInfo = new PageInfo<UserInfo>(userInfos);
		//返回
		//map.put("data", pageInfo);
		return map;
	}
	
	
	@RequestMapping("tmp")
	@ResponseBody
	public Map<String, Object> tmp(){
		//当前页数
		int pageNum = 1;
		//一页多少条
		int pageSize = 10;
		PageHelper.startPage(pageNum,pageSize);
		Map<String,Object> map = new HashMap<String,Object>();
		List<Tmp> tmps = tmpService.getAll();
		//放入分页
		PageInfo<Tmp> a = new PageInfo<Tmp>(tmps);
		//返回
		map.put("data", a);
		return map;
	}
}
