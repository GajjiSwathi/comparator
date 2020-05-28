package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	public static void main(String args[]) {
		ArrayList<Laptop> laptop= new ArrayList<>();
		laptop.add(new Laptop("dell",32,1800));
		laptop.add(new Laptop("hp",64,2000));
		laptop.add(new Laptop("apple",32,1600));
		
		Comparator<Laptop> comparator= new Comparator<Laptop>()
				{

					@Override
					public int compare(Laptop o1, Laptop o2) {
						if(o1.getPrice()>o2.getPrice()) 
						return 1;
					else 
						return -1;
					}
			
				};

		Collections.sort(laptop,comparator );
		for(Laptop l:laptop) {
			System.out.println(l);
		}


		
	}

}
