package com.abc.login;

public class Practice {

	public static void main(String[] args) {
		int [] a = new int[5];
		a[0]=25;
		a[1]=20;
		a[2]=35;
		a[3]=19;
		a[4]=40;
		double max = a[0];
		double min =a[0];
		for(int i =1;i<=a.length-1;i++) {
			if(max<a[i]) {
				max=a[i];
			}
			if(min>a[i]) {
				min=a[i];
			}
		}
		System.out.println("Maximum Number ="+max);
		System.out.println("Minimum Number ="+min);
	}


	}


