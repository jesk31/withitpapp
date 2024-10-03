package com.wit.inspaction.preinspaction.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wit.inspaction.preinspaction.mapper.PreinspactionMapper;
import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;

/**
 * 사전점검 서비스 상세
 */
@Service
public class PreinspactionServiceImpl implements PreinspactionService{
	
	@Autowired
	private PreinspactionMapper preinspactionMapper;
	
	/**
	 * 사전점검 리스트 조회
	 */
	@Override
	public List<PreinspactionDTO> getPreinspactionList() {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionList 호출");
		
		List<PreinspactionDTO> list = preinspactionMapper.selectPreinspactionList();
		
		return list;
	}
	
	/**
	 * 사전점검 상세항목 리스트 조회
	 */
	@Override
	public List<PreinspactionDetailDTO> getPreinspactionDetailList(HashMap<String, Object> paramMap) {
		
		System.out.println("PreinspactionServiceImpl getPreinspactionDetailList 호출");
		
		List<PreinspactionDetailDTO> list = preinspactionMapper.selectPreinspactionDetailList(paramMap);
		
		return list;
	}

	/**
	 * 사전점검 항목 저장
	 */
	@Override
	public int savePreinspactionInfo(HashMap<String, Object> paramMap) {
		return preinspactionMapper.insertPreinspactionInfo(paramMap);
	}

}
