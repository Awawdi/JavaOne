public class EmailVendor {

    public String name;
    private String serverAddress;
    private String postFix;

    public static final String userName = "admin";
    public static final String password = "admin";

    public EmailVendor(String VendorName, String serverAddress, String postFix) {
        this.name = VendorName;
        this.postFix = postFix;
        this.serverAddress = serverAddress;
    }

    public String getServerAddress() {
        return serverAddress;
    }

    public void setServerAddress(String serverAddress) {
        this.serverAddress = serverAddress;
    }

    public String getPostFix() {
        return postFix;
    }

    public void setPostFix(String postFix) {
        this.postFix = postFix;
    }
}