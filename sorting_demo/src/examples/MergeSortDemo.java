package examples;

import java.util.Arrays;

public class MergeSortDemo {

	public static void main(String[] args) {
		int ar[]={64,25,12,22,11,22,1,33,22,44};
		System.out.println("Array before sorting ... ");
		System.out.println(Arrays.toString(ar));
		mergeSort(ar);
		System.out.println("Array after sorting ... ");
		System.out.println(Arrays.toString(ar));
	}
	
	public static void mergeSort(int ar[]) {
		
		if(ar.length>1) {
			int mid=ar.length/2;
			
			int left[]=new int[mid];
			for (int i = 0; i < left.length; i++) {
				left[i]=ar[i];
			}
			
			int right[]=new int[ar.length-mid];
			for (int i = mid; i < ar.length; i++) {
				right[i-mid]=ar[i];
			}
			mergeSort(left);
			mergeSort(right);
			int i=0;
			int j=0;
			int k=0;
			
			while(i<left.length && j<right.length) {
				if(left[i]<right[j]) {
					ar[k]=left[i];
					i++;
				}else {
					ar[k]=right[j];
					j++;
				}
				k++;
			}
			while(i<left.length) {
				ar[k++]=left[i++];
			}
			while(j<right.length) {
				ar[k++]=right[j++];
			}
		}
	}

}
//Quick Sort
