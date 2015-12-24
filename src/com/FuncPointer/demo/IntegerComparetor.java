package com.FuncPointer.demo;

public class IntegerComparetor implements Comparetor {

	@Override
	public boolean Comparetor(Number a, Number b) {
		// TODO Auto-generated method stub
		if(a.intValue()>b.intValue())
		{
			return true;
		}
		
		return false;
	}

}
