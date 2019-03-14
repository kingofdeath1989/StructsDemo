package cn.bw.action;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class EchoAction extends ActionSupport{

	private String msg ;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String execute() throws Exception{
		//内置对象
//		HttpServletRequest request = ServletActionContext.getRequest();
//		HttpServletResponse response = ServletActionContext.getResponse();
//		ServletContext application = ServletActionContext.getServletContext();
//		HttpSession session = request.getSession() ;
//		
//		String contextPath = request.getContextPath();
//		String contentType = request.getContentType();
//		String realPath = application.getRealPath("/");
//		String sessionId = session.getId();
//		System.out.println(contextPath);
//		System.out.println(contentType);
//		System.out.println(realPath);
//		System.out.println(sessionId);
		
		System.out.println(super.getText("pages.success"));
		System.out.println(super.getText("info.msg", new String[] {"你好","我是","liyue"}));
		
		return "echo.page";
//		Action.SUCCESS
//		Action.ERROR
	}
	
}
