package com.example.apachecameldemo.service;

import org.apache.camel.builder.RouteBuilder;

public class QueueService extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:pedidos")
                .to("activemq:queue:pedidos");
    }
}
