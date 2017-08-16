package pack1;

public class Example1 {
	String carname="BMW";
	static String bikename="Yamaha";
	int carspeed=10;
	static int bikespeed=20;
	
	
	public void m1(){
		System.out.println(carname+carspeed+bikename+bikespeed);
		
	}
	
	public static void m2(){
		System.out.println(bikename+bikespeed+new Example1().carname+new Example1().carspeed);
	}

}
