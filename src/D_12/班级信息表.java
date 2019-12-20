package D_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 班级信息表 {
	public static void main(String[] args) throws Exception {
		Path wj=Paths.get("E:\\EUNJUNG\\java基础\\tice\\班级信息.txt");
		Path wj2=Paths.get("E:\\EUNJUNG\\java基础\\tice\\求班级编号.txt");
		Path wj3=Paths.get("E:\\EUNJUNG\\java基础\\tice\\班级.txt");
		
		Files.createFile(wj3);
		List<String> list=new ArrayList<>();
		List<String>  lines=Files.readAllLines(wj);
		List<String>  lines2=Files.readAllLines(wj2);
		
		Map<String,String>  map=new HashMap<>();
		for(String line:lines) {
		String[] zfcsz=line.split("");
		map.put(zfcsz[1],zfcsz[0]);
		}
		System.out.println(lines2);
		for(String line2:lines2);{
		list.add(map.get(lines2));
	}
		System.out.println(list);
	Files.write(wj3,list,StandardOpenOption.APPEND);
}
}