package com.junit;

import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.datasource.DataSourceFactory;
import com.mapper.ContractMapper;
import com.service.clientservice.impl.ClientServiceImpl;
import com.vo.ContractVo;

public class TestDataSource {
	
	private static AnnotationConfigApplicationContext context;
	private DataSource dataSource;
	private SqlSessionTemplate SqlSessionTemplate;
	
	private static Logger log = LogManager.getLogger();
	private static ContractMapper contractMapper;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		context = new AnnotationConfigApplicationContext(DataSourceFactory.class);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		context.registerShutdownHook();
	}
	
	@Before
	public void setUp() {
		contractMapper =context.getBean("contractMapper",ContractMapper.class);
	}

	@Test
	public void test() {
		ClientServiceImpl c=new ClientServiceImpl();
		c.StateClientUpdate(1, "WE");
	}

}
