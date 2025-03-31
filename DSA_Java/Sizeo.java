package coreJava;

public class Sizeo {
	
	private int def_in;
	private double def_db;
	private char def_ch;
	private float def_f;
	private long def_lg;
	private short def_sh;
	private boolean def_bl;
	private byte def_bt;

public void initSizeof()
{
	def_in=151;
	def_db=10.0d;
	def_ch='P';
	def_f=253.32f;
	def_lg=11111111L;
	def_sh=13;
	def_bl=true;
	def_bt=11;
	
}

public void display()
{
	System.out.println("Default value for Integer:- "+ def_in);
	System.out.println("Default value for Double:- "+ def_db);
	System.out.println("Default value for character:- "+ def_ch);
	System.out.println("Default value for Float:- "+ def_f);
	System.out.println("Default value for Long:- "+ def_lg);
	System.out.println("Default value for Short:- "+ def_sh);
	System.out.println("Default value for Byte:- "+ def_bt);
}

	public static void main(String[] args) {
		Sizeo s=new Sizeo();
		
      //first we will print what defaul values we will get from the our compiler 
		System.out.println("  Default value for Integer:- "+ s.def_in);
		System.out.println("  Default value for Double:- "+ s.def_db);
		System.out.println("  Default value for character:- "+ s.def_ch);
		System.out.println("  Default value for Float:- "+ s.def_f);
		System.out.println("  Default value for Long:- "+ s.def_lg);
		System.out.println("  Default value for Short:- "+ s.def_sh);
		System.out.println("  Default value for Byte:- "+ s.def_bt);
		
		s.initSizeof();
		s.display();
		
		
		
	}

}
