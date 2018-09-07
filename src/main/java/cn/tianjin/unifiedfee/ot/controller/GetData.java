package cn.tianjin.unifiedfee.ot.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tianjin.unifiedfee.ot.service.TmpService;

@Controller
@RequestMapping(value="/getdata")
public class GetData {
    @Autowired
    private TmpService tmpService;

    @RequestMapping("cataList")
    @ResponseBody
    public Map<String, Object> tmp() {
//        //当前页数
//        int pageNum = 1;
//        //一页多少条
//        int pageSize = 10;
//        PageHelper.startPage(pageNum,pageSize);
//        Map<String,Object> map = new HashMap<String,Object>();
//        List<Tmp> tmps = tmpService.getAll();
//        //放入分页
//        PageInfo<Tmp> a = new PageInfo<Tmp>(tmps);
        //返回
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("total", 1);
        List l=new ArrayList();
        Map<String, Object> oneM=new HashMap<String, Object>();
        oneM.put("id", "1");
        oneM.put("name", "Test11");
        l.add(oneM);
        map.put("rows", l);
        return map;
    }
}