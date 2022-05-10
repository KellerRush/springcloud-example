package com.kellerrush.springboot.config;

import com.kellerrush.springboot.domain.Computer;
import com.kellerrush.springboot.domain.Person;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.ConditionalOnDiscoveryEnabled;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@ConditionalOnDiscoveryEnabled
@Configuration
public class BeanConfig {


    @Bean
    public Computer computer1(){
        return new Computer("笔记本电脑");
    }

    @Bean
    @ConditionalOnMissingBean
    public Computer computer2(){
        return new Computer("备用电脑");
    }

    @Bean
    @ConditionalOnMissingBean
    public Person person1(){
        return new Person("linux");
    }

}
