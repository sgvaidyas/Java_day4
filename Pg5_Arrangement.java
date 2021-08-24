package day4;

public class Pg5_Arrangement {

	public static void main(String[] args) {
		int n=8;
		int a[] = new int[n] ;
		
		int c1 = 1,c2=n;
		for(int i=0;i<n;i++)
		{
			a[i] = (i%2==0)?c1++:c2--;
		}
		display(a);
	}
	static void display(int a[])
	{
		System.out.println("\nArray elements = ");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
	}


}
