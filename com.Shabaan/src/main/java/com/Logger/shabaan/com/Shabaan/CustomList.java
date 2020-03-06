package com.Logger.shabaan.com.Shabaan;

public class CustomList {
	private int size=0;
	private int capacity;
	private int [] a;
	public CustomList(int i) {
		capacity=i;
		a=new int[capacity];
	}
	public void add(int i) {
		if(size<capacity) {
			a[size++]=i;
		}
		else
		{
			reallocation();
			a[size++]=i;
		}
	}
	public void display() {
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
	private void reallocation() {
		capacity=2*capacity;
		int [] b=new int[capacity];
		for(int i=0;i<size;i++) {
			b[i]=a[i];
		}
		a=b;
	}
	public boolean fetch(int i) {
		for(int j=0;j<size;j++) {
			if(a[j]==i) {
				return true;
			}
		}
		return false;
	}
	public int remove(int i) {
		int feedback=-1,j;
		for(j=0;j<size;j++) {
			if(a[j]==i) {
				feedback=1;
				break;
			}
		}
		for(int k=j;k<size-1;k++) {
			a[k]=a[k+1];
		}
		if(feedback==1)
		{
			size-=1;
		}
		return feedback;
		
	}

}
