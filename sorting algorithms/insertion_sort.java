import java.util.*;
class InsertionSort{

	static void sort(int []arr, int size){

		int temp;
		int sorted = 0;

		for (int i =sorted ; i < size-1 ; i++ ) {

				for (int j=sorted ; j >= 0 && j<size-1  ; j-- ) {
					

					if(arr[j+1]<arr[j]){
						temp = arr[j+1];
						arr[j+1] = arr[j] ;
						arr[j] = temp ;
					}
				}

			sorted++;
		
	}


		for(int k=0;k<size;k++){
			System.out.print(arr[k ]+"	   ");
		}



	}

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
}




