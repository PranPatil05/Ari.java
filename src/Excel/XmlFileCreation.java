package Excel;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class XmlFileCreation {
    private static FileInputStream fis ;
    private static XSSFWorkbook workbook ;
    private static List<ITestCase> testCases;

    private static String filepath="E:\\Trial\\src\\DataFiles\\TestCase.xlsx";
    private static List<HashMap<String, String>> data;
    private static HashMap<String, String> rowData;
    private static List<HashMap<String, String>> activeTests;

    public static void main(String[] args) throws IOException {
        getDataFromSheet();
        readActiveCases();
//        creteTestNGXML();
    }

    // Step 1------Read the data of file List<HashMap<String, String>> type
    public static void getDataFromSheet() throws IOException {
        fis = new FileInputStream(filepath);
        workbook = new XSSFWorkbook(fis);
        data = new ArrayList<>();

        List<String> sheets = new ArrayList<>();
        sheets.add("Test");
//        sheets.add("TestSetup");
        for (String sheetName : sheets) {
            XSSFSheet sheet = workbook.getSheet(sheetName);
            XSSFRow header = sheet.getRow(0);
            for (int rowNumber = 1; rowNumber <= sheet.getLastRowNum(); rowNumber++) {
                rowData = new HashMap<>();
                for (int k = 0; k < header.getLastCellNum(); k++) {
                    rowData.put(header.getCell(k).toString(), sheet.getRow(rowNumber).getCell(k).toString());
                }
                data.add(rowData);
            }
        }
//        for (int i=0;i<data.size();i++){
//            System.out.println(data.get(i));
//        }
    }


    public static void readActiveCases() {
        testCases = new ArrayList<>();
        List<HashMap<String, String>> activeTests = data.stream().filter(x -> x.get("RunMode").equalsIgnoreCase("yes")).collect(Collectors.toList());

        for (int i=0;i<activeTests.size();i++){
            System.out.println(activeTests.get(i));
        }

        for (HashMap<String, String> activeTest : activeTests) {
            ITestCase testCase = new ITestCase() {
                @Override
                public String getTestCaseId() {
                    return activeTest.get("TestCaseNo");
                }

                @Override
                public String getClassPath() {
                    return activeTest.get("TestClassPath");
                }

                @Override
                public String getTestSummary() {
                    return null;
                }

                @Override
                public String getTestDescription() {
                    return activeTest.get("TestDescription");
                }

                @Override
                public String getTestSuite() {
                    return null;
                }

                @Override
                public String getTestComponent() {
                    return null;
                }

                @Override
                public String getTestTag() {
                    return null;
                }

                @Override
                public String getTestError() {
                    return null;
                }

                @Override
                public List<String> getTestIssueLinkKeys() {
                    return null;
                }

                @Override
                public List<String> getUnverifiedTestIssueLinkKeys() {
                    return null;
                }

                @Override
                public String getTestGroups() {
                    return activeTest.get("Groups");
                }
            };
            testCases.add(testCase);

        }
    }
}
