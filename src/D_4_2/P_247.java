package D_4_2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class P_247 {
	public static void main(String[] args) throws Exception {
		/*FileInputStream in=new FileInputStream("E:\\EUNJUNG\\java����\\test.txt");
		FileOutputStream fout=new FileOutputStream("E:\\EUNJUNG\\java����\\dest.dxt");*/
		FileInputStream fin=new FileInputStream("E:\\EUNJUNG\\java����\\src.jpg");
		FileOutputStream fout=new FileOutputStream("E:\\EUNJUNG\\java����\\src1.jpg");
		
		long play=System.currentTimeMillis();
		
		int b=fin.read();
		while ((b=fin.read())!=-1) {
			System.out.println(b);
			fout.write(b);
			b=fin.read();
		}
		long over=System.currentTimeMillis();
		System.out.println("����ͼƬʱ��Ϊ��"+(over-play)+"s");
		/*String string="the flash";
		fout.write(string.getBytes("UTF-8"));
		in.close();
		fout.close();*/
	}
}
