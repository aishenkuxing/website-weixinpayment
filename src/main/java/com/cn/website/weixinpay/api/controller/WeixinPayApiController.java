package com.cn.website.weixinpay.api.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.website.common.util.PDescHelper;
import com.cn.website.weixinpay.bean.PayWeixinLog;
import com.cn.website.weixinpay.bean.WeixinPayConfig;
import com.cn.website.weixinpay.service.WeixinPayService;
import com.cn.website.weixinpay.util.WXPayUtil;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("api/weixinpay")
public class WeixinPayApiController {
	
	@Autowired
	private WeixinPayService weixinPayServiceImpl;
	
	
	private PayWeixinLog GetLog(long id) throws InterruptedException{
		 PayWeixinLog renLog = weixinPayServiceImpl.getLog(id);
		 if(!StringUtils.isEmpty(renLog.getData())){
	        	return renLog;
	        }else{
	        	Thread.sleep(6000);
	        	return GetLog(id);
	        }
	}
	
	@RequestMapping(value = "SavePayMent")
	@ApiOperation(value = "回调信息", httpMethod = "POST", notes = "回调信息",tags="腾讯微信支付")
	public String SavePayMent(String sCompanyID, String sAdCode,HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		long lCompanyID = 100;
        
		sAdCode = "01";
        
        WeixinPayConfig config = weixinPayServiceImpl.getWeixinCfg(lCompanyID, sAdCode);
        
        
		
//		
//		Map<String,String> notifyData = new HashMap<String,String>();
//        notifyData.put("return_msg", "公司未查询到相关失败");
//		notifyData.put("return_code", "FAIL");
//		PayWeixinLog log = new PayWeixinLog();
//		String result = "";//返回给微信的处理结果  
//        String inputLine="";  
//        String notityXml = "";  
//        request.setCharacterEncoding("UTF-8");  
//        response.setCharacterEncoding("UTF-8");  
//        response.setContentType("text/html;charset=UTF-8");  
//        response.setHeader("Access-Control-Allow-Origin", "*");  
//        
//       
//        
//        
//      //微信给返回的东西  
//        try {  
//            while ((inputLine = request.getReader().readLine()) != null) {  
//                notityXml += inputLine;  
//            }  
//            request.getReader().close();  
//        } catch (Exception e) {  
//            e.printStackTrace();  
//            notifyData.put("return_msg", "xml获取失败");
//            notifyData.put("return_code", "FAIL");
//        }  
//        if (StringUtils.isEmpty(notityXml)) {  
//        	notifyData.put("return_msg", "xml为空");
//            notifyData.put("return_code", "FAIL");
//        }  
//        
//        notifyData.put("return_msg", "xml为空");
//        notifyData.put("return_code", "");
//        
//        
//        
//        
//        
//        System.out.println(sCompanyID);
//        System.out.println(sAdCode);
//        System.out.println(notityXml);
//        log.setLogmsg(notityXml);
//        long id = weixinPayServiceImpl.saveNotify(log);
//        
//        String rsn  = GetLog(4).getData();
//        
//        Map<String,String> map =   WXPayUtil.xmlToMap(rsn);
//    
//		  map.put("", value)
//        System.out.println(rsn);
        return "";
	}
	
	@RequestMapping(value = "ResultNotifyPage",method = RequestMethod.POST)
	public String ResultNotifyPage(String sCompanyID, String sAdCode,HttpServletRequest request, HttpServletResponse response) throws Exception{
		Map<String,String> notifyData = new HashMap<String,String>(); 
		//微信给返回的东西  
		String inputLine="";  
		String notityXml = ""; 
		PayWeixinLog log = new PayWeixinLog();
        try {  
            while ((inputLine = request.getReader().readLine()) != null) {  
                notityXml += inputLine;  
            }  
            request.getReader().close();  
        } catch (Exception e) {  
            e.printStackTrace();  
            notifyData.put("return_msg", "xml获取失败");
            notifyData.put("return_code", "FAIL");
        }  
        if (StringUtils.isEmpty(notityXml)) {  
        	notifyData.put("return_msg", "xml为空");
            notifyData.put("return_code", "FAIL");
        }  
        log.setLogmsg(notityXml);
        long id = weixinPayServiceImpl.saveNotify(log);
		return  WXPayUtil.mapToXml(notifyData);
	}
}
