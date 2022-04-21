package org.array;

import java.util.ArrayList;
import java.util.List;

public class ArraySample {
	public static void main(String[] args) {
		List i = new ArrayList();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(18);
		i.add(50);
		System.out.println(i);
		
		int size = i.size();
		System.out.println(size);
		
		i.add(2,50);
		System.out.println(i);
		
		i.remove(1);
		System.out.println(i);
		
		i.set(2, 90);
		System.out.println(i);
		
		int k = i.indexOf(10);
		System.out.println(k);
		
		boolean contains = i.contains(50);
		System.out.println(contains);
		
		boolean empty = i.isEmpty();
	System.out.println(empty);
	
	List<Integer> j = new ArrayList<Integer>();
	j.add(20);
	j.add(40);
	j.add(100);
	j.add(80);
	System.out.println(j);
	
	j.addAll(i);
	System.out.println(j);
	
	j.retainAll(i);
	System.out.println(j);
	
	j.removeAll(i);
	System.out.println(j);
	
	 
		
	}

}
