public class Email {

    public Employee Sender;
    public Employee Receipt;
    public EmailVendor ReceiptVendor;
    public EmailVendor SenderVendor;
    private String Body;

    public String toString() 
    {
        StringBuilder strBuilder = new StringBuilder();

        strBuilder.append("New Email \n");
        strBuilder.append("From: " + this.Sender.Name + this.SenderVendor.getPostFix() + "\n");
        strBuilder.append("To: " + this.Receipt.Name + this.ReceiptVendor.getPostFix() + "\n");
        strBuilder.append("using the following info: " + "\n");
        strBuilder.append("SMTP: " + this.SenderVendor.getServerAddress() + "\n");
        strBuilder.append("SMTP user: " + EmailVendor.userName + "\n");
        strBuilder.append("SMTP pass: " + EmailVendor.password + "\n");
        strBuilder.append(this.Body + "\n");

        return strBuilder.toString();
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }
}