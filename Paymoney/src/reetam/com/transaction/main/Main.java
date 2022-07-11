package reetam.com.transaction.main;

import java.util.Scanner;

import reetam.com.transaction.service.Service;

public class Main {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");

		int size = sc.nextInt();

		int array[] = new int [size];

		System.out.println("Enter the values of array");
		for (int i=0; i<size; i++)

			array[i] = sc.nextInt();

		System.out.println("Enter the total no of target that need to be achieved");

		int targetNo = sc.nextInt();

		Service transactionService = new Service();

		transactionService.checkTransaction(array, targetNo);
		sc.close();







	}

}
