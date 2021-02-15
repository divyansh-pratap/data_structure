import java.util.*;
class MergeSort{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int []arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		mergeSort(arr , 0 , size-1);
		for(int i=0 ; i<size ; i++){
			System.out.print(arr[i]+"  ");
		}

		
	}


static void mergeSort(int arr[] , int l , int r){

	if(l<r){
		int mid = (l+r)/2;
		mergeSort(arr , l , mid);
		mergeSort(arr , mid+1 , r);
		merge(arr, l , r , mid);
	}


}

static void merge(int []arr, int l, int r, int mid){

	int n1 = mid - l + 1, t=0;
	int n2 = r - mid;
	int arr1[] = new int[n1];
	int arr2[] = new int[n2];

	for(int i = l ; i <= mid ; i++){
		arr1[t] = arr[i];
		t++;
	}
	t=0;
	for(int j = mid+1 ; j <= r ; j++){
		arr2[t] = arr[j];
		t++;
	}

	int i = 0 , j = 0 , k = l ;

	while(i<n1 && j<n2){

		if(arr1[i]<arr2[j]){

			arr[k] = arr1[i];
			i++; 

		}else{

			arr[k] =arr2[j];
			j++;

		}

		k++;

	}

	while(i<n1){
		arr[k] = arr1[i];
		i++;
		k++;
	}
	while(j<n2){
		arr[k] = arr2[j];
		j++;
		k++;
	}



}
}