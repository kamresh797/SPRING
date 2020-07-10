package com.mayank.test;

import com.mayank.comp.Flipkart;
import com.mayank.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
	    Flipkart fpkt=null;
	    fpkt=FlipkartFactory.getInstance("firstflight");
	    System.out.println(fpkt.shopping(new String[] {"rain coat","umbrella","flu tablets"} ,
	    		                                                    new float[] {5000,2000,500}
	                                                             )
	    		                        );

	}//main

}//class
