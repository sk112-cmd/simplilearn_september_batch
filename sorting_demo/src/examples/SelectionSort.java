package examples;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		/*
		 * ar[]={64,25,12,22,11};
		 * 
		 * find the minimum in your array and swap it to the first element 0..4
		 * 11 , 25 , 12, 22 , 64
		 * repeat above step between 1...4
		 * 11 , 12 , 25 , 22 , 64
		 * repeat again for 2..4
		 * 11, 12, 22, 25, 64
		 * repeat again for 3..4
		 * 11, 12, 22, 25, 64
		 * 
		 */
		int ar[]={64,25,12,22,11};
		System.out.println("Array before sorting ... ");
		System.out.println(Arrays.toString(ar));
		sort(ar);
		System.out.println("Array after sorting ... ");
		System.out.println(Arrays.toString(ar));
	}
	
	public static void sort(int ar[]) {
		
		for (int i = 0; i < ar.length-1; i++) {
			int min=i;
			for (int j = i+1; j < ar.length; j++) {
				if(ar[j]<ar[min]) {
					min=j;
				}
			}
				int temp=ar[min];
				ar[min]=ar[i];
				ar[i]=temp;
			
			
		}
	}

}
//Insertion & Bubble sort
