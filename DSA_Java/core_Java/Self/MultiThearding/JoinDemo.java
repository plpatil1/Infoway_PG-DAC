package multithreading;

public class JoinDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=5; i++)
		{
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+ " "+i);
		}
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		JoinDemo j1= new JoinDemo();
		JoinDemo j2= new JoinDemo();
		Thread t1=new Thread(j1, "Pawan");
		Thread t2=new Thread(j2, "Himanshu");
		Thread t3=new Thread(j2, "Yashya");
		
		t2.start();
		t2.join();
		
		t1.start();
//		t1.join();
		
		t3.start();
		
		
	}

}
