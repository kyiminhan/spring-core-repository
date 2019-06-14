package com.core.java.spring.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

/**
 * The Class AppConfig.</BR>
 *
 * @author kyiminhan </BR>
 * @version 1.0 </BR>
 * @since 2019/06/14 </BR>
 * spring-core-mybatis-001 system </BR>
 * com.core.java.spring.config </BR>
 * AppConfig.java </BR>
 */
@Configuration
@ComponentScan(basePackages = "com.core.java")
@MapperScan(basePackages = { "com.core.java.spring.dao.mapper" })
public class AppConfig {
	@Bean
	public DataSource getDataSource() {
		final BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/kmh_test_db?serverTimezone=JST&useSSL=false");
		dataSource.setUsername("root");
		dataSource.setPassword("rootR00T");
		return dataSource;
	}

	@Bean
	public DataSourceTransactionManager getDataSourceTransactionManager() {
		return new DataSourceTransactionManager(this.getDataSource());
	}

	@Bean
	public SqlSessionFactory getSqlSessionFactoryBean() throws Exception {
		final SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(this.getDataSource());
		sqlSessionFactoryBean.setTypeAliasesPackage("com.core.java.spring.entity");
		final Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
		sqlSessionFactoryBean.setMapperLocations(resources);
		return sqlSessionFactoryBean.getObject();
	}
}