package D_12;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;

public class P277 {
	public static void main(String[] args) throws IOException {
		Path dir=Paths.get("E:\\EUNJUNG\\java����\\sample");
		try {
			Files.createDirectories(dir);
			System.out.println("Ŀ¼�����ɹ�");
		}catch(IIOException e){
			System.out.println("Ŀ¼�������ɹ�");
		}
		Path wod=Paths.get("E:\\EUNJUNG\\java����\\sample\\wod.txt");
		try {
			Files.createFile(wod);
			System.out.println("�ļ������ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�ļ��������ɹ�");
		}
		List list=new ArrayList<>();
		list.add("���Ե����İ�����");
		
		try {
			Files.write(wod, list, StandardOpenOption.APPEND);
			System.out.println("�ļ�д��ɹ�");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("�ļ�д�벻�ɹ�");
			
		}
		List<String> lines=Files.readAllLines(wod);
		System.out.println("�ļ������ǣ�"+lines);
		System.out.println("�ļ���С�ǣ�"+Files.size(wod));
	}
}
