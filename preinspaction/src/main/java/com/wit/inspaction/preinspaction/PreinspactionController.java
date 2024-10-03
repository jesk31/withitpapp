package com.wit.inspaction.preinspaction;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wit.inspaction.preinspaction.model.PreinspactionDTO;
import com.wit.inspaction.preinspaction.model.PreinspactionDetailDTO;
import com.wit.inspaction.preinspaction.service.PreinspactionService;

@RestController
public class PreinspactionController {
	
	@Autowired
	private PreinspactionService preinspactionService;
	
	/**
	 * 사전점검 항목 리스트 조회
	 * @return List<PreinspactionDTO>
	 */
	@RequestMapping("/wit/getPreinspactionList")
    public List<PreinspactionDTO> getPreinspactionList() {
    	
		System.out.println("PreinspactionServiceImpl 호출");
		
		List<PreinspactionDTO> preinspactionList = preinspactionService.getPreinspactionList();
    	
		System.out.println("사전점검 리스트 ::: " + preinspactionList.size());
		
        return preinspactionList;
    }
	
	/**
	 * 사전점검 상세항목 리스트 조회
	 * @param param
	 * @return List<PreinspactionDetailDTO>
	 */
	@RequestMapping("/wit/getPreinspactionDetailList")
    public List<PreinspactionDetailDTO> getPreinspactionDetailList(@RequestBody HashMap<String, Object> param) {
    	
		System.out.println("getPreinspactionDetailList 호출");
		
		// 파라미터
		String inspId = param.get("inspId") == null ? "" : (String) param.get("inspId");
		
		System.out.println("inspId :: " + inspId);
		
		HashMap<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("inspId", inspId);
		
		List<PreinspactionDetailDTO> preinspactionDetailList = preinspactionService.getPreinspactionDetailList(paramMap);
    	
		System.out.println("사전점검 상세 리스트 ::: " + preinspactionDetailList.size());
		
        return preinspactionDetailList;
    }
	
	/**
	 * 사전점검 항목 저장
	 * @param param
	 * @return int
	 */
	@RequestMapping("/wit/savePreinspactionInfo")
    public int savePreinspactionInfo(@RequestBody HashMap<String, Object> param) {
    	
		System.out.println("savePreinspactionInfo 호출");
		
		String test1 = (String) param.get("inspId");
		String test2 = (String) param.get("inspDetlId");
		String test3 = (String) param.get("checkYn");
		
		System.out.println(test1 + " ::: " + test2 + " ::: " + test3);
		
		int result = preinspactionService.savePreinspactionInfo(param);
		
        return result;
    }
}