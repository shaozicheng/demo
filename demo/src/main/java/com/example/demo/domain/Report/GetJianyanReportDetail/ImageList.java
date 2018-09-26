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
	
}
