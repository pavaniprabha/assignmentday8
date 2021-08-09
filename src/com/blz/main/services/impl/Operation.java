package com.blz.main.services.impl;

import com.blz.main.dto.Inputs;
import com.blz.main.services.Interface;

public class Operation implements Interface {

	@Override
	public double LineOne() {
		double Length1 =  Math.sqrt((Inputs.getX2() - Inputs.getX1()) * (Inputs.getX2() - Inputs.getX1()) + (Inputs.getY2() - Inputs.getY1()) * (Inputs.getY2() - Inputs.getY1()));
		return Length1;
	}

	@Override
	public double LineTwo() {
		double Length2 =  Math.sqrt((Inputs.getX2() - Inputs.getX1()) * (Inputs.getX2() - Inputs.getX1()) + (Inputs.getY2() - Inputs.getY1()) * (Inputs.getY2() - Inputs.getY1()));
		return Length2;
	}

}
