package org.tutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan // Tell Spring to scan for Components
public class Application {

    // Defining a Bean without annotation
    // All @Bean annotated functions are called by Spring framework and is stored in IOC container
    // By default @Bean creates Singletons
    /*@Bean
    @Scope("prototype")
    public HelloSpring getHelloSpring(){
        return new HelloSpring();
    }*/
}
