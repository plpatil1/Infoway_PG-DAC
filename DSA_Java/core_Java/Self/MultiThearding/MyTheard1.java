package multithreading;

public class MyThread1 implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=3;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
				Thread.sleep(750);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		MyThread1 r1=new MyThread1();
		Thread t1=new Thread(r1);
		
		MyThread1 r2=new MyThread1();
		Thread t2=new Thread(r2);
		
		MyThread1 r3=new MyThread1();
		Thread t3=new Thread(r3);
		
		
		t1.setName("one");
		t2.setName("two");
		t3.setName("three");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
