#include<stdio.h>
#define MAX 30
int main(){
	int arr[MAX] ;
	int size ;
	printf("%s\n", Enter size : );
	scanf("%d" , &size);
	for(int i=0 ; i<size ; i++){
		scanf("%d" , &arr[i])
	}
	int ul = 50 , ll = -20 , range = ul - ll;
	int count[range] = {0};

	for(int i =0 ; i<size ; i++){

		count[arr[i]-ll]++;

	}

	int j =0;

	for(int i = 0 ; i < range ; i++){

		while(count[i]!=0){
			arr[j] = i + ll;
			j++;
			count[i]--;
		}

	}

	for (int i = 0; i < count; ++i){

		printf("%s\n", arr[i] );
		/* code */
	}





}