package com.blz.main;

import com.blz.main.dto.Inputs;
import com.blz.main.services.Interface;
import com.blz.main.services.impl.Operation;
import com.blz.main.services.utility.UserUtility;

public class Main {
	 public static Interface obj = new Operation();
	    public static void Coordinates() {
	        System.out.print("Enter x1 point : ");
	        Inputs.setX1(UserUtility.intInput());
	        System.out.print("Enter y1 point : ");
	        Inputs.setY1(UserUtility.intInput());
	        System.out.print("Enter x2 point : ");
	        Inputs.setX2(UserUtility.intInput());
	        System.out.print("Enter y2 point : ");
	        Inputs.setY2(UserUtility.intInput());
	    }
	    public static void main(String[] args) {
	    	        System.out.println("Enter First Line Co-ordinates \n");
	    	        Coordinates();
	    	        float Length1=(float)obj.LineOne();
	    	        System.out.println("Length of First Line : " + Length1);
	    	        System.out.println("\nEnter Second Line Co-ordinates \n");
	    	        Coordinates();
	    	        float Length2=(float)obj.LineTwo();
	    	        System.out.println("Length of Second Line : " + Length2);
	    	        Compare(Length1,Length2);
	    	    
	    }
		
	    public static void Compare(float a,float b) {
	 
	    	String first = Float.toString(a);
	    	String second = Float.toString(b);
	    	if (first.compareTo(second)==0){
	    		System.out.println("\nBoth lines are equal");
	    	}
	    	else {
	    		System.out.println("\nBoth lines are not  equal");
	    	}
    
   }
}