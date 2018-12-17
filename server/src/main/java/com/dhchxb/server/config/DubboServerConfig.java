package com.dhchxb.server.config;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.rpc.*;
import com.dhchxb.server.filter.DubboInvokeFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:dhc
 * @Description:
 * @Date:Create in 11:11 AM 2018/12/14
 * @Modified By:
 */
@Configuration
public class DubboServerConfig {

        @Bean
        public ApplicationConfig applicationConfig() {
            ApplicationConfig applicationConfig = new ApplicationConfig();
            applicationConfig.setName("server");

            return applicationConfig;
        }

        @Bean
        public RegistryConfig registryConfig() {
            RegistryConfig registryConfig = new RegistryConfig();
            registryConfig.setAddress("zookeeper://127.0.0.1:2181");
            registryConfig.setClient("curator");
            return registryConfig;
        }

        @Bean
        public Filter invokeFilter(){
            return new DubboInvokeFilter();
        }
}
