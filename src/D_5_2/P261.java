package D_5_2;

import java.io.File;

public class P261 {
	public static void main(String[] args) {
		File file=new File("E://EUNJUNG//java����//flash.txt");
		System.out.println("�ļ�����:"+file.getName());
		System.out.println("�ļ������·����"+file.getPath());
		System.out.println("�ļ��ľ���·����"+file.getAbsolutePath());
		System.out.println("�ļ��ĸ�·��"+file.getParent());
		System.out.println(file.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.canWrite()?"�ļ���д":"�ļ�����д");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		
	}
}
