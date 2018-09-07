package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.MnscRefSource;

public interface MnscRefSourceMapper {
    int insert(MnscRefSource record);

    int insertSelective(MnscRefSource record);
}