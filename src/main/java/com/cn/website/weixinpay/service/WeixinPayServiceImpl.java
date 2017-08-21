package com.cn.website.weixinpay.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cn.website.weixinpay.bean.PayWeixinLog;
import com.cn.website.weixinpay.bean.WeixinPayConfig;
import com.cn.website.weixinpay.dao.LogCenterDao;
import com.cn.website.weixinpay.dao.WeixinPayDao;


@Service("weixinPayServiceImpl")
@Transactional
public class WeixinPayServiceImpl implements WeixinPayService {

	@Autowired
	@Qualifier("logCenterDaoImpl")
	private LogCenterDao logCenterDaoImpl;
	
	@Autowired
	@Qualifier("weixinPayDaoImpl")
	private WeixinPayDao weixinPayDaoImpl;
	
	@Override
	public long saveNotify(PayWeixinLog log) {
		long id = logCenterDaoImpl.saveWeinxinPayLog(log);
		Map<String, String> notifyData = new HashMap<String, String>();
		return id;
	}

	@Override
	public PayWeixinLog getLog(long id) {
		PayWeixinLog log = logCenterDaoImpl.get(PayWeixinLog.class, id);
		return log;
	}

	@Override
	public WeixinPayConfig getWeixinCfg(long lCompanyID, String sAdCode) {
		return weixinPayDaoImpl.getWeixinCfg(lCompanyID, sAdCode);
	}

	
}
