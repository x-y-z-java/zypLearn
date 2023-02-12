package com.alllearn.aop;

import com.alllearn.config.ZypLogin;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

/**
 * zyp
 * 2022/7/17
 */
@Configuration
public class LoginCheckLogin {
    @Pointcut()
    public void check() {
    
    }

}
