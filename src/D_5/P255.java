package D_5;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;import java.io.WriteAbortedException;

public class P255 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("E:\\EUNJUNG\\java»ù´¡\\text.txt");
		int len=0;
		while ((len=fileReader.read())!=-1) {
			System.out.print((char)len);
		}
	
		fileReader.close();
	}
		
		
}
