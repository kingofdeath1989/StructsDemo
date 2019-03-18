package cn.bw.action;

import com.opensymphony.xwork2.ActionSupport;

import cn.bw.vo.News;

public class NewsAction extends ActionSupport{

	private News news = new News();

	public News getNews() {
		return news;
	}

	public String insert() {
		System.out.println(this.news);
		return "news.show";
	}

	@Override
	public void validate() {
		System.out.println(super.getText("data.null"));
		
		
		
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
	}
	
}
