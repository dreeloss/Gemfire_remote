package org.springframework.data.gemfire;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gemstone.gemfire.cache.server.CacheServer;

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println(Main.class.getResource("/Beans.xml"));
		//this.getClass().getResourceAsStream("/resources/Beans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext(Main.class.getResource("/Beans.xml").toString());
		//ApplicationContext context = new ClassPathXmlApplicationContext("file:resources/Beans.xml");
		CacheServer server = context.getBean(CacheServer.class);
		System.out.println("server running on port " + server.getPort());
	}
}
