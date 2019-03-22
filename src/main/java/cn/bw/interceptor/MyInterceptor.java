package cn.bw.interceptor;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{
	
	private String pname ;
	
	private String sname ;
	
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void init() {
		System.out.println("初始化【init】.......");
	}
	
	public void destroy() {
		System.out.println("销毁【destroy】.......");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println(this.getPname()+":"+this.getSname());
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
		System.out.println("拦截器执行之前-----------------");
		System.out.println("拦截器执行：：：：：：：：：：：");
		String res = invocation.invoke() ;//此处就是Action的返回值
		ServletActionContext.getResponse().setCharacterEncoding("UTF-8");
		System.out.println("拦截器执行之后-----------------");
		System.out.println("res="+res);
		return "error.page";
	}

}
