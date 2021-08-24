package day4;

public class P2_TCSAlexKProblem {

	static void mysort(int a[],int ind,char oper)
	{
		int i,j,temp;
		for(i=0;i<ind-1;i++)
		{
			for(j=0;j<ind-1-i;j++)
			{
				if(a[j]<a[j+1]  && oper=='<' )
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
				else if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int a[]=new int[] {11, 4, 77, 55, 40, 8, 2};
		int k=3,n=a.length;
		mysort(a,k,'>');
		mysort(a,n-k,'<');
		
		display(a);		
	}
	static void display(int a[])
	{
		System.out.println("Array elements = ");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}
