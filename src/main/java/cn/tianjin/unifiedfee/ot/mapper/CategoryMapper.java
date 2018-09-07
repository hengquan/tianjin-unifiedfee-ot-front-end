package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.Category;

public interface CategoryMapper {
    int insert(Category record);

    int insertSelective(Category record);
}