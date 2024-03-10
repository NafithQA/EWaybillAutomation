package eWaybill.helpers.Queries;

public class OtherQueries {
<<<<<<< Updated upstream

    public static String otpCodeQuery(String phoneNumber) {

        String otpCodeQuery = "\t\n" +
                "SELECT [OTPCode]\n" +
                "  FROM [security_master_qa].[dbo].[OTPMessages]\n" +
                "  Where PhoneNumber='+968" + phoneNumber + "'";
        return otpCodeQuery;
    }
=======
    public static String otpCodeQuery = "SELECT OTPCode FROM [security_master_qa].[dbo].[OTPMessages] WHERE id=(SELECT max(id) FROM [OTPMessages]);\n";
>>>>>>> Stashed changes
}
