package com.cn.website.weixinpay.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.springframework.stereotype.Repository;

import com.cn.website.common.dao.impl.BaseDaoSupportImpl;
import com.cn.website.weixinpay.bean.WeixinPayConfig;

@Repository("weixinPayDaoImpl")
public class WeixinPayDaoImpl extends BaseDaoSupportImpl implements WeixinPayDao{

	@Override
	public WeixinPayConfig getWeixinCfg(long lCompanyID, String sAdCode) {
		DetachedCriteria query = DetachedCriteria.forClass(WeixinPayConfig.class)
				.add(Property.forName("lCompanyCode").eq(lCompanyID))
				.add(Property.forName("sAdCode").eq(sAdCode));
		Session session = currentSession();
		WeixinPayConfig config = (WeixinPayConfig) query.getExecutableCriteria(session).uniqueResult();
		return config;
	}
}
