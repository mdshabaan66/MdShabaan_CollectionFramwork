package com.Logger.shabaan.com.Shabaan;

public class CollectionFramework {

	public static void main(String[] args) {
		CustomList l=new CustomList(10);
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l.fetch(10));
		System.out.println(l.remove(5));
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		System.out.println(l.remove(5));
		System.out.println(l.remove(7));
		l.add(9);
		l.add(10);
		l.add(11);
		System.out.println(l.remove(5));
		System.out.println(l.remove(6));
		l.add(12);
		l.add(13);
		l.display();
		System.out.println(l.fetch(7));
		System.out.println(l.fetch(40));
		System.out.println(l.remove(2));
		System.out.println(l.remove(9));
		l.display();

	}

}
