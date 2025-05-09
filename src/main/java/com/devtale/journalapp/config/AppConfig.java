package com.devtale.journalapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.MongoTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableTransactionManagement
@EnableScheduling
public class AppConfig {

    @Bean
    public PlatformTransactionManager transactionManager(MongoDatabaseFactory dbFactory){
        return  new MongoTransactionManager(dbFactory);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
