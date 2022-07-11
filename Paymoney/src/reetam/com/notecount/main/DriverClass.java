package reetam.com.notecount.main;

import java.util.Scanner;

import reetam.com.notecount.implementation.MergeSortImplementation;
import reetam.com.notecount.notescount.NotesCount;


public class DriverClass {

	public static void main(String[] args) {

		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of currency denomination ");
		int size = sc. nextInt();

		System.out.println("Enter the currency denomination");
		int[] notes =new int [size];
		for(int i =0; i<size; i++) {
			notes[i] = sc.nextInt();
		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc. nextInt();
		mergeSortImplementation.sort(notes,0, notes.length-1);

		notesCount.notesCountImplementation(notes, amount);
		sc.close();

	}
}
