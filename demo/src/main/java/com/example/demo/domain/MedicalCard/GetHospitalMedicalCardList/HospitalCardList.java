package com.example.demo.domain.MedicalCard.GetHospitalMedicalCardList;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("HospitalCardList")
public class HospitalCardList {

	//卡号
	@XStreamAsAttribute
	@XStreamAlias("CardNo")
	private String cardNo;
	
	//就诊卡类型
	@XStreamAsAttribute
	@XStreamAlias("CardType")
	private String cardType;
	
	//备注
	@XStreamAsAttribute
	@XStreamAlias("Memo")
	private String memo;

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
		
	
}
