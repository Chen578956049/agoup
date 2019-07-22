package com.datasource;

<<<<<<< HEAD
import javax.sql.DataSource;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * åˆ›å»ºæ•°æ®æºå·¥åŽ‚ç±»
 */
@Component
@PropertySource("classpath:dbdatasource.properties")
//@ComponentScan("com.datasource")
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.mapper")
public class DataSourceFactory {
	
	//æ•°æ®åº“è¿žæŽ¥é…ç½®æ–‡ä»¶çš„å±žæ€§æ³¨å…¥
	@Value("${driverClass}")
	private String driver;
	
	@Value("${connectionURL}")
	private String url;
	
	@Value("${uname}")
	private String user;
	
	@Value("${password}")
	private String psw;
	
	@Bean
	//åˆ›å»ºc3p0æ•°æ®æºå·¥åŽ‚
	public ComboPooledDataSource comboPooledDataSource() {
		return new ComboPooledDataSource();
	}
	
	@Bean
	//åˆ›å»ºspring jdbcæ•°æ®æºå·¥åŽ‚
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource datasource
		=new DriverManagerDataSource();
		
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(user);
		datasource.setPassword(psw);
		return datasource;
	}
	
	/*
	 * åˆ›å»ºSqlSessionFactoryBean
	 * é€šè¿‡Configurationç±» å®Œæˆmybatis-config.xmlé…ç½®æ–‡ä»¶çš„ç›¸å…³ä¿¡æ¯åŠ è½½
	 */
	@Bean
	@Autowired
	//@Qualifier("c3p0DataSource") //æ³¨å…¥çš„æ˜¯å“ªä¸ªæ•°æ®æº
	public SqlSessionFactory sqlSessionFactory(DataSource driverManagerDataSource) {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		
		Configuration configuration=new Configuration();
		configuration.setAggressiveLazyLoading(true);
		configuration.setCacheEnabled(true);
		configuration.setDefaultFetchSize(2000);
		configuration.setLazyLoadingEnabled(false);
		configuration.setLogImpl(Log4j2Impl.class);
		configuration.setMapUnderscoreToCamelCase(true);
		
		//æ•°æ®æºæ³¨å…¥
		factory.setDataSource(driverManagerDataSource);
		
		//æ³¨å…¥MyBatisæ ¸å¿ƒé…ç½®ä¿¡æ¯
		factory.setConfiguration(configuration);
		
			SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = factory.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	
	@Bean
	@Autowired
	//@Qualifier("factoryBean")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	
	//
	@Bean
	public DataSourceTransactionManager transactionManager(DataSource driverManagerDataSource) {
		DataSourceTransactionManager transactionManager
		=new DataSourceTransactionManager(driverManagerDataSource);
		return transactionManager;
=======
import javax.annotation.Resource;
import javax.sql.DataSource;

import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/*
 * ´´½¨Êý¾ÝÔ´¹¤³§Àà
 */
@Component
@PropertySource("classpath:dbdatasource.properties")
//@ComponentScan("com.datasource")
@MapperScan("com.mapper")
public class DataSourceFactory {
	
	//Êý¾Ý¿âÁ¬½ÓÅäÖÃÎÄ¼þµÄÊôÐÔ×¢Èë
	@Value("${driverClass}")
	private String driver;
	
	@Value("${connectionURL}")
	private String url;
	
	@Value("${uname}")
	private String user;
	
	@Value("${password}")
	private String psw;
	
	@Bean
	//´´½¨c3p0Êý¾ÝÔ´¹¤³§
	public ComboPooledDataSource comboPooledDataSource() {
		return new ComboPooledDataSource();
	}
	
	@Bean
	//´´½¨spring jdbcÊý¾ÝÔ´¹¤³§
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource datasource
		=new DriverManagerDataSource();
		
		datasource.setDriverClassName(driver);
		datasource.setUrl(url);
		datasource.setUsername(user);
		datasource.setPassword(psw);
		return datasource;
	}
	
	/*
	 * ´´½¨SqlSessionFactoryBean
	 * Í¨¹ýConfigurationÀà Íê³Émybatis-config.xmlÅäÖÃÎÄ¼þµÄÏà¹ØÐÅÏ¢¼ÓÔØ
	 */
	@Bean
	@Autowired
	//@Qualifier("c3p0DataSource") //×¢ÈëµÄÊÇÄÄ¸öÊý¾ÝÔ´
	public SqlSessionFactory sqlSessionFactory(DataSource driverManagerDataSource) {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		
		Configuration configuration=new Configuration();
		configuration.setAggressiveLazyLoading(true);
		configuration.setCacheEnabled(true);
		configuration.setDefaultFetchSize(2000);
		configuration.setLazyLoadingEnabled(false);
		configuration.setLogImpl(Log4j2Impl.class);
		configuration.setMapUnderscoreToCamelCase(true);
		
		//Êý¾ÝÔ´×¢Èë
		factory.setDataSource(driverManagerDataSource);
		
		//×¢ÈëMyBatisºËÐÄÅäÖÃÐÅÏ¢
		factory.setConfiguration(configuration);
		
			SqlSessionFactory sqlSessionFactory = null;
		try {
			sqlSessionFactory = factory.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	
	@Bean
	@Autowired
	//@Qualifier("factoryBean")
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
>>>>>>> refs/remotes/origin/master
	}
	
	
	
	
	
	
}
