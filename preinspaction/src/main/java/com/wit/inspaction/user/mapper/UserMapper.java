package com.wit.inspaction.user.mapper;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wit.inspaction.user.model.UserDTO;

@Repository
public class UserMapper {
	
	@Autowired
	private SqlSessionTemplate sql;
	
	private final String path = "com.wit.inspaction.user.mapper.UserMapper.";
	
	/**
	 * 사전점검 항목 리스트 조회
	 * @return <UserDTO>
	 */
	public List<UserDTO> selectCategoryList() {
		return sql.selectList(path + "selectCategoryList");
	}
	
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectCompanyList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectCompanyList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectNoticeList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectNoticeList", paramMap);
	}
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> selectRequestList(HashMap<String, Object> paramMap) {
		return sql.selectList(path + "selectRequestList", paramMap);
	}
	
    
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertTotalRequestInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertTotalRequestInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int updateRequestState(HashMap<String, Object> paramMap) {
		return sql.update(path + "updateRequestState", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertHistoryRequest(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertHistoryRequest", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return int
	 */
	public int insertRequestInfo(HashMap<String, Object> paramMap) {
		return sql.update(path + "insertRequestInfo", paramMap);
	}
	
	/**
	 * 사전점검 항목 저장
	 * @param paramMap
	 * @return String
	 */
	public String generateReqNo(HashMap<String, Object> paramMap) {
		return sql.selectOne(path + "generateReqNo", paramMap);
	}
}