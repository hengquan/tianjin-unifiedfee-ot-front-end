package cn.tianjin.unifiedfee.ot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.tianjin.unifiedfee.ot.entity.UserInfo;
import cn.tianjin.unifiedfee.ot.mapper.UserInfoMapper;

@Service
public class UserInfoService{
	@Autowired
	private UserInfoMapper dao;
	
    public List<UserInfo> getAll() {
        return dao.findAllList();
    }
}