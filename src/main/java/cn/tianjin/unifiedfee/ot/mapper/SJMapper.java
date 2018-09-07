package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.SJ;

public interface SJMapper {
    int insert(SJ record);

    int insertSelective(SJ record);
}