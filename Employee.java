public class Employee 
{
    public String Name;
    public String GmailAddress;
    public String WallaMailAddress;
    public String YahooMailAddress;

    public EmailVendor GmailAccount;  
    public EmailVendor WallaAccount;
	public EmailVendor YahooAccount;


    public Employee(String Name)
    {
        this.Name = Name;
    }
    public void SetAddress(EmailVendor Gmail, EmailVendor Yahoo, EmailVendor Walla)
    {
        this.GmailAccount = Gmail;
        this.GmailAddress = Name.concat( this.GmailAccount.postFix) ;

        this.WallaAccount = Walla;
        this.WallaMailAddress = Name.concat( this.WallaAccount.postFix) ;

        this.YahooAccount = Yahoo;
        this.YahooMailAddress = Name.concat( this.YahooAccount.postFix) ;
    }
}
