import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i;
		int t = 0;
		int [] a=new int[10];
		Scanner sc=new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.println("ÇëÊäÈë"+(i+1)+"¸öÊý");
			a[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			for(int j=i+1;j<10;j++)
			{
				if(a[i]<a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		for(i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
