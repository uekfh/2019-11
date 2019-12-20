package D_8;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class P274 {

	public static void main(String[] args) throws Exception {
		RandomAccessFile yswj=new RandomAccessFile("E:\\EUNJUNG\\java基础\\src(2).jpg","rw");
		RandomAccessFile mbwj=new RandomAccessFile("E:\\EUNJUNG\\java基础\\dest.jpg","rw");
		FileChannel finc=yswj.getChannel();
		FileChannel foutc=mbwj.getChannel();
		long wjdx=finc.transferTo(0, finc.size(), foutc);
		if (wjdx>0) {
			System.out.println("复制成功");
			
		}
		yswj.close();
		mbwj.close();
		finc.close();
		foutc.close();
	}

}