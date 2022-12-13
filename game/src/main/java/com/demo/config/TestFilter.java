package com.demo.config;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;


@Component
@WebFilter(urlPatterns = "/*")
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("过滤器执行 init 方法。。。。");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("过滤器开始执行 doFilter方法。。。。。。 ");

        chain.doFilter(request,response);

        System.out.println("过滤器执行结束doFilter 方法。。。。。");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器执行 destroy 销毁方法。。。。");
    }
}
