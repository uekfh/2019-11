package D_12;

import java.nio.file.Path;
import java.nio.file.Paths;

public class P276 {
	public static void main(String[] args) {
		Path path=Paths.get("E:\\EUNJUNG\\java����\\����");
		System.out.println("Path�ĸ�·����"+path.getRoot());
		System.out.println("Path�ĸ�·����"+path.getParent());
		System.out.println("Path��·����������"+path.getNameCount());
		for (int i = 0; i < path.getNameCount(); i++) {
			Path name = path.getName(i);
			System.out.println("����Ϊ"+i+"��·��������Ϊ��"+name);
		}
		System.out.println("path��url·��Ϊ��"+path.toUri());
		System.out.println("path�ľ���·��Ϊ��"+path.toAbsolutePath());
	}
}
