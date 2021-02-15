#include<stdio.h>
#define MAX 30
void bubble_sort(int arr[], int size);
int main(){
	
	int arr[MAX];
	int size;
	printf("%s\n", "Enter size"   );
	scanf("%d" , &size);
	for(int i=0;i<size;i++){
		scanf("%d" , &arr[i] );
	}
	bubble_sort(arr , size);

}

void bubble_sort(int arr[], int size){
    int temp, sign =0;
    for(int i=0;i<size;i++){
        for(int j=0; j<size-i-1; j++){
            if(arr[j]>arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
                sign = 1;
            }
        }
        if(!sign){
            break;
        }
    }
    
    
    for(int i=0; i<size ; i++){
        printf("%d  ", arr[i]);
    }
}