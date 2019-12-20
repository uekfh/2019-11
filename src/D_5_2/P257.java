package D_5_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class P257 {
	public static void main(String[] args) throws IOException {
		BufferedReader bReader=new BufferedReader(new FileReader("E:\\EUNJUNG\\java»ù´¡\\reader.txt"));
		BufferedWriter bwriter=new BufferedWriter(new FileWriter("E:\\EUNJUNG\\java»ù´¡\\writer.txt"));
		String string=null;
		while((string=bReader.readLine())!=null) {
			bwriter.write(string);
			bwriter.newLine();
		}
		bReader.close();
		bwriter.close();
	}
}
