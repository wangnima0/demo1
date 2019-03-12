
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=(int) (Math.random()*2);
		char c;
		if (a==0)
		{
			a='a';
			}
		else if(a==1)
		{
			a='A';
		}
		c=(char)((int)(Math.random()*26+a));
		System.out.println("随机数为："+c);
		if((c>='a')&&(c<='z'))
		{
			c=(char)  ((int)c - 32);
			System.out.println("你输入的是小写字母，转化为大写为："+c);
		}
		else if((c>='A')&&(c<='Z'))
		{
			c=(char)  ((int)c + 32);
			System.out.println("你输入的是大写字母，转化为小写为："+c);
		}

	}

}
