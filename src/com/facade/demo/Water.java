package com.facade.demo;

public class Water {

	boolean waterIsBoiling;
	public Water() {
		// TODO Auto-generated constructor stub
		setWaterIsBoiling(false);
		System.out.println("������ˮ�Ѿ�׼������Ŷ");
	}
	
	public void boilFacadeWater(){
		setWaterIsBoiling(true);
		System.out.println("ˮ������Ŷ");
		
	}

	public boolean isWaterIsBoiling() {
		return waterIsBoiling;
	}

	public void setWaterIsBoiling(boolean waterIsBoiling) {
		this.waterIsBoiling = waterIsBoiling;
	}
	


}
