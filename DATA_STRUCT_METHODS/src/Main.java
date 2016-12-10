import java.util.ArrayList;
import java.util.Random;


public class Main {
	private static ArrayList<Integer> list = new ArrayList<Integer>();
	static int[] array ={10,21,121,1231,12,1,3,4,5};
	public static void main(String args[]){
		
		
		System.out.println(list.size());
		
		for(int i=0;i<9;i++){
			list.add(array[i]);
		}
		
		for(int i=0;i<9;i++){
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		System.out.println(list);
			System.out.println(set(5,6));
			System.out.println(array[5]);
			for(int i=0;i<9;i++){
				System.out.print(array[i]+ " ");
			}
}
	
	public static Integer set(int index,Integer newValue){
		Integer oldValue = array[index];
		array[index] = newValue;
		return array[index];
		
	}
	
	
	
	
	
	}