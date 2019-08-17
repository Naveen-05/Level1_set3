#include <stdio.h>
	  void main()
	    {
	       int j,k,a,n,number[30];
	        printf("Enter the value of N \n");
	        scanf("%d",&n);
	        printf("Enter the numbers \n");
	        for(j=0;j<n;++j)
	            scanf("%d",&number[j]);
	        for(j=0;j<n;++j) 
	        {
	            for(k=j+1;k<n;++k)
	            {
	                if(number[j]>number[k]) 
	                {
	                a =  number[j];
	                    number[j] = number[k];
	                    number[k] = a;
	 
	                }
	 
	            }
	 
