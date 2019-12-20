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

public class 测试表格 {
		private static int i;

		public static void main(String[] args) throws IOException {
			HSSFWorkbook workbook=new HSSFWorkbook();
			HSSFSheet sheet=workbook.createSheet("测试模板");
			
			//创建第一行
			HSSFRow row0=sheet.createRow(0);
			//创建第一行里的单元格
			HSSFCell cell0=row0.createCell(0);
			
			cell0.setCellValue("年级");
			row0.createCell(1).setCellValue("班级编号");
			row0.createCell(2).setCellValue("班级名称");
			row0.createCell(3).setCellValue("项目名称");
			row0.createCell(4).setCellValue("测试老师");
			row0.createCell(5).setCellValue("测试时间");
			row0.createCell(6).setCellValue("测试地点");
			row0.createCell(7).setCellValue("测试器材");
			row0.createCell(8).setCellValue("测试方法"); 
			/*Path wj=Paths.get("班级信息.txt");
			List<String> lines=Files.readAllLines(wj);*/
			for (int i = 0; i <11; i++) {
				HSSFRow rowi =sheet.createRow(i);
				rowi.createCell(0).setCellValue("42");
				rowi.createCell(1).setCellValue("1820101");
				rowi.createCell(2).setCellValue("18播音1班");
				rowi.createCell(3).setCellValue("身高");
				rowi.createCell(4).setCellValue("高佳明");
				rowi.createCell(5).setCellValue("2019/10/29");
				rowi.createCell(6).setCellValue("学院体育馆");
				rowi.createCell(8).setCellValue("2");
			
			}
			
	
			
			
			
			
			
			FileOutputStream fout=new FileOutputStream("d:\\测试模板.xls");
			workbook.write(fout);
			fout.close();
		}
}
