//package Excel;
//
//import org.apache.poi.ss.usermodel.DataFormatter;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.*;
//
//public class ExcelToHashMap {
//    public static void main(String[] args) throws IOException {
//        DataFormatter formatter = new DataFormatter();
//        FileInputStream fis = new FileInputStream("E:\\Trial\\src\\DataFiles\\FightData.xlsx");
//        XSSFWorkbook workbook = new XSSFWorkbook(fis);
//        XSSFSheet sheet = workbook.getSheet("FindFlightData");
//        XSSFRow row = sheet.getRow(0);
//        List<String> header = new LinkedList<>();
//        List<Map<String,String>> data = new ArrayList<>();
//        Map<String,String> rowData ;
//
//        for(int i=0;i<row.getLastCellNum();i++){
//            header.add(formatter.formatCellValue(row.getCell(i)));
//        }
//
//        for(int i=1;i<=sheet.getLastRowNum();i++){
//            rowData = new HashMap<>();
//            row = sheet.getRow(i);
//
//            for(int j=0;j< row.getLastCellNum();j++){
//                rowData.put(header.get(j),formatter.formatCellValue(row.getCell(j)));
//            }
//
//            data.add(rowData);
//        }
//
//        for (int i=0;i<data.size();i++){
//            System.out.println(data.get(i));
//        }
//
//
//    }
//}
