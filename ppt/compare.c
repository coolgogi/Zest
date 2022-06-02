#include <stdio.h>
#include <stdlib.h>

void
swap (int * a, int * b) {
	int tp = *a ;
	*a = *b ;
	*b = tp ;
	return ;
}

void
compare (int * arr, int a, int b) {
	if (arr[a] > arr[b]) {
		swap(&arr[a], &arr[b]) ;
		return ;
	}
	else {
		return ;	
	}
}

int
main (int argc, char * argv[]) {

	int * arr = (int *) malloc(sizeof(int) * 2) ;
	arr[0] = 6 ;
	arr[1] = 2 ;
	compare(arr, 0, 1) ;

	for (int i = 0 ; i < 2 ; i++) {
		printf("index%d: %d\n", i, arr[i]) ;
	}
	return 0 ;
}
