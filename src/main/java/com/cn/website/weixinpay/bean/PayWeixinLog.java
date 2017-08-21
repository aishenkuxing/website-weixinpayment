package com.cn.website.weixinpay.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="pay_weixin_log")
public class PayWeixinLog {
	
   @Id
   @Column(name="id")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
  
   @Column(name="log_msg")
   private String logmsg;
  
   @Column(name="data")
   private String data;

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getLogmsg() {
		return logmsg;
	}
	
	public void setLogmsg(String logmsg) {
		this.logmsg = logmsg;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
  
 
  
}
