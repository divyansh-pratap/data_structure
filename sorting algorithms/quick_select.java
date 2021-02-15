import java.util.*;
class QuickSelect{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position that you want to find :-");
		int k = sc.nextInt();
		
		System.out.println(quickSelect(arr , 0 , size-1 , k-1));

		for(int i=0 ; i<size ; i++){
			System.out.print(arr[i]+" ");
		}

	}

	static void swap(int []arr , int e1 , int e2){
		int temp = arr[e1];
		arr[e1] = arr[e2];
		arr[e2] = temp;
	}

	static int partison(int arr[], int lb , int ub){

		int end = ub ;
		int start = lb ;
		int pivot = arr[lb] ;

		while(start<end){

			while(start < arr.length - 1 && arr[start]<=pivot){
				start++;
			}

			while(end >= 0 && arr[end] > pivot){
				end--;
			}

			if(start<end){
				swap(arr ,start , end );

			}

			

		}

		swap(arr, end , lb);
		return end;

	}
	static int quickSelect(int []arr , int lb , int ub , int k){


		if(lb<ub){

			int j = partison(arr, lb , ub);

			if(j>k){

				quickSelect(arr , lb , j-1 , k);

			}
			if(j<k){

				quickSelect(arr , j+1 , ub , k);

			}

		}
		return arr[k];

	}
}

