#include <stdio.h>
int main()
{
	float p, r, t;
	printf ("Enter principal value: ");
	scanf ("%f", &p);
	printf ("Enter rate of interest: ");
	scanf ("%f", &r);
	printf ("Enter time in years: ");
	scanf ("%f", &t);
	printf ("SI=%f", p*r*t/100);
	
}