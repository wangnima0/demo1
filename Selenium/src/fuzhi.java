import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.openqa.selenium.io.FileHandler;

public class fuzhi {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileHandler.copy(new File("F:\\1"), new File("F:\\2"));//复制1文件夹下的所有文件到2
		FileHandler.copy(new File("F:\\1"), new File("F:\\2"),".jpg");
		FileHandler.createDir(new File("F:\\3"));//创建3文件夹
		Thread.sleep(3000);
		FileHandler.delete(new File("F:\\3"));//删除3文件夹
		ObjectOutputStream a=new ObjectOutputStream(new FileOutputStream("F:\\1\\2.txt"));//创建文件
		a.writeObject("Hello World");//写入文件
		String file=FileHandler.readAsString(new File("F:\\1\\2.txt"));//读取1文件夹中的2.txt
		System.out.println(file);
		ObjectOutputStream b=new ObjectOutputStream(new FileOutputStream("F:\\1\\3.txt"));//第一种创建文件
		b.writeObject("Hello World");//写入文件
		FileOutputStream out=new FileOutputStream("F:\\1\\4.txt");//第二种创建文件
		String str="Hello World";
		//写入文件
		byte[] c=str.getBytes();
		for(int i=0;i<str.length();i++)
		{
			out.write(c[i]);
		}

	}

}
