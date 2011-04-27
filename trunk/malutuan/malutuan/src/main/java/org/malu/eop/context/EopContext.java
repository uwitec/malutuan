package org.malu.eop.context;



import javax.servlet.http.HttpServletRequest;

import  org.malu.eop.EopSetting;
import  org.malu.eop.core.resource.model.EopSite;

public class EopContext {
	private static ThreadLocal<HttpServletRequest> HttpRequestHolder = new ThreadLocal<HttpServletRequest>();
	private static ThreadLocal<EopContext> EopContextHolder = new ThreadLocal<EopContext>();

	public static void setContext(EopContext context){
		EopContextHolder.set(context);
	}

	public static EopContext getContext(){
		return EopContextHolder.get();
	}

	public static void setHttpRequest(HttpServletRequest request){
		HttpRequestHolder.set(request);
	}


	public static HttpServletRequest getHttpRequest(){
		return HttpRequestHolder.get();
	}

	private EopSite currentSite;
	public  EopSite getCurrentSite(){
		return currentSite;
	}

	public  void setCurrentSite(EopSite site){
		currentSite = site;
	}

	//得到当前站点上下文
	public String getContextPath(){
//		if("2".equals(EopSetting.RUNMODE) ){
//			EopSite site  = this.getCurrentSite();
//			StringBuffer context = new StringBuffer("/user");
//			context.append("/");
//			context.append(site.getUserid());
//			context.append("/");
//			context.append(site.getId());
//			return context.toString();
//		}else{
			return "";
//		}
	}
}
