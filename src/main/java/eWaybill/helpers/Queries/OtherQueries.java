package eWaybill.helpers.Queries;

public class OtherQueries {

    public static String otpCodeQuery(String phoneNumber) {

        String otpCodeQuery = "\t\n" +
                "SELECT [OTPCode]\n" +
                "  FROM [security_master_qa].[dbo].[OTPMessages]\n" +
                "  Where PhoneNumber='+968" + phoneNumber + "'";
        return otpCodeQuery;
    }
}
