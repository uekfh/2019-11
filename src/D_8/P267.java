package D_8;

import java.awt.image.ImagingOpException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class P267 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		RandomAccessFile raf=new RandomAccessFile("r.txt", "rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			System.out.println("������������"+times+"��");
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else
		{
			System.out.println("ʹ�ô��������꣡");
			
		}
		raf.close();
	}
}
