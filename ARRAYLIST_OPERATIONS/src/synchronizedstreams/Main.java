package synchronizedstreams;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<Object>(1000);
	

	public static void main(String[] args) {
		addObjects();
		proceed();

	}


	private static void proceed() {
		System.out.println(list.size());
		Object obj = null;
		while(list.size()!=0){
		for(Object element:list){
			obj = element;
			break;
		}
		list.remove(obj);}
		System.out.println(list.size());
	}

	
	
	
	
	private static void addObjects() {
		for(int i=0;i<5;i++){
			list.add(new Object());
		}
	}

}
