package cn.bw.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.bw.vo.News;

public class NewsAction extends ActionSupport{

	private String insertRule = "news.nid:int|news.title:string|news.content:string|news.pubdate:date" ;
	private String updateRule = "news.nid:int|news.title:string|news.content:string|news.pubdate:date" ;
	private String deleteRule = "news.nid:int" ;
	
	private News news = new News();

	public News getNews() {
		return news;
	}
	
	public String insert() {
		System.out.println("【新闻增加】" + this.news);
		return "news.show";
	}
	public String update() {
		System.out.println("【新闻修改】" + this.news);
		return "news.show";
	}
	public String delete() {
		System.out.println("【新闻删除】" + this.news);
		return "news.show";
	}
	
//	public void insert() {
//	}

//	@Override
//	public void validate() {
//		System.out.println(super.getText("data.null"));
//		super.addFieldError("news.nid", super.getText("data.null",new String[] {"新闻编号"}));
//		super.addFieldError("news.title",super.getText("data.null", new String[] { "新闻标题" }));
		
		
//		if(this.news.getNid() == null) {
//			super.addFieldError("news.nid", super.getText("data.null",new String[] {"新闻编号"}));
//		}
//		if (this.news.getNid() == null) { // 没有新闻编号
//			super.addFieldError("news.nid",
//					super.getText("data.null", new String[] { "新闻编号" }));
//		}
//		if (this.news.getTitle() == null || "".equals(this.news.getTitle())) {
//			super.addFieldError("news.title",
//					super.getText("data.null", new String[] { "新闻标题" }));
//		}
//		if (this.news.getPubdate() == null) {
//			super.addFieldError("news.pubdate",
//					super.getText("data.null", new String[] { "发布日期" }));
//		}
//	}
	
}
