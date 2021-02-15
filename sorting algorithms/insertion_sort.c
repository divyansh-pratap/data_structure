#include<stdio.h>
#define MAX 30
void sort(int arr[] ,int size);
int more(int i , int j);
int main()
{
	int arr[MAX], size;
	printf("%s\n","Enter size" );
	scanf("%d" , &size);
	for(int i=0;i<size;i++){
		scanf("%d", &arr[i]);
	}
	sort(arr, size);
}

void sort ( int arr[] ,int size) {

	int temp ;
	int j ;

	for ( int i = 1 ; i < size ; i++ ) {

		temp = arr[i] ;

		for (  j = i ; j > 0 && more (arr[j-1] , temp ) ; j--) {

			arr[j] = arr[j-1] ;


		}

		arr[j] = temp;



	}
	
	for(int k =0 ; k<size ; k++){
	    printf("%d  ", arr[k]);
	}



}

int more ( int i , int j ) {

	if(i>j){
		return 1;
	}

	return 0;

}