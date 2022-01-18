package com.zhl.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Administrator
 */
@Configuration
public class IRuleConfig {

    @Bean
    public IRule getIRule(){
        return new MyRule();
    }
}
