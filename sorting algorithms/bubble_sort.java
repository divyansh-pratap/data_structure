import java.util.*;

class BubbleSort{

	static void sort(int []arr,int size){


		for(int i=0;i<size;i++){

			int temp;
			boolean t = false;

			for(int j=0;j<size-i-1;j++){
				t=false;
				if(arr[j]>arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					t=true;
				}
			}

			if (!t) {
				break;	
			}

		}
		for (int i = 0; i<size ; i++ ) {
			System.out.print(arr[i]+"	");
			
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