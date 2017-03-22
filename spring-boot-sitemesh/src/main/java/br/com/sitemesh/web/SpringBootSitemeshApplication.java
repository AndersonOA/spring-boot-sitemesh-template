package br.com.sitemesh.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import br.com.sitemesh.web.filter.WebSiteMeshFilter;

@SpringBootApplication
public class SpringBootSitemeshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSitemeshApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean siteMeshFilter(){
		FilterRegistrationBean filter = new FilterRegistrationBean();
		WebSiteMeshFilter siteMeshFilter = new WebSiteMeshFilter();
		filter.setName("sitemesh");
		filter.setFilter(siteMeshFilter);
		return filter;
	}
}
