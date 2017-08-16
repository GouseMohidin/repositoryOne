package com.web.JavaRltd;

 abstract class GrndParnt {
	
	public void absMth(){
		System.out.println("method 1 under abstract class");
	}
	public static void absMthTwo(){
		System.out.println("method 2 under abstract class");
	}
//	public abstract static void abssMth();
  public static void main(String[] args) {
	  
	  GrndParnt.absMthTwo();
}
}
 abstract class Prnt extends GrndParnt{
	 
 }
 
 public class AbstractImpltCls extends Prnt{
	 
 }
