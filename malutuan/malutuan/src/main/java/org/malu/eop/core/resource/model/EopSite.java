package org.malu.eop.core.resource.model;


import java.io.Serializable;


/**

 * @version 1.0
 */
public class EopSite implements Serializable {

	private static final long serialVersionUID = 7525130003L;
	private Integer id;
	private Integer userid;
	private String sitename;
	private String productid;
	private String descript;
	private Integer themeid;
	private String themepath;

	private Integer adminthemeid;
	private String icofile;
	private String logofile;
	private String keywords;

	private int point ; //站点积分


	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getSitename() {
		return sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	public String getDescript() {
		return descript;
	}

	public void setDescript(String descript) {
		this.descript = descript;
	}

	public Integer getThemeid() {
		return themeid;
	}

	public void setThemeid(Integer themeid) {
		this.themeid = themeid;
	}

	public Integer getAdminthemeid() {
		return adminthemeid;
	}

	public void setAdminthemeid(Integer adminthemeid) {
		this.adminthemeid = adminthemeid;
	}

	public String getIcofile() {
		return icofile;
	}

	public void setIcofile(String icofile) {
		this.icofile = icofile;
	}

	public String getLogofile() {
		return logofile;
	}

	public void setLogofile(String logofile) {
		this.logofile = logofile;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}


	public String getThemepath() {
		return themepath;
	}

	public void setThemepath(String themepath) {
		this.themepath = themepath;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}


}