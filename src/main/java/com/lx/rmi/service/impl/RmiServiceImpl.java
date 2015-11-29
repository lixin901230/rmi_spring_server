package com.lx.rmi.service.impl;

import java.rmi.RemoteException;

import com.lx.rmi.service.IRmiService;

/**
 * RMI服务的实现类
 * 注意：从普通ＲＭＩ改编时要注意需要将实现类的extends UnicastRemoteObject去掉，
 * 		否则会报错［org.springframework.beans.factory.BeanCreationException: 
 * 		Error creating bean with name 'refreshService' defined in class path resource [applicationContext.xml]: 
 * 		Initialization of bean failed; nested exception is java.rmi.server.ExportException: object already exported］
 * 		因为UnicastRemoteObject的作用就是生成stub object 
 * @author lixin
 *
 */
public class RmiServiceImpl implements IRmiService {

	public String sayHello(String name) throws RemoteException {
		return "Hello " + name;
    }

}
