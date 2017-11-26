package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.service.FnService;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes= {SampleBean.class})
public class ConfigApplicationContextTests {
	@Autowired
	private ApplicationContext applicationContext;
	@Autowired
	private SampleBean sampleBean;
	/**要引入多个bean,怎么解决报错：1.需要在@ContextConfiguration(classes= {Bean方法名.class，Bean方法名.class})
	                                                                           把方法文件放到classes里以逗号隔开  。
	                        2.被引入的bean方法上要加@ComponentScan("com.example")，表示会扫描该文件夹下的所有文件，方法上有@ContextCon注解的bean
	                       
	                       
	                       */
	@Autowired
	private FnService fnService;

	@Test
	public void say() {
		System.out.println("Hello");
		assertNotNull(applicationContext);
	}
	
	@Test
	public void testFn() {
		assertEquals(3, fnService.add(1, 2));
	}

}



