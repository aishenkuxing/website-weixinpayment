package com.cn.website.weixinpay.service;

import com.cn.website.weixinpay.bean.PayWeixinLog;
import com.cn.website.weixinpay.bean.WeixinPayConfig;


public interface WeixinPayService {
   
	public long saveNotify(PayWeixinLog log);
   
	public PayWeixinLog getLog(long id);
	
	public WeixinPayConfig getWeixinCfg(long lCompanyID, String sAdCode);
}
