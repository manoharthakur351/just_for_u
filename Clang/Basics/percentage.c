#include <stdio.h>
int main(int argc, char *argv[]){
	// to print percentage
    float a, b, c, d, e, total, perc;
    
	printf ("Enter Marks:\n");
	printf ("Maths: ");
	scanf ("%f", &a);
	printf ("Chemistry: ");
	scanf ("%f", &b);
	printf ("Physics: ");
	scanf ("%f", &c);
	printf ("Social science: ");
	scanf ("%f", &d);
	printf ("Computer: ");
	scanf ("%f", &e);
	
	total = a + b + c + d + e;
	perc = total * .2;
	printf ("percentage: %f", perc);
	
}