import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class fuzhi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileHandler.copy(new File("F:\\1"), new File("F:\\2"));//����1�ļ����µ������ļ���2
		FileHandler.copy(new File("F:\\1"), new File("F:\\2"),".jpg");
		FileHandler.createDir(new File("F:\\3"));//����3�ļ���
		Thread.sleep(3000);
		FileHandler.delete(new File("F:\\3"));//ɾ��3�ļ���
		ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("F:\\1\\2.txt"));//�����ļ�
		a.writeObject("Hello World");//д���ļ�
		String file=FileHandler.readAsString(new File("F:\\1\\2.txt"));//��ȡ1�ļ����е�2.txt
		System.out.println(file);
		ObjectOutputStream b=new ObjectOutputStream(new FileOutputStream("F:\\1\\3.txt"));//��һ�ִ����ļ�
		b.writeObject("Hello World");//д���ļ�
		FileOutputStream out=new FileOutputStream("F:\\1\\4.txt");//�ڶ��ִ����ļ�
		String str="Hello World";
		//д���ļ�
		byte[] c=str.getBytes();
		for(int i=0;i<str.length();i++)
		{
			out.write(c[i]);
		}

	}

}
