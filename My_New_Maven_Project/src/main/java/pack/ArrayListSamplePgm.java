package pack;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSamplePgm {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();//object creation of array list
		al.add("Praisy");
		al.add("Nandhu");
		al.add("Ann");
		al.add("Sreehari");
		al.add("Java");
		al.add("Obsqura");
		System.out.println("ArrayList is:" +al);
		
		//get
		String elemant=al.get(2);
		System.out.println(elemant);
		
		//contains
		boolean elemant_a=al.contains("Java");
		System.out.println(elemant_a);
		
		//size
		int s=al.size();
		System.out.println(s);
		
		//remove element
		al.remove(4);
		System.out.println(al);
//for-each,iterator
		//hasNext() : It returns true if there are more elements left in the iteration. 
		//next() :It returns element 
		
		//Iterator
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()) {//true
			String str=itr.next();
			System.out.println(str);
		}
		
	//	for-each/Enhanced for loop
		for(String i:al) {
			System.out.println("Elemnets using for-each"+i);
		}
		
		//Array - foreach
		int a[]= {3,4,5,4,4};
		for(int i:a) {
			System.out.println(i);
		}
	}

}