public class BankAccountPasco {
    private String accountName;
    private String address;
    private String birthday;
    private String contactNumber;
    // Default Constructor
    public BankAccountPasco() {
        accountName = "";
        address = "";
        birthday = "";
        contactNumber = "";
    }
    // Parameterized Constructor
    public BankAccountPasco(String accountName,
                            String address,
                            String birthday,
                            String contactNumber) {
        this.accountName = accountName;
        this.address = address;
        this.birthday = birthday;
        this.contactNumber = contactNumber;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    public void getClientDetails() {
        System.out.println("-----------------------------");
        System.out.println("Client Name : " + accountName);
        System.out.println("Address     : " + address);
        System.out.println("Birthday    : " + birthday);
        System.out.println("Contact No. : " + contactNumber);
    }
}