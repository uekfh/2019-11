package D_15;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ���Ա�� {
		private static int i;

		public static void main(String[] args) throws IOException {
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet=workbook.createSheet("����ģ��");
			
			//������һ��
			HSSFRow row0=sheet.createRow(0);
			//������һ����ĵ�Ԫ��
			HSSFCell cell0=row0.createCell(0);
			
			cell0.setCellValue("�꼶");
			row0.createCell(1).setCellValue("�༶���");
			row0.createCell(2).setCellValue("�༶����");
			row0.createCell(3).setCellValue("��Ŀ����");
			row0.createCell(4).setCellValue("������ʦ");
			row0.createCell(5).setCellValue("����ʱ��");
			row0.createCell(6).setCellValue("���Եص�");
			row0.createCell(7).setCellValue("��������");
			row0.createCell(8).setCellValue("���Է���"); 
			/*Path wj=Paths.get("�༶��Ϣ.txt");
			List<String> lines=Files.readAllLines(wj);*/
			for (int i = 0; i <11; i++) {
				HSSFRow rowi =sheet.createRow(i);
				rowi.createCell(0).setCellValue("42");
				rowi.createCell(1).setCellValue("1820101");
				rowi.createCell(2).setCellValue("18����1��");
				rowi.createCell(3).setCellValue("���");
				rowi.createCell(4).setCellValue("�߼���");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("ѧԺ������");
				rowi.createCell(8).setCellValue("2");
			
			}
			
	
			
			
			
			
			
			FileOutputStream fout=new FileOutputStream("d:\\����ģ��.xls");
			workbook.write(fout);
			fout.close();
		}
}
