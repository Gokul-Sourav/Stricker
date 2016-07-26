import java.util.Scanner;


public class Chocolate {
static
{
	
	int a,count=1,sum=0;
	a=new Scanner(System.in).nextInt();
	int[] rating=new int[a];
	for(int i=0;i<a;i++)
	{
		rating[i]=new Scanner(System.in).nextInt();
	}
	for(int i=0;i<a;i++)
	{
		for(int j=i+1;j<a;j++)
		{
		if(rating[i]>rating[j])
		{
		int t;
		t=rating[i];
		rating[i]=rating[j];
		rating[j]=t;
		}
		}		
	}
	for(int i=0;i<rating.length-1;i++)
	{

		if(rating[i]<rating[i+1])
		{
			count=count+1;
			sum=sum+count;
		}
		else
		{
			sum=sum+count;
		}
	}
	System.out.println(sum+1);
}
public static void main(String[] args) {
	
}
}
