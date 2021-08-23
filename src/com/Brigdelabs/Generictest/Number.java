package com.Brigdelabs.Generictest;

import com.Brigdelabs.Generictest.Number;

public class Number<T extends Comparable<T>> {
	
	T obj1; T obj2; T obj3; T obj4;
	
	

	public Number(T obj1, T obj2, T obj3, T obj4) {
		
		this.obj1 = obj1;
		this.obj2 = obj2;
		this.obj3 = obj3;
		this.obj4= obj4;
	}
	
	public void compute()
	{
		this.compare(obj1, obj2, obj3,obj4);
	}

	public static <T extends Comparable<T>> void compare(T a, T b, T c, T d) {
		if (a.compareTo(b) > -1 && a.compareTo(c)>-1 && a.compareTo(d)> -1) {
			System.out.println("a is greater");
		} else if ((b.compareTo(a)) > -1 && (b.compareTo(c))> -1 && b.compareTo(d)> -1) {
			System.out.println(" b is greater");
		} else if ((c.compareTo(a)) > -1 && (c.compareTo(b))>-1  && c.compareTo(d) > -1) {
			System.out.println(" c is greater");
		}else {
			System.out.println("D is greater");
			
		}
	}

	public static void main(String[] args) {
		Integer a = 10;
		Integer b = 20;
		Integer c = 30;
		Integer d = 90;
		//Number integerObj = new Number();
		compare(a, b, c,d);

		Float p = 1.2f;
		Float q = 3.2f;
		Float r = 0.2f;
		Float s = 0.7f;
		//Number floatObj = new Number();
		//compare(d, e, f,g);

		String g = "pritesh";
		String h = "aniket";
		String i = "yash";
		String j = "ya";
		//Number stringObj = new Number();
		//compare(g, h, i);
		
		Number intObj = new Number(a, b, c,d);
		Number floatObj = new Number(p,q,r,s);
		Number stringObj = new Number(g,h,i,j);
		
		intObj.compute();
//		floatObj.compute();
//		stringObj.compute();
		

	}
}
