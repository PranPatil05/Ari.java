package Excel;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ExcelReadPractice {
    public static void main(String[] args) throws IOException {
        DataFormatter dataFormatter=new DataFormatter();
        FileInputStream inputStream=new FileInputStream("F:\\Trial\\src\\DataFiles\\FightData.xlsx");
        List<String> header=new LinkedList<String>();

        XSSFWorkbook workbook=new XSSFWorkbook(inputStream);
        XSSFSheet sheet=workbook.getSheet("FindFlightData");

        int rowlength=sheet.getLastRowNum();
        int cellLength=sheet.getRow(0).getLastCellNum();

        System.out.println(rowlength);
        System.out.println(cellLength);
        XSSFRow row=sheet.getRow(0);
        XSSFCell cell;

        //Header Fields

        List<String> header1=new ArrayList<>();
        List<String> tripTypes=new LinkedList<String>();

        for (int i=0;i<rowlength;i++){
            header1.add(dataFormatter.formatCellValue(row.getCell(i)));
        }

        for (int j=0;j<rowlength;j++){
            String value=dataFormatter.formatCellValue(row.getCell(j));
//            System.out.println(value);
            if(value.equals("Trip Type")){
//                XSSFCell tr=sheet.getRow(4).getCell(j);
//                XSSFCell tripTyprr= tr.getCell(j);

                for (int k=1;k<cellLength;k++){
                    XSSFCell tr=sheet.getRow(k).getCell(j);
                    tripTypes.add(String.valueOf(sheet.getRow(k).getCell(j)));
                    System.out.println("Trip Type: "+tr);
                }
            }
        }

        Iterator itr= header1.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Iterator itr1=tripTypes.listIterator();
        while (itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

    }
}
