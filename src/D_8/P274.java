package D_8;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class P274 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile yswj=new RandomAccessFile("E:\\EUNJUNG\\java����\\src(2).jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("E:\\EUNJUNG\\java����\\dest.jpg","rw");
		FileChannel finc=yswj.getChannel();
		FileChannel foutc=mbwj.getChannel();
		long wjdx=finc.transferTo(0, finc.size(), foutc);
		if (wjdx>0) {
			System.out.println("���Ƴɹ�");
			
		}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();
	}

}