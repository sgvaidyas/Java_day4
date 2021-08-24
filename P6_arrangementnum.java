package day4;

import java.util.Scanner;

public class P6_arrangementnum {

	public static void main(String[] args) {

		int n,i,j,m;
		System.out.println("Enter n=");
		Scanner ob = new Scanner(System.in);
		
		n= ob.nextInt();
		
		m=(n%2==0)? n/2 : (n+1)/2;
		
		for(i=1,j=n;i<=m;i++,j--)
		{
			if(i==j)
				System.out.print(i );
			else
				System.out.print(i + " "+ j+" ");
		}

	}

}
