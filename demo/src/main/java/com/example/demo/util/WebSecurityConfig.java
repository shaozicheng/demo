package com.example.demo.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


//@Configuration
//public class WebSecurityConfig implements WebMvcConfigurer{
//	
//	/**
//     * 登录session key
//     */
//    public final static String SESSION_KEY = "user";
//    
//	@Autowired
//    private RedisTemplate<String, String> redisTemplate;
//    
//    @Bean
//    public SecurityInterceptor getSecurityInterceptor() {
//        return new SecurityInterceptor();
//    }
//    public void addInterceptors(InterceptorRegistry registry) {
//        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
//        // 排除配置
//        addInterceptor.excludePathPatterns("/account/login**");
//        addInterceptor.excludePathPatterns("/photo/select**");
//        addInterceptor.excludePathPatterns("/static/**");
//        // 拦截配置
//        addInterceptor.addPathPatterns("/**");
//    }
//    private class SecurityInterceptor extends HandlerInterceptorAdapter {
//        @Override
//        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//                throws Exception {
//            HttpSession session = request.getSession();
//            if (session.getAttribute(SESSION_KEY) != null){
//            	
//            	String id =redisTemplate.opsForValue().get(session.getAttribute(SESSION_KEY));
//            	if(id.equals(session.getId())){
//            		return true;
//            	}
//            	
//            }
//              
//            // 跳转登录
//            String url = "/account";//等待前台给出
//            response.sendRedirect(url);
//            return false;
//        }
//    }
//
//}
