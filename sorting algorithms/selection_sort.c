#include<stdio.h>
#define MAX 30
void sort(int arr[], int size);
int main(){
	int arr[MAX], size;
	printf("%s\n","Enter size" );
	scanf("%d" , &size);
	for(int i=0;i<size;i++){
		scanf("%d", &arr[i]);
	}
	sort(arr, size);
}
void sort( int arr[], int size){

	int temp, j , max;
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
		printf("%d   ", arr[i]);
	}

}