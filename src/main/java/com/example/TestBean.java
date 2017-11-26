package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.pojo.iphone;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {iphone.class})
public class TestBean {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Test
	public void say() {
		System.out.println("Hi");
		assertNotNull(applicationContext);
	}
	

}
