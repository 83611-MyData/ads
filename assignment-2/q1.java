package Assignment2;

import java.util.Arrays;

public class q1 {
	
	public static void insertionSort(int arr[],int N) {
		int comp=0;
		for(int i = 1; i<N;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j] > temp ) {
				arr[j+1]= arr[j];
				j--;
				comp++;
			}
			arr[j+1]=temp;
		}
		System.out.println("No. of Comparision "+comp);
	}

	public static void main(String[] args) {
		int arr[] = {67, 92, 12, 18, 92, 53};
		
		System.out.println("Before sort array : " + Arrays.toString(arr));
		insertionSort(arr, arr.length);
		System.out.println("After sort array : " + Arrays.toString(arr));

	}

}
