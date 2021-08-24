package day4;

public class P4_Selectionsort {

	static void selectionsort(int a[])
	{
		int i,j,minind,n=a.length,temp;
		for(i=0;i<n-1;i++)
		{
			minind=i;
			for(j=i+1;j<n;j++)
			{
				if(a[j]<a[minind])
					minind = j;					
			}
			temp = a[i];
			a[i]=a[minind];
			a[minind]=temp;			
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {11, 4, 40, 8, 2};
		selectionsort(a);
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
11	2	33	4	50							
0	1	2	3	4							
											
i=0					a[j] < min						
minind=	0		j=i+1	a[j]	minind	min					
min =	11		1	2	1	2					
			2	33							
			3	4							
			4	50													2	11	33	4	50
			swap(a[0],a[1]) ----> swap(a[i],a[minind])				0	1	2	3	4
			
i=1			2	33							
minind	1		3	4	3	4					
min 	11		4	50	 				2	4	33	11	50
			swap(a[1],a[3])				0	1	2	3	4
											
i=2			3	11	3	11					
minind	2		4	50						2	4	11	33	50
minind	33		swap(a[2],a[3])				0	1	2	3	4
											
											
i=3			4	50							2	4	11	33	50
minind	3		swap(a[3],a[3])				0	1	2	3	4
min 	33										




*/