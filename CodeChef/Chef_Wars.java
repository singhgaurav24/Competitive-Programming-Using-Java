/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
public class Chef_Wars
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		if(sc.hasNext()){
		int t = sc.nextInt();
		while(t-- > 0){
		    int p = sc.nextInt();
		    int h = sc.nextInt();
		    if(h >= p/2){
		           a.add(1);
		        }
		        else{
		           a.add(0);
		        }
		   	}
		
		}
	
	for(int i = 0 ; i<a.size();i++) {
		System.out.println(a.get(i));
	   }
	    
	}
}
