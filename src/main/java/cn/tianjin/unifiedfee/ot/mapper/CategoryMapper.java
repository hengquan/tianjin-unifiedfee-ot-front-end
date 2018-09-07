package cn.tianjin.unifiedfee.ot.mapper;

import java.util.List;

import cn.tianjin.unifiedfee.ot.entity.Category;

public interface CategoryMapper {
    public List<Category> getAllList();
    int insert(Category record);
    int insertSelective(Category record);
}