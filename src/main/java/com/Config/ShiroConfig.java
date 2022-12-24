package com.Config;

import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.LinkedHashMap;

@Configuration
public class ShiroConfig {
    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(@Qualifier("SecurityManager")DefaultWebSecurityManager SecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(SecurityManager);
        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        /*stringStringLinkedHashMap.put("")*/
        shiroFilterFactoryBean.getFilterChainDefinitionMap();
        return shiroFilterFactoryBean;
    }

   @Bean("SecurityManager")
    public DefaultWebSecurityManager SecurityManager(@Qualifier("getUserRealm")UserRealm userRealm){
        DefaultWebSecurityManager SecurityManager = new DefaultWebSecurityManager();
        //关联userRealm
        SecurityManager.setRealm(getUserRealm());
        return SecurityManager;
    }

    @Bean("getUserRealm")
    public UserRealm getUserRealm(){
        return new UserRealm();
    }
}
