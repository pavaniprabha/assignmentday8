package com.blz.main;

import com.blz.main.dto.Inputs;
import com.blz.main.services.Interface;
import com.blz.main.services.impl.Operation;
import com.blz.main.services.uitility.UserUtility;

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
	        System.out.println("Enter Line Co-ordinates ");
	        Coordinates();
	        System.out.println("Length of Line : " + obj.distance());
	    }
}
