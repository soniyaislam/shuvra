package Array;

import java.util.ArrayList;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//FIFO =First in first out
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		x.add(500);
		System.out.println(x.get(0));
		
		x.add(300);
		x.add(400);
		System.out.println(x.get(0)+x.get(1) + x.get(2));
	    
		x.remove(0);
	    System.out.println(x.get(0));
	   
	    x.add(50);
	    System.out.println("Index 0 = " + x.get(0));
	    System.out.println("Index 2 = " + x.get(2));
	
	}

}
