#include<stdio.h>
	main() 
	{
		int sec,hr,min,s;
		printf("Input seconds:");
		scanf("%d",&sec);
		hr=(sec/3600);
		min=(sec-(3600*hr))/60;
		s=(sec-(3600*h)-(min*60));
		printf("H:M:S -%d:%d:%d\n",hr,min,s);
		return 0;
	}
