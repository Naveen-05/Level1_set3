#include<stdio.h>
	main()
	{
	  int a[3],maximum,size,c,location=1;
	  printf("Enter the number of elements in array\n");
	  scanf("%d",&size);
	  printf("Enter %d integers\n",size);
	  for(c=0;c<size;c++)
	    scanf("%d",&a[c]);
	  maximum=a[0];
	  for(c=1;c<size;c++)
	  {
	    if(a[c]>maximum)
	    {
	       maximum=a[c];
	       location=c+1;
	    }
	  }
	  printf("Maximum element is present at location %d and it's value is %d.\n",location,maximum);
	  return 0;
	}
