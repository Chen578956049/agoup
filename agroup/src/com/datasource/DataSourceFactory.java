package com.datasource;

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
 * 创建数据源工厂类
 */
@Component
@PropertySource("classpath:dbdatasource.properties")
//@ComponentScan("com.datasource")
@MapperScan("com.mapper")
public class DataSourceFactory {
	
	//数据库连接配置文件的属性注入
	@Value("${driverClass}")
	private String driver;
	
	@Value("${connectionURL}")
	private String url;
	
	@Value("${uname}")
	private String user;
	
	@Value("${password}")
	private String psw;
	
	@Bean
	//创建c3p0数据源工厂
	public ComboPooledDataSource comboPooledDataSource() {
		return new ComboPooledDataSource();
	}
	
	@Bean
	//创建spring jdbc数据源工厂
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
	 * 创建SqlSessionFactoryBean
	 * 通过Configuration类 完成mybatis-config.xml配置文件的相关信息加载
	 */
	@Bean
	@Autowired
	//@Qualifier("c3p0DataSource") //注入的是哪个数据源
	public SqlSessionFactory sqlSessionFactory(DataSource driverManagerDataSource) {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		
		Configuration configuration=new Configuration();
		configuration.setAggressiveLazyLoading(true);
		configuration.setCacheEnabled(true);
		configuration.setDefaultFetchSize(2000);
		configuration.setLazyLoadingEnabled(false);
		configuration.setLogImpl(Log4j2Impl.class);
		configuration.setMapUnderscoreToCamelCase(true);
		
		//数据源注入
		factory.setDataSource(driverManagerDataSource);
		
		//注入MyBatis核心配置信息
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
	
	
	
	
	
	
}
