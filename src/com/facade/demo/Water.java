package com.facade.demo;

public class Water {

	boolean waterIsBoiling;
	public Water() {
		// TODO Auto-generated constructor stub
		setWaterIsBoiling(false);
		System.out.println("纯净的水已经准备好了哦");
	}
	
	public void boilFacadeWater(){
		setWaterIsBoiling(true);
		System.out.println("水沸腾了哦");
		
	}

	public boolean isWaterIsBoiling() {
		return waterIsBoiling;
	}

	public void setWaterIsBoiling(boolean waterIsBoiling) {
		this.waterIsBoiling = waterIsBoiling;
	}
	


}
