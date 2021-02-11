public class EmailVendor implements Vendors
    {
        public String name;

        private String serverAddress;
        private String postFix;

        private final static String userName = "admin";
        private final static String password = "admin";

        public EmailVendor(String VendorName)
        {
            this.name = VendorName;
        }
        public void managePreferences(String serverAddress,String postFix)
        {
            this.serverAddress = serverAddress;
            this.postFix = postFix;
        }

        public String getserverAddress()
        {
            return this.serverAddress;
        }

        public void sendEmail(String recipient)
        {
            System.out.println("sending an email to:"); 
            System.out.println(recipient);
            System.out.println("using the following info:");
            System.out.println("SMTP: " + this.serverAddress);
            System.out.println("From: " + name + this.postFix);
            System.out.println("SMTP user: " + userName);
            System.out.println("SMTP pass: " + password);
            
        }
        public void checkForNewEmails()
        {
            System.out.println("checking for a new emails!");
        }

        
    
    public static void main(String[] args)
    {
        System.out.println("Lets do it!");

        EmailVendor Gmail = new EmailVendor("gmail");
        Gmail.managePreferences("smtp.gmail.com", "@gmail.com");
        System.out.println(Gmail.getserverAddress());

        EmailVendor Walla = new EmailVendor("walla");
        Walla.managePreferences("smtp.walla.co.il", "@walla.co.il");
        System.out.println(Walla.getserverAddress());

        EmailVendor Yahoo = new EmailVendor("yahoo");
        Yahoo.managePreferences("smtp.yahoo.com", "@yahoo.com");
        System.out.println(Yahoo.getserverAddress());

        Yahoo.sendEmail("orsan.awawdi@gmail.com");


    }
}