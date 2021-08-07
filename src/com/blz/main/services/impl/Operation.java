package com.blz.main.services.impl;

import com.blz.main.dto.Inputs;
import com.blz.main.services.Interface;

public class Operation implements Interface {

	@Override
	public double distance() {
		        double line = Math.sqrt(Math.pow((Inputs.getX2() - Inputs.getX1()), 2) + Math.pow((Inputs.getY2() - Inputs.getY1()), 2));
		        return line;
		    }
		
	}


