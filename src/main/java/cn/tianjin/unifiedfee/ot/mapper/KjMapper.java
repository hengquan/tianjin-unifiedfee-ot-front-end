package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.Kj;

public interface KjMapper {
    int insert(Kj record);

    int insertSelective(Kj record);
}