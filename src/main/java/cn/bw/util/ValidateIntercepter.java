package cn.bw.util;

import java.lang.reflect.Field;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ValidateIntercepter extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object actionObject = invocation.getAction();
		String uri = ServletActionContext.getRequest().getRequestURI();
		if (uri != null) {
			uri = uri.substring(uri.lastIndexOf("!") + 1, uri.lastIndexOf("."));
			String filedName = uri + "Rule";
			try {
				Field fieldRule = actionObject.getClass().getDeclaredField(filedName);
				fieldRule.setAccessible(true);
				String rule = (String) fieldRule.get(actionObject);
				validateUtil.validate(actionObject, rule, invocation.getInvocationContext().getParameters());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
