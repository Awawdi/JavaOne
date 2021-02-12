public class Program 
{
    public Program() 
    {

    }

    public static void main(String[] args) 
    {
    EmailVendor Gmail = new EmailVendor("gmail", "smtp.gmail.com", "@gmail.com");
    EmailVendor Walla = new EmailVendor("walla", "smtp.walla.co.il", "@walla.co.il");
    EmailVendor Yahoo = new EmailVendor("yahoo", "smtp.yahoo.com", "@yahoo.com");

     
    Employee Orsan = new Employee("Orsan");
    Orsan.SetAddress(Gmail,Yahoo,Walla);
    Employee Sami = new Employee("Sami");
    Sami.SetAddress(Gmail,Yahoo,Walla);
    
        System.out.println("Lets do it!");

        Email newEmail = new Email();
        newEmail.Sender = Orsan;
        newEmail.Receipt = Sami;
        newEmail.Body = "Body of the Email";
        newEmail.From = Orsan.GmailAccount;
        newEmail.To = Sami.YahooAccount;
        SendEmail(Orsan.GmailAccount, newEmail);
    }
    public static void SendEmail(EmailVendor V, Email email)
    {
        V.dispach(email);
    }
}
