package com.FuncPointer.demo;

public class StringComparetor implements Comparetor {

	@Override
	public boolean Comparetor(Number a, Number b) {
		// TODO Auto-generated method stub
		if(a.toString().compareTo(b.toString())>0){
			return true;
		}else {
			return false;
		}
		
	}

}
