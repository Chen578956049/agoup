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
 * ��������Դ������
 */
@Component
@PropertySource("classpath:dbdatasource.properties")
//@ComponentScan("com.datasource")
@MapperScan("com.mapper")
public class DataSourceFactory {
	
	//���ݿ����������ļ�������ע��
	@Value("${driverClass}")
	private String driver;
	
	@Value("${connectionURL}")
	private String url;
	
	@Value("${uname}")
	private String user;
	
	@Value("${password}")
	private String psw;
	
	@Bean
	//����c3p0����Դ����
	public ComboPooledDataSource comboPooledDataSource() {
		return new ComboPooledDataSource();
	}
	
	@Bean
	//����spring jdbc����Դ����
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
	 * ����SqlSessionFactoryBean
	 * ͨ��Configuration�� ���mybatis-config.xml�����ļ��������Ϣ����
	 */
	@Bean
	@Autowired
	//@Qualifier("c3p0DataSource") //ע������ĸ�����Դ
	public SqlSessionFactory sqlSessionFactory(DataSource driverManagerDataSource) {
		SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
		
		Configuration configuration=new Configuration();
		configuration.setAggressiveLazyLoading(true);
		configuration.setCacheEnabled(true);
		configuration.setDefaultFetchSize(2000);
		configuration.setLazyLoadingEnabled(false);
		configuration.setLogImpl(Log4j2Impl.class);
		configuration.setMapUnderscoreToCamelCase(true);
		
		//����Դע��
		factory.setDataSource(driverManagerDataSource);
		
		//ע��MyBatis����������Ϣ
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
