public class Constructor {

    private String name;
    private String emailAddress;
    private float creditLimit;

    public Constructor(String name) {
        this(name, "default@gmail.com", (float) 50.99);
    }

    public Constructor(String emailAddress, float creditLimit) {
        this("default", emailAddress, creditLimit);
    }

    public Constructor(String name, String emailAddress, float creditLimit) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(float creditLimit) {
        this.creditLimit = creditLimit;
    }

}
