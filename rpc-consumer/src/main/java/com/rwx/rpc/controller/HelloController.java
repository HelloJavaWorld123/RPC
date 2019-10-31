package com.rwx.rpc.controller;

import com.caucho.hessian.client.HessianProxyFactory;
import com.rwx.rpc.service.HelloService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;

/**
 * @author : RXK
 * Date : 2019/10/31 15:49
 * Desc:
 */
@RestController
@RequestMapping("/api")
public class HelloController {

	private String uri = "http://127.0.0.1:18888/helloService";

	@PostMapping("/hello")
	public ResponseEntity<String> remoteApi() {
		String result = null;
		HessianProxyFactory factory = new HessianProxyFactory();
		try {
			HelloService service  = (HelloService) factory.create(HelloService.class, uri);
			result = service.sayHello("first RPC ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(result);
	}


}
