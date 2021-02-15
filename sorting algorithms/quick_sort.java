
import java.util.*;
class QuickSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		quickSort(arr , 0 , size-1);
		for(int i=0 ; i<size ; i++){
			System.out.print(arr[i]+" ");
		}



	}


static void swap(int []arr, int lb , int ub){
	int temp = arr[lb];
	arr[lb] = arr[ub];
	arr[ub] = temp;
}

static void quickSort(int []arr , int lb , int ub){

	if(lb<ub){
		int j = partison(arr, lb , ub);
		quickSort(arr ,lb , j-1) ;
		quickSort(arr , j+1 , ub);
	}
}


static int partison(int []arr, int lb , int ub){

	int start = lb ; 
	int end = ub;

	int pivot = arr[lb];

	while(start<end){

		while(start < arr.length && arr[start]<=pivot){
			start++;
		}

		while(end >= 0 && arr[end] > pivot){
			end--;
		}

		if(start<end){

			swap(arr , start , end);

		}

	}

	swap(arr , lb , end);
	return end;








}
}

