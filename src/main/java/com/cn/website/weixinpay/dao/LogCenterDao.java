package com.cn.website.weixinpay.dao;

import com.cn.website.common.dao.BaseDaoSupport;
import com.cn.website.weixinpay.bean.PayWeixinLog;

public interface LogCenterDao extends BaseDaoSupport{
   public long saveWeinxinPayLog(PayWeixinLog log);
}
