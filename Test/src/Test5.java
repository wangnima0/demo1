import java.util.Calendar;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,date,month1,date1;
		Calendar c = Calendar.getInstance(); 
		month = c.get(Calendar.MONTH);
		date = c.get(Calendar.DATE);
		System.out.println(month+1+"月"+date+"日");
		xz(month,date);
		
		System.out.println("请输入您的出生年月日:");
		Scanner a=new Scanner(System.in);
		year=a.nextInt();
		month1=a.nextInt();
		date1=a.nextInt();
		xz(month1,date1);
}
		
	public static void xz(int m,int d)
	{
		if((m==1 && d>19 && d<32)||(m==2 && d>0 && d<19))
		{
			System.out.println("水瓶座,运势短评:开心的时刻需自己用心制造。");
		}
		if((m==2 && d>18 && d<31)||(m==3 && d>0 && d<21))
		{
			System.out.println("双鱼座,运势短评:珍惜眼前的机遇。");
		}
		if((m==3 && d>20 && d<32)||(m==4 && d>0 && d<20))
		{
			System.out.println("白羊座,运势短评:忽冷忽热地对待感情是很不利的。");
		}
		if((m==4 && d>19 && d<31)||(m==5 && d>0 && d<21))
		{
			System.out.println("金牛座,运势短评:要主动创造机会。");
		}
		if((m==5 && d>20 && d<32)||(m==6 && d>0 && d<22))
		{
			System.out.println("双子座,运势短评:坚持自己的原则和信念。");
		}
		if((m==6 && d>21 && d<31)||(m==7 && d>0 && d<23))
		{
			System.out.println("巨蟹座,运势短评:平稳的一天，保持原状就好。");
		}
		if((m==7 && d>22 && d<32)||(m==8 && d>0 && d<23))
		{
			System.out.println("狮子座,运势短评:心情起伏，多愁善感的一天。");
		}
		if((m==8 && d>22 && d<31)||(m==9 && d>0 && d<23))
		{
			System.out.println("处女座,运势短评:亲切对人。");
		}
		if((m==9 && d>22 && d<31)||(m==10 && d>0 && d<24))
		{
			System.out.println("天秤座,运势短评:适当等待会时来运转。");
		}
		if((m==10 && d>23 && d<32)||(m==11 && d>0 && d<23))
		{
			System.out.println("天蝎座,运势短评:授人以鱼不如授人以渔。");
		}
		if((m==11 && d>22 && d<31)||(m==12 && d>0 && d<22))
		{
			System.out.println("射手座,运势短评:今天遇事不够冷静，容易冲动。");
		}
		if((m==12 && d>21 && d<32)||(m==1 && d>0 && d<20))
		{
			System.out.println("摩羯座,运势短评:包容度是爱情的重要维持力量。");
		}
	}

}


