package multithreading;

public class MyThread2 extends Thread{
	
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
	}
	 
	public static void main(String[] args) {
		MyThread2 t1	= new MyThread2();
		MyThread2 t2	= new MyThread2();
		MyThread2 t3	= new MyThread2();
		
		t1.setName("Pawan");
		t2.setName("Himanshu");
		t3.setName("Yash");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(6);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
