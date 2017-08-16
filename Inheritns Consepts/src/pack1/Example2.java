package pack1;

public class Example2 extends Example1{
	int carno=1234;
	static int bikeno=5678;
	String carowner="chandu";
	static String bikeowner="shahanaj";
	
	public void m3(){
		System.out.println("*******car"+"Details**********");
        System.out.println("car owner="+carowner);
        System.out.println("car name="+carname);
        System.out.println("car no="+carno);
        System.out.println("car speed="+carspeed);

        
	}
	static public void m4(){
		System.out.println("*******bike"+"Details**********");
		System.out.println("bike owner="+bikeowner);
        System.out.println("bike name="+bikename);
        System.out.println("bike no="+bikeno);
        System.out.println("bike peed="+bikespeed);

		
	}

}
