public class Program 
{
    public static void main(String[] args)
    {
        EmailVendor Gmail = new EmailVendor("gmail","smtp.gmail.com", "@gmail.com");
        EmailVendor Walla = new EmailVendor("walla","smtp.walla.co.il", "@walla.co.il");
        EmailVendor Yahoo = new EmailVendor("yahoo", "smtp.yahoo.com", "@yahoo.com");
        System.out.println("Lets do it!");

        Employee Orsan = new Employee("Orsan");
        Employee Sami = new Employee("Sami");

        Orsan.GmailAccount = Gmail;
        Orsan.YahooAccount = Yahoo;
        Orsan.WallaAccount = Walla;

        Sami.GmailAccount = Gmail;
        Sami.YahooAccount = Yahoo;
        Sami.WallaAccount = Walla;

        SendEmail(Gmail, Orsan, Sami);
    }
    public static void SendEmail(EmailVendor V, Employee From, Employee To)
    {
            V.dispach(From,To);
    }
}
