package com.example.demo.domain.Booking.BookingDocResource;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("DocIntroduction")
public class DocIntroduction {

	//
    @XStreamAsAttribute
    @XStreamAlias("DocCode")
	private String docCode;
	
    //
    @XStreamAsAttribute
    @XStreamAlias("DocName")
	private String docName;
	
    //
    @XStreamAsAttribute
    @XStreamAlias("DocDuty")
    private String docDuty;
    
    //
    @XStreamAsAttribute
    @XStreamAlias("DocPhotoPath")
	private String docPhotoPath;
	
    //
    @XStreamAsAttribute
    @XStreamAlias("DocDesc")
	private String docDesc;
	
    //
    @XStreamAsAttribute
    @XStreamAlias("JsonMemo")
    private String jsonMemo;

	public String getDocCode() {
		return docCode;
	}

	public void setDocCode(String docCode) {
		this.docCode = docCode;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocDuty() {
		return docDuty;
	}

	public void setDocDuty(String docDuty) {
		this.docDuty = docDuty;
	}

	public String getDocPhotoPath() {
		return docPhotoPath;
	}

	public void setDocPhotoPath(String docPhotoPath) {
		this.docPhotoPath = docPhotoPath;
	}

	public String getDocDesc() {
		return docDesc;
	}

	public void setDocDesc(String docDesc) {
		this.docDesc = docDesc;
	}

	public String getJsonMemo() {
		return jsonMemo;
	}

	public void setJsonMemo(String jsonMemo) {
		this.jsonMemo = jsonMemo;
	}
	
    
}
