package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.Tm;

public interface TmMapper {
    int insert(Tm record);

    int insertSelective(Tm record);
}