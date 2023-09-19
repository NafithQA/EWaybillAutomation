package eWaybill.helpers;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelHandler {

    public static void main(String[] args) {

        ExcelHandler excelHandler = new ExcelHandler();
    }

//    public Pair getUserAndPass(String hasTruck, String hasEquipment, String hasAffilication, String hasSubscription, String truckType) {
//
//        FileInputStream file = null;
//        try {
//            file = new FileInputStream(new File(System.getProperty("user.dir")
//                    + File.separator + "src" + File.separator + "main" + File.separator + "resources"
//                    + File.separator + "testData" + File.separator + "subscriptionData.xlsx"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        // Create Workbook instance holding reference to .xlsx file
//        XSSFWorkbook workbook = null;
//        try {
//            workbook = new XSSFWorkbook(file);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Get first/desired sheet from the workbook
//        XSSFSheet sheet = workbook.getSheetAt(2);
//
//        int truckColumn = 4;
//        int equipmentColumn = 5;
//        int affilicationColumn = 6;
//        int subscriptionsColumn = 7;
//        int rowIndex = 1;
//        int userNameColumn = 9;
//        int passwordColumn = 10;
//        int truckTypeColumn = 11;
//
//        String userName = null;
//        int password = 0;
//
//        for (int i = sheet.getPhysicalNumberOfRows(); i >= 0; i--) {
//
//            Row row = CellUtil.getRow(rowIndex, sheet);
//            Cell truckCell = CellUtil.getCell(row, truckColumn);
//            Cell equipmentCell = CellUtil.getCell(row, equipmentColumn);
//            Cell affilicationCell = CellUtil.getCell(row, affilicationColumn);
//            Cell subscriptionsCell = CellUtil.getCell(row, subscriptionsColumn);
//            Cell truckTypeCell = CellUtil.getCell(row, truckTypeColumn);
//            Cell userNameCell = CellUtil.getCell(row, userNameColumn);
//            Cell passwordCell = CellUtil.getCell(row, passwordColumn);
//            String userNameValue = userNameCell.getStringCellValue();
//            int passwordValue = (int) passwordCell.getNumericCellValue();
//
//            if (truckCell.getStringCellValue().equalsIgnoreCase(hasTruck)
//                    && equipmentCell.getStringCellValue().equalsIgnoreCase(hasEquipment)
//                    && affilicationCell.getStringCellValue().equalsIgnoreCase(hasAffilication)
//                    && subscriptionsCell.getStringCellValue().equalsIgnoreCase(hasSubscription)
//                    && truckTypeCell.getStringCellValue().equalsIgnoreCase(truckType)) {
//
//                userName = userNameValue;
//                password = passwordValue;
//                break;
//
//            } else {
//                rowIndex++;
//            }
//        }
//        try {
//            workbook.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return new Pair<String, Integer>(userName, password);
//    }

    public String getValidRNN() {

        FileInputStream file = null;
        try {
            file = new FileInputStream(new File(System.getProperty("user.dir")
                    + File.separator + "src" + File.separator + "main" + File.separator + "resources"
                    + File.separator + "testData" + File.separator + "subscriptionData.xlsx"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Create Workbook instance holding reference to .xlsx file
        XSSFWorkbook workbook = null;
        try {
            workbook = new XSSFWorkbook(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Get first/desired sheet from the workbook
        XSSFSheet sheet = workbook.getSheetAt(4);

        int rnnColumn = 0;
        int statusColumn = 1;
        int rowIndex = 1;

        long rnn = 0;
        long rnnValue = 0;

        for (int i = sheet.getPhysicalNumberOfRows(); i >= 0; i--) {

            Row row = CellUtil.getRow(rowIndex, sheet);
            Cell rnnCell = CellUtil.getCell(row, rnnColumn);
            Cell statusCell = CellUtil.getCell(row, statusColumn);

            rnnValue = (long) rnnCell.getNumericCellValue();

            if (statusCell.getStringCellValue().equalsIgnoreCase("Unused")) {

                rnn = rnnValue;
                break;

            } else {
                rowIndex++;
            }
        }
        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String stringRNN = String.valueOf(rnn);
        return stringRNN;
    }
}
