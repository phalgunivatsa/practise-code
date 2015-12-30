package com.yash.filters.filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns={"/filter.do."})
public class UrlValidator implements Filter {

	public void destroy() {
		System.out.println("FilterURLValidator--> destroy");
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq= (HttpServletRequest)request;
		HttpServletResponse httpRes= (HttpServletResponse)response;
		
		String urlpath= httpReq.getRequestURI().substring(httpReq.getContextPath().length());
		
		Pattern pattern= Pattern.compile(".do");
		Matcher matcher= pattern.matcher(urlpath);
		
		boolean result= matcher.find();
		if (result){
			chain.doFilter(request, response);
		}else {
			PrintWriter out= response.getWriter();
			out.println("Not a valid user");
		}
		
	}


	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("FilterURLValidator--> init");
		
	}



}
