package com.example.demo.domain.Report.GetJianyanReportDetail;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("ImageList")
public class ImageList {

	//自身ID
    @XStreamAsAttribute
    @XStreamAlias("ID")
	private String ID;
	
    //父类ID
    @XStreamAsAttribute
    @XStreamAlias("ParentID")
	private String parentID;
	
    //影像大图
    @XStreamAsAttribute
    @XStreamAlias("LargeImgSrc")
    private String largeImgSrc;
    
    //影像小图
    @XStreamAsAttribute
    @XStreamAlias("SmallImgSrc")
	private String smallImgSrc;

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getParentID() {
		return parentID;
	}

	public void setParentID(String parentID) {
		this.parentID = parentID;
	}

	public String getLargeImgSrc() {
		return largeImgSrc;
	}

	public void setLargeImgSrc(String largeImgSrc) {
		this.largeImgSrc = largeImgSrc;
	}

	public String getSmallImgSrc() {
		return smallImgSrc;
	}

	public void setSmallImgSrc(String smallImgSrc) {
		this.smallImgSrc = smallImgSrc;
	}
	
}
