package com.myrestaurant.restaurant.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	 User.UserBuilder users = User.withDefaultPasswordEncoder();
         auth.inMemoryAuthentication()
    	.withUser(users.username("mary").password("fun123").roles("ADMIN"))
        .withUser(users.username("john").password("fun123").roles("EMPLOYEE"))
        .withUser(users.username("susan").password("fun123").roles("MANAGER"));
//      
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
		   .antMatchers("/").hasAnyRole("ADMIN","EMPLOYEE","MANAGER")
	        .antMatchers("/api6/loginForm").hasAnyRole("ADMIN")
	        .antMatchers("/api/login").hasAnyRole("ADMIN","MANAGER")
	        .antMatchers("/api1/login").hasAnyRole("ADMIN","EMPLOYEE")
//        .antMatchers("/").hasAnyRole("WAITER","OWNER","COSTUMER")
//        .antMatchers("/api6/loginForm").hasAnyRole("OWNER")
//        .antMatchers("/api6/findbills").hasAnyRole("OWNER")
//        .antMatchers("/api/login").hasAnyRole("OWNER","WAITER")
//        .antMatchers("/api/findorder").hasAnyRole("OWNER","WAITER")
//        .antMatchers("/api1/login").hasAnyRole("OWNER","CUSTOMER")
//        .antMatchers("/api1/save").hasAnyRole("OWNER","CUSTOMER")
//        .antMatchers("/api2/place-order").hasAnyRole("OWNER","CUSTOMER")
//        .antMatchers("/thank-you").hasAnyRole("OWNER","CUSTOMER")
        .and()
		.formLogin()
			.loginPage("/showMyLoginPage")
			.loginProcessingUrl("/authenticateTheUser")
			.permitAll()
		.and()
		.logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/access-denied");
}
                
    }

