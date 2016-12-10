import java.util.ArrayList;


public class Main {
	public static void main(String args[]){
		recurse(10);
		
		/*int[] array = new int[5];
		for(int i=0;i<5;i++){
			array[i]=i;
		}
		
		for(int i=0;i<6;i++){
		System.out.println(array[i]);}*/
		
		
		
		/*ArrayList<Object> list =new ArrayList<Object>();
		for(int i=0;i<1012311111;i++){
		list.add(new Object());
		}
		System.out.println(list.size());*/
	}
	private static void recurse(int i){
		recurse(i);
	}
	
	
	
	
}
