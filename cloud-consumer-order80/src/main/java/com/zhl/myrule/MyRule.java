package com.zhl.myrule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Slf4j
public class MyRule implements IRule {
    private ILoadBalancer lb;

    private RoundRobinRule roundRobinRule = null;
    @Override
    public Server choose(Object key) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        log.info(request.getRemoteAddr());
        log.info(request.getRemoteHost());
        log.info(request.getRemotePort() + "");
        synchronized (this){
            if(roundRobinRule == null){
                roundRobinRule = new RoundRobinRule(lb);
            }
        }
        return roundRobinRule.choose(key);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }
}
