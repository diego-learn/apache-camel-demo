package com.example.apachecameldemo;

import org.apache.camel.CamelContext;
import org.apache.camel.component.activemq.ActiveMQComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ApacheCamelDemoApplication {

    @Autowired
    private CamelContext camelContext;

    public static void main(String[] args) {
        SpringApplication.run(ApacheCamelDemoApplication.class, args);
    }


    @PostConstruct
    public void init() throws Exception {

        camelContext.addComponent("dddd", ActiveMQComponent.activeMQComponent("tcp://ipfila"));
    }

}
