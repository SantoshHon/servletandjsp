package com.mindgate.main;

import com.mindgate.pojo.GoodMorningGreater;
import com.mindgate.pojo.Gretings;

public class GreatingsMain {

	public static void main(String[] args) {

//		Gretings gretings=new GoodMorningGreater();
//		gretings.greet();
		Gretings gretings=()->System.out.println("Good Morning");
		gretings.greet();
		
		Gretings gretings2=()->System.out.println("Good Afternoon");
		gretings2.greet();
		
		Gretings gretings3=()->System.out.println("Good Nigth");
		gretings3.greet();  
	
	}

}
