package ru.msu.cmc.webprack;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@PropertySource("classpath:application.properties")
public class HibernateDatabaseConfig {
    @Value("org.postgresql.Driver")
    private String DB_DRIVER;
    @Value("jdbc:postgresql://localhost/java")
    private String DB_URL;
    @Value("postgres")
    private String DB_USERNAME;
    @Value("password")
    private String DB_PASSWORD;

}
