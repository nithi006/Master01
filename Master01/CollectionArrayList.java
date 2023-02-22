package com.assignment.scuba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stubEmp
		List list = new ArrayList();
		
		list.add("ArrayList1");
		list.add("ArrayList2");
		list.add("ArrayList3");
		
		System.out.println(list.contains("ArrayList1"));
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
