package com.javaEdu.springMVCBoard.dao;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.javaEdu.springMVCBoard.dto.BDto;

public interface IRepository {

	void write(@Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	ArrayList<BDto> list();
	BDto contentView(String strID);
	void modify(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent);
	void delete(String bId);
	BDto reply_view(String str);
	void reply(@Param("bId")String bId, @Param("bName")String bName, @Param("bTitle")String bTitle, @Param("bContent")String bContent, @Param("bGroup")String bGroup, @Param("bStep")String bStep, @Param("bIndent")String bIndent);
	void replyShape(@Param("strGroup")String strGroup, @Param("strStep")String strStep);
	void upHit(String bId);
}
