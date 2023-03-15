package com.tutorialspoint.demo;

import java.io.IOException;

/*
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
*/
import jakarta.servlet.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleFilter implements Filter {

   protected Logger logger = LoggerFactory.getLogger(this.getClass());

   @Override
   public void destroy() {}

   @Override
   public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterchain)
      throws IOException, ServletException {

      logger.info("Server filter -> Remote Host: " + request.getRemoteHost());
      logger.info("Server filter -> Remote Address: "+request.getRemoteAddr());
      filterchain.doFilter(request, response);
   }

   @Override
   public void init(FilterConfig filterconfig) throws ServletException {}
}