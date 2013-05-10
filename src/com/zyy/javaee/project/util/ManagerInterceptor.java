package com.zyy.javaee.project.util;

import javax.servlet.http.HttpServletRequest;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

public class ManagerInterceptor implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		HttpServletRequest request = null;
		ActionMapping mapping = null;
		Object[] args = invocation.getArguments();
		 for(int i=0;i<args.length;i++){
			 if (args[i] instanceof HttpServletRequest) {request = (HttpServletRequest)args[i];}
			 if (args[i] instanceof ActionMapping){mapping = (ActionMapping)args[i];}
		 }
		 String current_manager = (String)request.getSession().getAttribute("current_manager");
		 if(current_manager!=null){
			 return invocation.proceed();
		 }else {
			// return mapping.
			 return null;
		 }
		
	}

}
