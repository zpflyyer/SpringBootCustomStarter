package com.customstarter.autoconfig;

import com.customstarter.person.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PersonProperties.class)//EnableConfigurationProperties能够实现注册Bean
@ConditionalOnClass(Person.class)
public class PersonAutoConfiguration {
    @Autowired
    PersonProperties personProperties;

    @Bean
    @ConditionalOnMissingBean
    public Person person(){
        return new Person(personProperties.getName(), personProperties.getAge());
    }
//    public static void main(String[] args) {
//        SpringApplication.run(PersonAutoConfiguration.class,args);
//    }
}
