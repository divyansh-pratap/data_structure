import java.util.*;

class BucketSort{

	static void bucketSort(int []arr , int upRange , int lowerRange){

		int range = upRange - lowerRange + 1;
		int count[] = new int[range];
		int j = 0;

		for(int i=0 ; i<arr.length ; i++){

			count[arr[i]-lowerRange]++;

		}

		for(int i = 0 ; i<range ; i++){

			while(count[i]!=0){
				arr[j] = i + lowerRange;
				j++;
				count[i]--;
			}
 
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
		bucketSort(arr , 50 , -20 );

		for(int i=0 ; i<size ; i++){
			System.out.print(arr[i]+" ");
		}


	}
}
