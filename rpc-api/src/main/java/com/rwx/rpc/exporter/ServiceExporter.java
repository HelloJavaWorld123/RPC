package com.rwx.rpc.exporter;

import com.caucho.hessian.server.HessianServlet;
import com.rwx.rpc.service.HelloService;

/**
 * @author : RXK
 * Date : 2019/10/31 19:01
 * Desc:
 */
public class ServiceExporter {

	public HessianServlet hessianServlet(){
		HessianServlet servlet = new HessianServlet();
		servlet.setService(HelloService.class);
		servlet.setDebug(true);
		return servlet;
	}

}
