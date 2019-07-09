package com.junit;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.datasource.DataSourceFactory;

public class TestDataSource {
	
	private static AnnotationConfigApplicationContext context;
	private DataSource dataSource;
	private SqlSessionTemplate SqlSessionTemplate;
	
	private static Logger log = LogManager.getLogger();
	
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
		dataSource = context.getBean("comboPooledDataSource", DataSource.class);
		SqlSessionTemplate = context.getBean("sqlSessionTemplate", SqlSessionTemplate.class);
	}

	@Test
	public void test() {
		assertNotNull(dataSource);
		assertNotNull(SqlSessionTemplate);
		log.debug("---------------------------------------->"+dataSource);
		log.debug("--------------------------------->"+SqlSessionTemplate);
		
	}

}
