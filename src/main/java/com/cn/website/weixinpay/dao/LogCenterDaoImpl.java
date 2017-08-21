package com.cn.website.weixinpay.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.cn.website.common.dao.impl.BaseDaoSupportImpl;
import com.cn.website.weixinpay.bean.PayWeixinLog;

@Repository("logCenterDaoImpl")
public class LogCenterDaoImpl extends BaseDaoSupportImpl implements LogCenterDao{

	@Override
	public long saveWeinxinPayLog(PayWeixinLog log) {
		Session session = currentSession();
		long id = (long) session.save(log);
		return id;
	}
	
}
