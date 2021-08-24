package cn.gao.test;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadExecl {
    Student student;
    List<Student> studentList = new ArrayList<Student>();
    public List<Student> readTest() throws IOException {
        // 读取 Excel 文件
        // 获取文件路径和文件
        FileInputStream fis = new FileInputStream("C:/Users/Administrator/Desktop/Demo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // 获取第一个工作表
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // 使用索引获取工作表
        // XSSFSheet sheet = workbook.getSheetAt(0);
        int firstRowNum = sheet.getFirstRowNum();//读行号
        System.out.println("第"+firstRowNum);
        XSSFRow row1 = sheet.getRow(firstRowNum);//根据行号读行
        short firstCellNum = row1.getFirstCellNum();//根据行读列号
        short lastCellNum = row1.getLastCellNum();

        int lastRowNum = sheet.getLastRowNum();
        System.out.println("读取行"+lastRowNum);
        for (int i = 0; i <lastRowNum ; i++) {
            student=new Student();//一行一个对象
            student.setName(sheet.getRow(i).getCell(0).getStringCellValue());
            student.setInformation(sheet.getRow(i).getCell(1).getStringCellValue());
            studentList.add(student);
            //TO-DO  把这里的0，1用形参替换掉
        }
        // 获取指定行
        XSSFRow row = sheet.getRow(0);

        // 获取指定列
        XSSFCell cell = row.getCell(0);
        // 打印

        return studentList;
    }
}
