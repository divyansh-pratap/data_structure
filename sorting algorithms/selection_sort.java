import java.util.*;
class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}

		sort(arr, size);

	}


static void sort(int []arr, int size ) {

	int max , temp , j;

	for( int i = 0 ; i < size ; i++ ){

		max = 0 ;

		for ( j = 1 ; j < size-i ; j++){

			if(arr[j]>arr[max]){

				max = j;

		    }

		}

	    temp = arr[max];
	    arr[max] = arr[j-1];
	    arr[j-1] = temp;

		

	}

	for (int i=0 ; i<size ; i++){
		System.out.print(arr[i] + "	");
	}

 }

}
