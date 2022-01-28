package com.springs.usingannotations;

import org.springframework.stereotype.Component;

@Component
public class CricketService implements Coach{

	public String dailyWorkOut() {
		// TODO Auto-generated method stub
		return "dailyWorkout of Cricket ";
	}

	public String updates() {
		// TODO Auto-generated method stub
		return "updates of cricket";
	}

}
