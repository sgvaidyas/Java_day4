package day4;

public class P3_Insertion {

	static void insertsort(int a[])
	{
		int i,key,n=a.length,j;
		for(i=1;i<n;i++)
		{
			key = a[i];
			j = i-1;

			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {11, 4, 77, 55, 40, 8, 2};
		insertsort(a);
		display(a);
	}
	static void display(int a[])
	{
		System.out.println("Array elements = ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}

/*
 	1	22	33	44	77
	0	1	2	3	4
					
i=	4				
key=	1				
j=	-1		j>=0	&&	a[j]>key
a[j]=					
					
					
a[j+1]			a[j+1]=		
*/
