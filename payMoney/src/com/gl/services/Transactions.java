package com.gl.services;

import java.util.Scanner;

public class Transactions {
	Scanner sc = new Scanner(System.in);
	public void transactions(int size,int arr[],int targetNo)
	{
		while(targetNo--!=0)
			
		{int flag=0;
		
		System.out.println("Enter the value of the target");
	
		long targetValue=sc.nextInt();
	
		long sum=0;
	
		for(int i=0;i<size;i++) {
		
			sum=sum+arr[i];
		
			if(sum>=targetValue) {
			
				System.out.println("Target achieved after " +(i+1) + " transactions");
			
				flag=1;
			break;
		}
	}
		if(flag==0)
			
			System.out.println("Given target is not achieved");
	
		}
	}


}
