package com.rwx.rpc.impl;

import com.rwx.rpc.service.HelloService;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @author : RXK
 * Date : 2019/10/31 14:58
 * Desc: 提供方相关类的实现
 */
@Service
public class HelloServiceImpl implements HelloService , Serializable {

	public String sayHello(String param) {
		return null;
	}
}
