#include<stdio.h>
#define MAX 30
void merge_sort(int arr[], int lb, int ub);
void sort(int arr[], int lb, int ub, int mid);
int main(){

	int arr[MAX];
	int size;
	printf("%s\n", "Enter size"   );
	scanf("%d" , &size);
	for(int i=0;i<size;i++){
		scanf("%d" , &arr[i] );
	}
	merge_sort(arr, 0, size-1);
	for(int i=0;i<size;i++){
		printf("%d  " ,arr[i] );
	}


}
void merge_sort(int arr[], int lb, int ub){

	if(lb<ub){
		int mid = (lb+ub)/2;
		merge_sort(arr, lb , mid);
		merge_sort(arr, mid+1, ub);
		sort(arr, lb, ub, mid);
	}

}
void sort(int arr[], int lb, int ub, int mid){


	int n1 = mid - lb + 1;
	int n2 = ub - mid;
	int arr1[n1];
	int arr2[n2];
	int t=0;

	for(int i=lb ; i<=mid ; i++ ){
		arr1[t] =  arr[i];
		t++;
	}
	t=0;
	for(int i=mid+1 ; i<=ub ; i++ ){
		arr2[t] = arr[i];
		t++;
	}

	int i =0 , j = 0;
	t=lb;

	while(i<n1 && j<n2 ){

		if(arr1[i]<arr2[j]){
			arr[t] = arr1[i];
			i++;
		}else{
			arr[t] = arr2[j];
			j++;
		}
		t++;
	}
	while(i<n1){
		arr[t]=arr1[i];
		i++;
		t++;
	}
	while(j<n2){
		arr[t]=arr2[j];
		j++;
		t++;
	}

}