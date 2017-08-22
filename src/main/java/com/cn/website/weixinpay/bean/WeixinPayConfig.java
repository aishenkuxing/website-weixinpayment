package com.cn.website.weixinpay.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="a0_weixinpayconfig")
public class WeixinPayConfig implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AutoCode")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long AutoCode;
	
	private String sAppId;
	
	private String sMchId;
	
	private String sKey;
	
	private String sAppSecret;
	
	private String sSSLCertPath;
	
	private String sSSLCertPassword;
	
	private String sNotifyUrl;
	
	private String sIP;
	
	private String ProxyUrl;
	
	private int lReportLevenl;
	
	private int lLogLevenl;
	
	private int bDel;
	
	private long lCompanyCode;
	
	private String sAdCode;
	
	private float lMinute;

	public long getAutoCode() {
		return AutoCode;
	}

	public void setAutoCode(long autoCode) {
		AutoCode = autoCode;
	}

	public String getsAppId() {
		return sAppId;
	}

	public void setsAppId(String sAppId) {
		this.sAppId = sAppId;
	}

	public String getsMchId() {
		return sMchId;
	}

	public void setsMchId(String sMchId) {
		this.sMchId = sMchId;
	}

	public String getsKey() {
		return sKey;
	}

	public void setsKey(String sKey) {
		this.sKey = sKey;
	}

	public String getsAppSecret() {
		return sAppSecret;
	}

	public void setsAppSecret(String sAppSecret) {
		this.sAppSecret = sAppSecret;
	}

	public String getsSSLCertPath() {
		return sSSLCertPath;
	}

	public void setsSSLCertPath(String sSSLCertPath) {
		this.sSSLCertPath = sSSLCertPath;
	}

	public String getsSSLCertPassword() {
		return sSSLCertPassword;
	}

	public void setsSSLCertPassword(String sSSLCertPassword) {
		this.sSSLCertPassword = sSSLCertPassword;
	}

	public String getsNotifyUrl() {
		return sNotifyUrl;
	}

	public void setsNotifyUrl(String sNotifyUrl) {
		this.sNotifyUrl = sNotifyUrl;
	}

	public String getsIP() {
		return sIP;
	}

	public void setsIP(String sIP) {
		this.sIP = sIP;
	}

	public String getProxyUrl() {
		return ProxyUrl;
	}

	public void setProxyUrl(String proxyUrl) {
		ProxyUrl = proxyUrl;
	}

	public int getlReportLevenl() {
		return lReportLevenl;
	}

	public void setlReportLevenl(int lReportLevenl) {
		this.lReportLevenl = lReportLevenl;
	}

	public int getlLogLevenl() {
		return lLogLevenl;
	}

	public void setlLogLevenl(int lLogLevenl) {
		this.lLogLevenl = lLogLevenl;
	}

	public int getbDel() {
		return bDel;
	}

	public void setbDel(int bDel) {
		this.bDel = bDel;
	}

	public String getsAdCode() {
		return sAdCode;
	}

	public void setsAdCode(String sAdCode) {
		this.sAdCode = sAdCode;
	}

	public float getlMinute() {
		return lMinute;
	}

	public void setlMinute(float lMinute) {
		this.lMinute = lMinute;
	}

	public long getlCompanyCode() {
		return lCompanyCode;
	}

	public void setlCompanyCode(long lCompanyCode) {
		this.lCompanyCode = lCompanyCode;
	}
	
	
}
