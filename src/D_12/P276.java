package D_12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class P276 {
	public static void main(String[] args) {
		Path path=Paths.get("E:\\EUNJUNG\\java基础\\杂物");
		System.out.println("Path的根路径："+path.getRoot());
		System.out.println("Path的父路径："+path.getParent());
		System.out.println("Path的路径名称数："+path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			Path name = path.getName(i);
			System.out.println("索引为"+i+"的路径的名称为："+name);
		}
		System.out.println("path的url路径为："+path.toUri());
		System.out.println("path的绝对路径为："+path.toAbsolutePath());
	}
}
