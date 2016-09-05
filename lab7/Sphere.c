/* Sphere.c */
/* Tarum Fraz */
/* tfraz  */
/* lab7 */
/* This program finds volume and surface area of */
/* a sphere, with the radius inputted by user. This */
/* program is written in C. */

#include<stdio.h>



int  main(){
  
  const double pi = 3.141592654;
  double r;
  double volume;
  double  surfaceArea;  

  printf("Enter the radius of the sphere: ");
  scanf("%lf", &r);
 
  volume = (4.0/3.0) * pi * (r * r * r);
  surfaceArea = 4 * pi * (r * r);

  printf("The volume of the sphere is %f ", volume);
  printf(" and the surface area is %f.\n", surfaceArea);
  
  return 0;

}
