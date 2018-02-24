package com.dzj.lamdal;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Demo1 {
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa="asas";
		String bb="asas";
		System.out.println(aa==bb);
		System.out.println("asas");
		
	}
	
	public void test() {
		String a="a";
		System.out.println("assa".hashCode());
	}
	 
	String[] atp = {"Rafael Nadal", "Novak Djokovic",  
		       "Stanislas Wawrinka",  
		       "David Ferrer","Roger Federer",  
		       "Andy Murray","Tomas Berdych",  
		       "Juan Martin Del Potro"}; 
	public  List<String> players =Arrays.asList(atp);
	
	

}
