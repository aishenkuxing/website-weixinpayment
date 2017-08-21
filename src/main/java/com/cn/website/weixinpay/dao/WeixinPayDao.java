package com.cn.website.weixinpay.dao;

import com.cn.website.common.dao.BaseDaoSupport;
import com.cn.website.weixinpay.bean.WeixinPayConfig;

public interface WeixinPayDao extends BaseDaoSupport{

	public WeixinPayConfig getWeixinCfg(long lCompanyID, String sAdCode);
	
}
