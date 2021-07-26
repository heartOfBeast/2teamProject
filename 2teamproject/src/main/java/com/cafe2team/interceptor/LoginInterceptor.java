package com.cafe2team.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component
public class LoginInterceptor implements HandlerInterceptor{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) 
			throws Exception {
		
		HttpSession session = request.getSession();
		String sessionId = (String) session.getAttribute("SID");
		String sessionLevel = (String) session.getAttribute("SLEVEL");
		String requestUri = request.getRequestURI();
		
		
		if(sessionId == null) {
			response.sendRedirect("/");
			
			return false;
		}else {
			if("사업자".equals(sessionLevel)) {
				if(	requestUri.indexOf("memberList") > -1 ||
					requestUri.indexOf("adminWaiting") > -1 ||
					requestUri.indexOf("accountInquiry") > -1 ||
					requestUri.indexOf("addWarehouse") > -1 ||
					requestUri.indexOf("warehouseList") > -1 ||
					requestUri.indexOf("currentSalesState") > -1 ||
					requestUri.indexOf("expenditure") > -1 ||
					requestUri.indexOf("expenditureinsert") > -1 ||
					requestUri.indexOf("calculate") > -1 ||
					requestUri.indexOf("stockList") > -1 ||
					requestUri.indexOf("stockCheckList") > -1 ||
					requestUri.indexOf("stockCheckInsert") > -1 ||
					requestUri.indexOf("shoppingmallApproval") > -1 ||
					requestUri.indexOf("contractApproval") > -1 ||
					requestUri.indexOf("calendar") > -1 ||
					requestUri.indexOf("receivingRequestWaiting") > -1 ||
					requestUri.indexOf("receivingWarehouseStatus") > -1 ||
					requestUri.indexOf("releaseOrder") > -1 ||
					requestUri.indexOf("safetyCheckAdd") > -1 ||
					requestUri.indexOf("safetyCheck") > -1 ||
					requestUri.indexOf("vehicleAdd") > -1 ||
					requestUri.indexOf("estimateAnother") > -1 ||
					requestUri.indexOf("estimatePermit") > -1
					) {
					
					
					
					response.sendRedirect("/main");
					
					return false;
				}
			}
			
		}
		
		return true;
		
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
