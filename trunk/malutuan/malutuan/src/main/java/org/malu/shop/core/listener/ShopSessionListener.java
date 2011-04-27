package org.malu.shop.core.listener;



import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import org.malu.eop.core.resource.model.EopSite;
import org.malu.framework.context.spring.SpringContextHolder;
import org.malu.framework.context.webcontext.ThreadContextHolder;
import org.malu.shop.core.service.ICartManager;

public class ShopSessionListener implements HttpSessionListener {


	public void sessionCreated(HttpSessionEvent se) {

	}


	public void sessionDestroyed(HttpSessionEvent se) {
		String sessionid = se.getSession().getId();
		EopSite site  =(EopSite)ThreadContextHolder.getSessionContext().getAttribute("site_key");

		if(site!=null){
		ICartManager cartManager = SpringContextHolder.getBean("cartManager");
		cartManager.clean(sessionid,site.getUserid(),site.getId());
		System.out.println("cart clean...");
		}
	}

}
