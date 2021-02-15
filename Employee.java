public class Employee {
    public String Name;

    private String GmailAddress;
    private String WallaMailAddress;
    private String YahooMailAddress;

    private EmailVendor WallaAccount;
    private EmailVendor YahooAccount;
    private EmailVendor GmailAccount;

    public Employee(String Name) {
        this.Name = Name;
    }

    public void SetAddress(EmailVendor Gmail, EmailVendor Yahoo, EmailVendor Walla) {
        this.GmailAccount = Gmail;
        this.GmailAddress = Name.concat(this.GmailAccount.getPostFix());

        this.WallaAccount = Walla;
        this.WallaMailAddress = Name.concat(this.WallaAccount.getPostFix());

        this.YahooAccount = Yahoo;
        this.YahooMailAddress = Name.concat(this.YahooAccount.getPostFix());
    }

    public String getGmailAddress() {
        return GmailAddress;
    }

    public void setGmailAddress(String gmailAddress) {
        GmailAddress = gmailAddress;
    }

    public String getWallaMailAddress() {
        return WallaMailAddress;
    }

    public void setWallaMailAddress(String wallaMailAddress) {
        WallaMailAddress = wallaMailAddress;
    }

    public String getYahooMailAddress() {
        return YahooMailAddress;
    }

    public void setYahooMailAddress(String yahooMailAddress) {
        YahooMailAddress = yahooMailAddress;
    }

    public EmailVendor getWallaAccount() {
        return WallaAccount;
    }

    public void setWallaAccount(EmailVendor wallaAccount) {
        WallaAccount = wallaAccount;
    }

    public EmailVendor getYahooAccount() {
        return YahooAccount;
    }

    public void setYahooAccount(EmailVendor yahooAccount) {
        YahooAccount = yahooAccount;
    }

    public EmailVendor get_GmailAccount() {
        return GmailAccount;
    }

    public void set_GmailAccount(EmailVendor GmailAccount) {
        this.GmailAccount = GmailAccount;
    }

}