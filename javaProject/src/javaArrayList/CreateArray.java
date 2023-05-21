package javaArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CreateArray {

	public static void main(String[] args) {
		
		ArrayList<String> car = new ArrayList<String>();
		car.add("Volvo");
		car.add("Hyundai");
		car.add("verna");
		car.add("baleno");
		System.out.println(car);
		System.out.println(car.size());
		System.out.println(car.get(0));
		car.set(3,"Porche");
		System.out.println(car);
		Collections.sort(car);
		System.out.println(car);
		car.remove(3);
		System.out.println(car);

	}

}
