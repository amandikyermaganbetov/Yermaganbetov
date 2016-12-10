import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class SerializableDemo {	
	public static void main(String args[]){
		ArrayList list = new ArrayList();
		Random r = new Random();
		for(int i=0;i<20;i++){
			DemoObject obj = new DemoObject(r.nextInt()%1000);
			list.add(obj);
		}
		list.add(10, new DemoObject(1111));
		print("Source list",list);
		
		//DemoObject.dropCounter();
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("Demo.ser")));
			out.writeObject(list);
		} catch (IOException e) {
		}
		
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new BufferedInputStream(new FileInputStream("Demo.ser")));
			list = (ArrayList) in.readObject();
		} catch (IOException e) {
		} catch (ClassNotFoundException e) {
		}
		print("Lastest List",list);
	}

	static void print(String title, ArrayList list) {
		System.out.println(title);
		Iterator iter = list.iterator();
		for(int i=0;iter.hasNext();i++){
			System.out.println("N"+i+"="+iter.next());
		}
	}

}
