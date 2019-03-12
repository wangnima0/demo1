import java.util.Scanner;
import java.util.concurrent.BrokenBarrierException;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		boolean b;
		System.out.println("请输入一个数:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		do{
			if(a%3==0&&a%5==0&&a%7==0)
			{
				
				System.out.println(a);
				break;
			}
			else{
				
				System.out.println("请重新输入:");
				Scanner c=new Scanner(System.in);
				a=c.nextInt();
				
			}
			
		}while(b=true);
		
	}

}
