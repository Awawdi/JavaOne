public class EmailVendor implements Vendors
    {
        public String name;

        private String serverAddress;
        private String postFix;
        private String preFix;


        private final static String userName = "admin";
        private final static String password = "admin";

        public EmailVendor(String VendorName)
        {
            this.name = VendorName;
        }
        public void managePreferences(String serverAddress,String postFix, Employee Emp)
        {
            this.serverAddress = serverAddress;
            this.postFix = postFix;
            this.preFix= Emp.Name;
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
            System.out.println("From: " + this.preFix + this.postFix);
            System.out.println("SMTP user: " + userName);
            System.out.println("SMTP pass: " + password);
            
        }
        public void checkForNewEmails()
        {
            System.out.println("checking for a new emails!");
        }

        
    
    
}