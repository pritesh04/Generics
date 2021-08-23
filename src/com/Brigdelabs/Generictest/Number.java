package com.Brigdelabs.Generictest;

public class Number {

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
		compare(a, b, c);

		Float d = 1.2f;
		Float e = 3.2f;
		Float f = 0.2f;
		compare(d, e, f);
		
		String g = "pritesh";
		String h = "aniket";
		String i = "yash";
		compare(g, h, i);


	}
}
