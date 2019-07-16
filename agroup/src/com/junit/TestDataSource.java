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
		ContractVo con=new ContractVo();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String data = sdf.format(new Date());
		con.setCONTime(data);
		con.setCONMoney(15f);
		con.setCONPhotograph("我也不知道");
		con.setCONCid(1);
		con.setCONSid(2);
		con.setCONConstate("已签订");
		contractMapper.addcontract(con);
//		assertNotNull(dataSource);
//		assertNotNull(SqlSessionTemplate);
//		log.debug("---------------------------------------->"+dataSource);
//		log.debug("--------------------------------->"+SqlSessionTemplate);
	}

}
