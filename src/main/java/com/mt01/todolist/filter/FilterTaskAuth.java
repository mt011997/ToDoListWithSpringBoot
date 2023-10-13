package com.mt01.todolist.filter;

import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

@Component
public class FilterTaskAuth implements Filter {

  @Override
  public void doFilter(ServletRequest arg0Request, ServletResponse arg1Response, FilterChain arg2Chain)
      throws IOException, ServletException {

    arg2Chain.doFilter(arg0Request, arg1Response);
  }

}
