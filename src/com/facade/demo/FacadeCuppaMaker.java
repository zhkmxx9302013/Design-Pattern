package com.facade.demo;

public class FacadeCuppaMaker {
	boolean teaBagIsSteeped;  
	  public FacadeCuppaMaker() {    System.out.println("FacadeCuppaMaker ׼������Ϊ������!");  
	  }  
	  public TeaCup makeACuppa()   {      
		    TeaCup cup = new TeaCup();       
		    TeaBag teaBag = new TeaBag();      
		    Water water = new Water();     
		    cup.addFacadeTeaBag(teaBag); 
		    water.boilFacadeWater(); 
		    cup.addFacadeWater(water);       
		    cup.steepTeaBag();       
		    return cup;   
		  }

}
