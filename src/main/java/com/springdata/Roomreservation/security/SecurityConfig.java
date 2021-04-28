package com.springdata.Roomreservation.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
////	
////	protected void configure(HttpSecurity http) throws Exception
////	{
////		http.authorizeRequests().antMatchers("/","/rooms").permitAll()
////		.anyRequest().authenticated()
////		.and().formLogin()
////		.loginPage("/login").permitAll()
////		.and().logout().permitAll();
////	}
////	
////	@Autowired
////	public void  ConfigureGlobal(AuthenticationManagerBuilder auth) throws Exception
////	{
////		auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("user")
////		.password("password").roles("USER");
////	}
//


public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		//set your configuraiton on auth object
		
		auth.inMemoryAuthentication()
		.withUser("nisum")
		.password("nisum@123")
		.roles("USER")
		.and()
		.withUser("malik")
		.password("malik@123")
		.roles("ADMIN");
	}
	
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}


