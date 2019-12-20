package D_5_2;

import java.io.File;

public class P261 {
	public static void main(String[] args) {
		File file=new File("E://EUNJUNG//java基础//flash.txt");
		System.out.println("文件名称:"+file.getName());
		System.out.println("文件的相对路径："+file.getPath());
		System.out.println("文件的绝对路径："+file.getAbsolutePath());
		System.out.println("文件的父路径"+file.getParent());
		System.out.println(file.canRead()?"文件可读":"文件不可读");
		System.out.println(file.canWrite()?"文件可写":"文件不可写");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		System.out.println(file.isFile()?"是一个文件":"不是一个文件");
		
	}
}
