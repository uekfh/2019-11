package D_8;

import java.io.File;
import java.util.Arrays;

public class P262 {
	public static void main(String[] args) {
		File file=new File("E:\\EUNJUNG\\video");
		/*if(file.isDirectory()) {
			String[] fileName=file.list((dir,name)->name.endsWith(".mp4"));
			Arrays.stream(fileName).forEach(f->System.out.println(f));
		}	*/
		fileDir(file);
	}

	private static void fileDir(File file) {
		// TODO 自动生成的方法存根
		File[] listFiles=file.listFiles();
		for (File files:listFiles) {
			if(files.isDirectory()) {
			fileDir(files);
		}
			System.out.println(files);
		}
	}
}
