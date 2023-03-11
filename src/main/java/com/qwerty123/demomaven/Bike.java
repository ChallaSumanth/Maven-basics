package com.qwerty123.demomaven;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void drive()
	{
		System.out.println("Riding..");
	}
}
