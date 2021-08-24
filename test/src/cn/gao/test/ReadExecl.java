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
        // ��ȡ Excel �ļ�
        // ��ȡ�ļ�·�����ļ�
        FileInputStream fis = new FileInputStream("C:/Users/Administrator/Desktop/Demo.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        // ��ȡ��һ��������
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        // ʹ��������ȡ������
        // XSSFSheet sheet = workbook.getSheetAt(0);
        int firstRowNum = sheet.getFirstRowNum();//���к�
        System.out.println("��"+firstRowNum);
        XSSFRow row1 = sheet.getRow(firstRowNum);//�����кŶ���
        short firstCellNum = row1.getFirstCellNum();//�����ж��к�
        short lastCellNum = row1.getLastCellNum();

        int lastRowNum = sheet.getLastRowNum();
        System.out.println("��ȡ��"+lastRowNum);
        for (int i = 0; i <lastRowNum ; i++) {
            student=new Student();//һ��һ������
            student.setName(sheet.getRow(i).getCell(0).getStringCellValue());
            student.setInformation(sheet.getRow(i).getCell(1).getStringCellValue());
            studentList.add(student);
            //TO-DO  �������0��1���β��滻��
        }
        // ��ȡָ����
        XSSFRow row = sheet.getRow(0);

        // ��ȡָ����
        XSSFCell cell = row.getCell(0);
        // ��ӡ

        return studentList;
    }
}
