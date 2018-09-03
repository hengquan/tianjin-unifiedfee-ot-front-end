package cn.tianjin.unifiedfee.ot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tianjin.unifiedfee.ot.entity.Tmp;
import cn.tianjin.unifiedfee.ot.mapper.TmpMapper;

@Service
public class TmpService{
	@Autowired
	private TmpMapper dao;
	
    public List<Tmp> getAll() {
        return dao.findAllList();
    }
}