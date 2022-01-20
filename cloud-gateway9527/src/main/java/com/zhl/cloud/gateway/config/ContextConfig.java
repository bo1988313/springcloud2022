package com.zhl.cloud.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
public class ContextConfig {

    @Bean
    public RouteLocator getRouteLocator(RouteLocatorBuilder builder){
        RouteLocatorBuilder.Builder routers = builder.routes();
        routers.route("j4Builde", r->r.path("/guoji").uri("http://news.baidu.com/guoji")).build();
        return routers.build();
    }
}
