package com.wit.inspaction.preinspaction.model;

public class PreinspactionDTO {
    
	private String inspId;					// 점검ID
    private String inspSeq;					// 점검순번
    private String inspNm;					// 점검명
    private String inspDetlAllCnt;			// 점검 상세 전체 건수
    private String inspDetlChoiceCnt;		// 점검 상세 건수
    
	/**
	 * @return the inspId
	 */
	public String getInspId() {
		return inspId;
	}
	/**
	 * @param inspId the inspId to set
	 */
	public void setInspId(String inspId) {
		this.inspId = inspId;
	}
	/**
	 * @return the inspSeq
	 */
	public String getInspSeq() {
		return inspSeq;
	}
	/**
	 * @param inspSeq the inspSeq to set
	 */
	public void setInspSeq(String inspSeq) {
		this.inspSeq = inspSeq;
	}
	/**
	 * @return the inspNm
	 */
	public String getInspNm() {
		return inspNm;
	}
	/**
	 * @param inspNm the inspNm to set
	 */
	public void setInspNm(String inspNm) {
		this.inspNm = inspNm;
	}
	/**
	 * @return the inspDetlAllCnt
	 */
	public String getInspDetlAllCnt() {
		return inspDetlAllCnt;
	}
	/**
	 * @param inspDetlAllCnt the inspDetlAllCnt to set
	 */
	public void setInspDetlAllCnt(String inspDetlAllCnt) {
		this.inspDetlAllCnt = inspDetlAllCnt;
	}
	/**
	 * @return the inspDetlChoiceCnt
	 */
	public String getInspDetlChoiceCnt() {
		return inspDetlChoiceCnt;
	}
	/**
	 * @param inspDetlChoiceCnt the inspDetlChoiceCnt to set
	 */
	public void setInspDetlChoiceCnt(String inspDetlChoiceCnt) {
		this.inspDetlChoiceCnt = inspDetlChoiceCnt;
	}
}