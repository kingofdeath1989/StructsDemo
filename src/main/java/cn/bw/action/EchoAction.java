package cn.bw.action;

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
		return "echo:"+msg;
	}
	
}