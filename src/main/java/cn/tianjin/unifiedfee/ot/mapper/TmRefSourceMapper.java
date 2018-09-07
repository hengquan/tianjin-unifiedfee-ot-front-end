package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.TmRefSource;

public interface TmRefSourceMapper {
    int insert(TmRefSource record);

    int insertSelective(TmRefSource record);
}