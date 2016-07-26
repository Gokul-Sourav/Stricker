
public class seed {
static void number(int k)
{
	
	for(int i=1;i<=k;i++)
	{
		if(k%i==0)
		{
			int total=1;
			int t=i;
			int h[]=new int[10];
			int m=0;
			
			while(t!=0)
			{
				h[m]=t%10;
				t=t/10;
				m++;
			}
			
			for(int b=0;b<m;b++)
			{
				
				total=total*h[b];
			}
			
			total=total*i;
			
			if(total==k)
			{
				
				System.out.println(i);
			}
					}
	}
}
public static void main(String[] args) {
	seed.number(3120768);
}
}
