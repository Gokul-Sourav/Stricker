import java.util.Scanner;


public class Array2 {
static
{
	int i=0,j=0,m=0;
	int a[]=new int[10];
	Scanner s=new Scanner(System.in);
	for(i=0;i<10;i++)
	{
		a[i]=s.nextInt();
		m++;
	}
	for(i=0;i<m;i++)
	{
		for(j=i+1;j<m;j++)
		{
			if(a[i]<a[j])
			{
				int t=a[j];
				a[j]=a[i];
				a[i]=t;
			}
		}
	}
	for(i=0;i<m;i++)
	{
		System.out.println(a[i]);
	}
}
public static void main(String[] args) {
	
}
}
