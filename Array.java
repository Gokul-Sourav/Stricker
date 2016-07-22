
public class Array {
public void divide(int[] input1)
{
	int i=input1.length;
	int t=0;
	int s=0;
	int x=0,y=0;
	for(x=0;x<=i/2;x++)
	{
		t=t+input1[x];
	}
	t=t/(x);
	System.out.println(t);
	for(y=i-1;y>i/2;y--)
	{
		s=s+input1[y];
	}
	s=s/(y);
	System.out.println(s);
	if(t==s)
	{
		System.out.println("possible");
	}
	else
	{
		System.out.println("Not possible");
	}
}
public static void main(String[] args) {
	Array a=new Array();
	int b[]={-4,-2,-3,-4,-2};
	a.divide(b);
}
}
