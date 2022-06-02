#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <stdbool.h>
#include <string.h>

bool
nextBool() {
	if (rand() % 2 == 0) {
		return true ;
	}
	else {
		return false ;
	}
}

int nextNum() {
	return rand() % 16 + 1 ;
}

int nextInt() {
	return rand() % 256 + 1 ;
}

char *
random_input_generator () {
	int len = 5 ;
	char * input = (char *) malloc(len) ;
	strcpy(input, "[") ;
	do {
		int n = nextNum() ;	
		len = len + n * 4 ;
		input = (char *) realloc(input, len) ;
		for (int i = 0 ; i < n ; i++) {
			sprintf(input, "%s%d,", input, nextInt()) ;
		}

	} while (nextBool()) ;
	input[strlen(input)-1] = ']' ;
	input[strlen(input)] = '\0' ;
	return input ;
}

int
main (int argc, char * argv[]) {
	srand(time(NULL)) ;	
	char * input = random_input_generator() ;
	printf("input: %s\n", input) ;
	free(input) ;
	return 0;
}

