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
		Path dir=Paths.get("E:\\EUNJUNG\\java基础\\sample");
		try {
			Files.createDirectories(dir);
			System.out.println("目录创建成功");
		}catch(IIOException e){
			System.out.println("目录创建不成功");
		}
		Path wod=Paths.get("E:\\EUNJUNG\\java基础\\sample\\wod.txt");
		try {
			Files.createFile(wod);
			System.out.println("文件创建成功");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("文件创建不成功");
		}
		List list=new ArrayList<>();
		list.add("来自地狱的阿修罗");
		
		try {
			Files.write(wod, list, StandardOpenOption.APPEND);
			System.out.println("文件写入成功");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("文件写入不成功");
			
		}
		List<String> lines=Files.readAllLines(wod);
		System.out.println("文件内容是："+lines);
		System.out.println("文件大小是："+Files.size(wod));
	}
}
