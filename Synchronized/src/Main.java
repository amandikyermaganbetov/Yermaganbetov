
public class Main {
	private static int number;
	
	public static void main(String[] args) {
	Thread t1 = new Thread(new Worker());
	Thread t2 = new Thread(new Worker());
	t1.start();

	t2.start();
	try {
		t1.join();
		t2.join();
	} catch (InterruptedException e) {
	}
	
	System.out.println(number);
	}
	/*
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
	}
	
	
	}*/
	public static /*synchronized*/ void increaseNumber(){
		number++;
	}
}
