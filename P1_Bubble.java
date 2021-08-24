package day4;

public class P1_Bubble {

	static void bubblesort(int a[])
	{
		int n = a.length;
		int i,j,temp;
		for(i=0;i<n-1;i++)
		{
			for(j=0;j<n-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {11,2,3,44,5,7};
		bubblesort(a);
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
 * 
 * n=5	11	2	33	4	1				
	0	1	2	3	4				
									
i=0	11	2					i	cmp	n-1-i
cmp=4	2	11	33				0	4	4-0=4
			33	4			1	3	4-1=3
			4	33	1		2	2	4-2=2
	2	11	4	1	33		3	1	4-3=1
									
i=1	2	11	4	1					
cmp=3		11	4						
		4	11	1					
			1	11					
i=2	2	4	1						
cmp=2		4	1						
	2	1	4						
									
i=3	2	1							
cmp=1		2							

*/
