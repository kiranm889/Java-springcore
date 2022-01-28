package com.springs.usingconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.springs.usingconfiguration")
public class ConfigurationClass {
	
	@Bean
	public CricketService cricketService()
	{
		return new CricketService();
	}
	
	@Bean
	public FootballService footballService()
	{
		return new FootballService();
	}

}
