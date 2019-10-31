package com.rwx.rpc.expoter;

import com.rwx.rpc.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.remoting.caucho.HessianServiceExporter;

/**
 * @author : RXK
 * Date : 2019/10/31 15:00
 * Desc: 提供方 服务暴露
 */
public class HessianExporter {

	@Autowired
	private HelloService helloService;

	@Bean(name = "helloService")
	public HessianServiceExporter helloServiceExporter(){
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(helloService);
		exporter.setServiceInterface(HelloService.class);
		return exporter;
	}

}
