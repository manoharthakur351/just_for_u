#include <stdio.h>
int main(int argc, char *argv[])
{
	float rad, area;
	printf ("Program to find area of a circle\n");
	printf ("Enter value of radius: ");
	scanf ("%f", & rad);
	area = 3.14 * rad * rad;
	printf ("Area of circle is %f", area);
	return 0;
}