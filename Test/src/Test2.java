import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û:");
		Scanner b=new Scanner(System.in);
		String c=b.next();
		a=c.charAt(0);
		if(a>='a'&&a<='z')
		{
			a=(char)((int)a-32);
			System.out.println(a);
		}
		else if(a>='A'&&a<='Z')
		{
			a=(char)((int)a+32);
			System.out.println(a);
		}
		
	}

}
