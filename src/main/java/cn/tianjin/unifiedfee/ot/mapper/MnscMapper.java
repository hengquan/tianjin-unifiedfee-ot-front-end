package cn.tianjin.unifiedfee.ot.mapper;

import java.util.List;

import cn.tianjin.unifiedfee.ot.entity.Mnsc;

public interface MnscMapper {
    int insert(Mnsc record);

	List<Mnsc> getPageData();

	int update(Mnsc entity);

	int delete(Mnsc entity);

	List<Mnsc> selectAllMsg();

	Mnsc get(String id);
}