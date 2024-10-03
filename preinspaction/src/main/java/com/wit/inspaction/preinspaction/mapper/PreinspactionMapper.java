package com.wit.inspaction.preinspaction.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;

@Repository
public class PreinspactionMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.preinspaction.mapper.PreinspactionMapper.";
	
	/**
	 * 사전점검 항목 리스트 조회
	 * @return List<PreinspactionDTO>
	 */
	public List<PreinspactionDTO> selectPreinspactionList() {
		return sql.selectList(path + "selectPreinspactionList");
	}
	
	/**
	 * 사전점검 상세항목 리스트 조회
	 * @param paramMap
	 * @return List<PreinspactionDetailDTO>
	 */
	public List<PreinspactionDetailDTO> selectPreinspactionDetailList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectPreinspactionDetailList", paramMap);
	}
    
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertPreinspactionInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertPreinspactionInfo", paramMap);
	}
}