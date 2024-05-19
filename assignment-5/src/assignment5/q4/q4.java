package assignment5;
import java.util.Arrays;
import java.util.Scanner;

public class q4 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int arr[] = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 elements");
		
		for(int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int count;
		int ele = 0;
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			count = 0;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count > max) {
				max = count;
				ele = arr[i];
			}
		}
		
		System.out.println("Mode of array = "+ele);
	}

}
