
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
		System.out.println("�����Ϊ��"+c);
		if((c>='a')&&(c<='z'))
		{
			c=(char)  ((int)c - 32);
			System.out.println("���������Сд��ĸ��ת��Ϊ��дΪ��"+c);
		}
		else if((c>='A')&&(c<='Z'))
		{
			c=(char)  ((int)c + 32);
			System.out.println("��������Ǵ�д��ĸ��ת��ΪСдΪ��"+c);
		}

	}

}
