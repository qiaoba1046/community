package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.service.AlphaService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

//@RunWith(SpringRunner.class)
@SpringBootTest
//@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests implements ApplicationContextAware {
	@Autowired
	@Qualifier("alphaDaoHibernatelmpl")
	private AlphaDao alphaDao;
	@Autowired
	private ApplicationContext applicationContext;

	@Autowired
	private AlphaService alphaService;

	@Autowired
	private SimpleDateFormat simpleDateFormat;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
	}

	@Test
	void contextLoads() {
		System.out.println(applicationContext);
		System.out.println(alphaDao.select());
	}

	@Test
	public void testBeanManagement(){
		System.out.println(alphaService);
		System.out.println(alphaService);
	}

	@Test
	public void testBeanConfig(){
		System.out.println(simpleDateFormat.format(new Date()));
	}
}
