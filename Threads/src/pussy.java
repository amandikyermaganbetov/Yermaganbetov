import java.util.*;
public class pussy implements Runnable {
	String name;
	int time;
	Random r = new Random();
	public pussy(String name){
		this.name=name;
		time=r.nextInt(10);
	}
	public void run(){
		System.out.printf("Thread %s sleeps on %d \n",name,time);
		try{Thread.sleep(time);
		}
		catch(Exception e){}
		System.out.printf("Thread %s sleep \n",name);
	}
}
