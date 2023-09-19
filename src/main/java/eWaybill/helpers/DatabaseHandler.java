package eWaybill.helpers;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler {

    public static void main(String[] args) {

        DatabaseHandler databaseHandler = new DatabaseHandler();
//        ArrayList<String> testsInformations = databaseHandler.getTestsInformationsFromDataBase(OtherQueries.testsInformationsQuery);

//        System.out.println("Payment method is : " + testsInformations.get(1));
//
        ArrayList<String> testData = databaseHandler.getTestsInformationsFromDataBase("select u.login Username,'123456'password,u.role_code Rolecode,FV.PLATE_NUMBER,FV.PLATE_CODE_AR,FV.PLATE_CODE_EN,'PPH00004' c1,'PPH000044'c2,'ACCESS'c3,'4'Du,'5'c4,'4'L  from OmanTCS_QA.dbo.Users u,OmanTCS_QA.dbo.FLEET_VIEW FV,OmanTCS_QA.dbo.COMPANIES_VIEW CV  Where u.status_code='ACTIVE' and u.RELATED_ENTITY_ID=11 and u.RELATED_ENTITY_RECORD_ID=CV.ID and FV.ENTITY_ID=8 and FV.RELATED_ENTITY_ID  = 11 and CV.ID=FV.RELATED_ENTITY_record_ID and U.role_code  in  ('COMPANIES_ADMIN')  and FV.ENTITY_ID in('8')  and FV.STATUS_CODE in('INCOMPLETE') and FV.property_value in('HEAVY')and FV.ENTITY_RECORD_ID not in(select ISNULL(sv.fleet_entity_record_id,0)from OmanTCS_QA.dbo.subscriptions_view sv where  sv.status_code in('ACTIVE' , 'PENDING' , 'PLANNED')and sv.fleet_entity_id=8 and service_code ='ACCESS')");
        System.out.println(testData.get(0));
    }

    // This hits the initial query to get Tests Informations and Queries             # 1 #
    public ArrayList<String> getTestsInformationsFromDataBase(String query) {
        // Build sql server jdbc connection url use sql server account authentication.
        String host = "82.212.90.190";
        String dbName = "QA_MAMS";
        String connectionUserName = "omantcs";
        String connectionPassword = "123456";

        String sqlServerConnectionUrl = "jdbc:sqlserver://" + host + ";databaseName=" + dbName + ";user=" + connectionUserName + ";password=" + connectionPassword + "";

        // Declare the JDBC objects.
        Connection dbConnection = null;
        Connection dbConnection1 = null;
        Statement statement = null;
        Statement statement1 = null;
        ResultSet resultSet = null;
        ResultSet resultSet1 = null;

        List<String> returnedResultSet = new ArrayList<String>();

        String id = null;
        String testScenarioId = null;
        String testCaseId = null;
        String testCaseQuery = null;
        String testType = null;

        try {
            // Get connection.
            dbConnection = DriverManager.getConnection(sqlServerConnectionUrl);
            dbConnection1 = DriverManager.getConnection(sqlServerConnectionUrl);

            // Execute sql and return data result.
            String SQL = query;
            statement = dbConnection.createStatement();
            statement1 = dbConnection1.createStatement();
            resultSet = statement.executeQuery(SQL);
            resultSet1 = statement1.executeQuery(SQL);

            int rowCount = 0;
            int columnCount = 0;

            ResultSetMetaData resultSet_metaData = resultSet1.getMetaData();
            columnCount = resultSet_metaData.getColumnCount();

            // Get Row Count
            while (resultSet1.next()) {
                rowCount++;
            }

            System.out.println("Column Count is : " + columnCount);
            System.out.println("Row Count is : " + rowCount);

            // ArrayLists to store column's results sets
            ArrayList<String> idResultSet = new ArrayList<String>();
            ArrayList<String> testScenarioIdResultSet = new ArrayList<String>();
            ArrayList<String> testCaseIdResultSet = new ArrayList<String>();
            ArrayList<String> testCaseQueryResultSet = new ArrayList<String>();
            ArrayList<String> testTypeResultSet = new ArrayList<String>();

            // Loop the data result and display the data.
            while (resultSet.next()) {

                // Storing results sets into ArrayLists
                id = String.valueOf(idResultSet.add(resultSet.getString("id")));
                testScenarioId = String.valueOf(testScenarioIdResultSet.add(resultSet.getString("test_scenario_id")));
                testCaseId = String.valueOf(testCaseIdResultSet.add(resultSet.getString("test_case_id")));
                testCaseQuery = String.valueOf(testCaseQueryResultSet.add(resultSet.getString("test_case_query")));
                testType = String.valueOf(testTypeResultSet.add(resultSet.getString("test_type")));
            }

            // Adding all results sets into the main returnedResultSet to be returned to the requester
            int index = rowCount - 1;
            returnedResultSet.add(idResultSet.get(index));
            returnedResultSet.add(testScenarioIdResultSet.get(index));
            returnedResultSet.add(testCaseIdResultSet.get(index));
            returnedResultSet.add(testCaseQueryResultSet.get(index));
            returnedResultSet.add(testTypeResultSet.get(index));

            // Printing values of results sets
            System.out.println("ID : " + idResultSet.get(index));
            System.out.println("TEST_SCENARIO_ID : " + testScenarioIdResultSet.get(index));
            System.out.println("TEST_CASE_ID : " + testCaseIdResultSet.get(index));
            System.out.println("TEST_CASE_QUERY : " + testCaseQueryResultSet.get(index));
            System.out.println("TEST_TYPE : " + testTypeResultSet.get(index));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (resultSet1 != null) {
                try {
                    resultSet1.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return (ArrayList<String>) returnedResultSet;
    }
}
