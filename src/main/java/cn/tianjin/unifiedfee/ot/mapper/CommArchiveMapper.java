package cn.tianjin.unifiedfee.ot.mapper;

import cn.tianjin.unifiedfee.ot.entity.CommArchive;

public interface CommArchiveMapper {
    int insert(CommArchive record);

    int insertSelective(CommArchive record);
}