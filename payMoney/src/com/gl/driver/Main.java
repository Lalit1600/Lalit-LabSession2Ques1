package com.gl.driver;

import java.util.Scanner;
import com.gl.services.Transactions;

public class Main {

	public static void main(String[] args) {

		
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the size of transaction array");
			int size= sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the values of array");
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			System.out.println("Enter the total no of targets that needs to be achieved");
			int targetNo=sc.nextInt();
			Transactions transaction= new Transactions();
			transaction.transactions(size,arr,targetNo);
		
		sc.close();

	}

}
