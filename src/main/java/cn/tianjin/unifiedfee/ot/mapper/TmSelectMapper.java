package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.TmSelect;

public interface TmSelectMapper {
    int insert(TmSelect record);

    int insertSelective(TmSelect record);
}