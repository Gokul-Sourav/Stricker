
public class Sort {
static void sorting(int input1,int delete)
{
	int i=String.valueOf(input1).length();
	int k=delete;
	int l=input1;
			int m=i-1;
			int a[]=new int[l];
	while(l!=0)
	{
		a[m]=l%10;
		l=l/10;
		m--;
	}
	for(int x=0;x<i;x++)
	{
		for(int y=x+1;y<i;y++)
		{
		if(a[x]>a[y])
		{
			int t=a[x];
			a[x]=a[y];
			a[y]=t;
		}
	}
}
	
	for(int x=0;x<i-k;x++)
	{
		System.out.print(a[x]);
	}
}
public static void main(String[] args) {
	sorting(654762,3);
}
}
