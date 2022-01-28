package com.springs.usingannotations;

import org.springframework.stereotype.Component;

@Component
public class FootballService implements Coach {

	public String dailyWorkOut() {
		// TODO Auto-generated method stub
		return "football dailyworkout";
	}

	public String updates() {
		// TODO Auto-generated method stub
		return "football updates";
	}

}
