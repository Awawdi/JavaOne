import java.text.SimpleDateFormat;
import java.util.Date;

public class Program 
{
    public static void main(String[] args) 
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(formatter.format(date));

        EmailVendor Gmail = new EmailVendor("gmail", "smtp.gmail.com", "@gmail.com");
        EmailVendor Walla = new EmailVendor("walla", "smtp.walla.co.il", "@walla.co.il");
        EmailVendor Yahoo = new EmailVendor("yahoo", "smtp.yahoo.com", "@yahoo.com");


        Employee Orsan = new Employee("Orsan");
        Orsan.SetAddress(Gmail,Yahoo,Walla);
        Employee Sami = new Employee("Sami");
        Sami.SetAddress(Gmail,Yahoo,Walla);
    
        System.out.println("Lets do it!\n");

        Email newEmail = new Email();
        newEmail.Sender = Orsan;
        newEmail.Receipt = Sami;
        newEmail.setBody("[Time "+ formatter.format(date) +"]\n"+ "Body of the Email ...\n");
        newEmail.SenderVendor = Orsan.getWallaAccount();
        newEmail.ReceiptVendor = Sami.getWallaAccount();

        EmailClient client = new EmailClient();
        client.dispach(newEmail);
    }
}