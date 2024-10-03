package com.wit.inspaction.user.service;

import java.util.HashMap;
import java.util.List;

import com.wit.inspaction.user.model.UserDTO;

/**
 * 사전점검 서비스
 */
public interface UserService {

	/**
	 * 사전점검 항목 리스트 조회
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getCategoryList();
	
	/**
	 * 회사 상세 리스트
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getCompanyList(HashMap<String, Object> paramMap);
	
	
	/**
	 * 신청이력조회 
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getRequestList(HashMap<String, Object> paramMap);
	
	/**
	 * 신청이력조회 
	 * @param paramMap
	 * @return List<UserDTO>
	 */
	public List<UserDTO> getNoticeList(HashMap<String, Object> paramMap);
	
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	public int saveRequestInfo(HashMap<String, Object> paramMap);

	/**
	 * 사전점검 항목 저장 토탈
	 * @param paramMap
	 * @return
	 */
	public int saveTotalRequestInfo(HashMap<String, Object> paramMap);
	
	/**
	 * 사전점검 항목 저장 토탈
	 * @param paramMap
	 * @return
	 */
	public int updateRequestState(HashMap<String, Object> paramMap);
	
}
