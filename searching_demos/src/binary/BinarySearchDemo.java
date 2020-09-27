package binary;

import java.util.Arrays;

public class BinarySearchDemo {

	public static void main(String[] args) {

		int ar[]= {21,11,33,1,21,11,21,4};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		System.out.println(Arrays.binarySearch(ar, 2));
		System.out.println(Arrays.binarySearch(ar, 21)); //Collections.binarySearch
		
		myBinarySearch(ar, 0, 1, ar.length-1);
	}
	
	public static void myBinarySearch(int ar[],int start,int key,int length) {
		
		int mid=(start+length)/2;
		
		while(start<=length) {
			if(ar[mid]==key) {
				System.out.println(key+" is found at position "+mid);
				break;
			}else if(ar[mid]<key) {
				start=mid+1;
			}else {
				length=mid-1;
			}
			mid=(start+length)/2;
		}
		if(start>length) {
			System.out.println("Element is not found");
		}
		
	}

}
