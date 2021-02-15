import java.util.*;

class BinarySearch{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		binarySearch(0 , size-1, arr , 23);

	}


static void binarySearch(int low ,int high ,int []arr ,int value ){

	if(low<high){
		int mid = (low+high)/2;
		if(arr[mid]<value){
			binarySearch(low , mid , arr, value);

		}else if(arr[mid]>value){
			binarySearch(mid+1 , high , arr , value );

		}else {
			System.out.println("yes it exists at"+ (mid+1));

		}
	}


 }
}
