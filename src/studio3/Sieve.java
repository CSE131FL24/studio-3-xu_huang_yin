package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What's the number you need to find all prime numbers up to?");
		Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int [] numList= new int [n];
			boolean [] numTrueFalse = new boolean [n];
			
			
			//the contents of the two arrays
			int p = 1;
			for (p = 1; p <= n; p++) {
			     numList[p-1]=p;
			     numTrueFalse[p-1] = true;}
			System.out.println();
				
			
			
			//Initiating the sieve process	
			int i = 0;
			int j = 2;
			for (j=2; j<=10; j++)
				for (i=0; i<n; i++) {
				if (numList[i] * j == 0 && numList[i] != 2 && numList[i] * j <= n) {
					 numTrueFalse[j*i+i] = false;
					 
				}
				}

		    int k = 1;
		    		for (k=1; k<=n; k++) {
		    			if (numList[k] != 0 && numTrueFalse[k])
		    			System.out.print( numList[k] + " ");
		    		}
			
		
			}
        
        
	}


