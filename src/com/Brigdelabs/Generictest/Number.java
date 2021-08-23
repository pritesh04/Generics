package com.Brigdelabs.Generictest;

import com.Brigdelabs.Generictest.Number;

public class Number<T extends Comparable<T>> {
	
	T obj1; T obj2; T obj3;
	
	

	public Number(T obj1, T obj2, T obj3) {
		
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
	}
	
	public void compute()
	{
		this.compare(obj1, obj2, obj3);
	}

	public static <T extends Comparable<T>> void compare(T a, T b, T c) {
		if (a.compareTo(b) > -1 && a.compareTo(c) > -1) {
			System.out.println("a is greater");
		} else if ((b.compareTo(a)) > -1 && (b.compareTo(c)) > -1) {
			System.out.println(" b is greater");
		} else if ((c.compareTo(a)) > -1 && (c.compareTo(b)) > -1) {
			System.out.println(" c is greater");
		}
	}

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer c = 30;
		//Number integerObj = new Number();
		compare(a, b, c);

		Float d = 1.2f;
		Float e = 3.2f;
		Float f = 0.2f;
		//Number floatObj = new Number();
		//compare(d, e, f);

		String g = "pritesh";
		String h = "aniket";
		String i = "yash";
		//Number stringObj = new Number();
		//compare(g, h, i);
		
		Number inta = new Number(a, b, c);
		Number floata = new Number(d,e,f);
		Number stringa = new Number(g,h,i);
		
		inta.compute();
		floata.compute();
		stringa.compute();
		

	}
}
