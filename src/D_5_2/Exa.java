package D_5_2;


import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.FileWriter;
import java.io.IOException;

public class Exa {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("E:\\EUNJUNG\\java»ù´¡\\reader.txt");
		FileWriter fileWriter=new FileWriter("E:\\EUNJUNG\\java»ù´¡\\writer.txt");
		int len=0;
		char[] buff=new char[1024];
		while((len=fileReader.read(buff))!=-1) {
			fileWriter.write(buff,0,len);
		}
		fileReader.close();
		fileWriter.close();
	}
}
