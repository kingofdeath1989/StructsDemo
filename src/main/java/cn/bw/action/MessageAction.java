package cn.bw.action;

import com.opensymphony.xwork2.ActionSupport;

public class MessageAction extends ActionSupport {
	private String msg;

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void insert() {
		System.out.println("输入的信息是：" + msg);
	}

}
