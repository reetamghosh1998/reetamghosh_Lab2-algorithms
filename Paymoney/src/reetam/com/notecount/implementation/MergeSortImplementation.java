package reetam.com.notecount.implementation;

public class MergeSortImplementation {

	public void merge(int[] arr, int left, int mid, int right) {
		//sort array into descending array
		//Find sizes of two sub array to be merged

		int n1 = mid -left +1;
		int n2 = right -mid;

		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		//copying array 1st in left array
		for(int i =0; i<n1; i++)
			leftArr[i]= arr[left+i];
		//copying 2nd  half in right array
		for(int j=0; j<n2; j++)
			rightArr[j]= arr[mid+1+j];

		// Merging temporary array
		//Initial indexes of first and second sub array

		int i =0; int j=0;
		//Initial index of merged sub array

		int k= left;

		while(i<n1 && j<n2) {

			if(leftArr[i]>=rightArr[j]) {
				arr[k]= leftArr[i];
				i++;
			}
			else {
				arr[k]=rightArr[j];
				j++;
			}
			k++;
		}

		//Copying remaining elements ofL[] if any

		while(i<n1) {
			arr[k]=leftArr[i];
			i++;
			k++;


		}

		//Copying remaining elements of right array
		while(j<n2) {
			arr[k]= rightArr[j];
			j++;
			k++;
		}
	}


	public void sort(int[] notes, int left, int right) {
		if(left < right) {
			//find middle point
			int mid = (left+right)/2;
			//Sort first and second halves
			sort(notes, left, mid);
			sort(notes, mid+1, right);
			//Merge sorted values
			merge(notes, left, mid, right);

		}

	}
}

