import java.io.*;
	import java.util.Arrays; 
	class Test 
	{ 
	    static int arr[]=new int[]{51,50,70,80,90}; 
	    static int index[]=new int[]{3,0,4,1,2}; 
	    static void reorder() 
	    { 
	        int temp[]=new int[arr.length]; 
	        for(int i=0;i<arr.length;i++) 
	            temp[index[i]]=arr[i];
	        for(int i=0;i<arr.length;i++) 
	        {  
	           arr[i]=temp[i]; 
	           index[i]=i; 
	        } 
	    } 
	    public static void main(String[] args)  
	    { 
	        reorder();
	        System.out.println("Reordered array is:"); 
	        System.out.println(Arrays.toString(arr)); 
	        System.out.println("Modified Index array is:"); 
	        System.out.println(Arrays.toString(index)); 
	          
	    } 
	} 
