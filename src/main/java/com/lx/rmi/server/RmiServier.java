package com.lx.rmi.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Rmi 服务接口发布
 * 
 * @author lixin
 *
 */
public class RmiServier {
	
	public static ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
	
	public static void main(String[] args) {
		// 启动服务端应用
		ctx.start();
		System.out.println("RMI 服务启动成功！");
	}
}
