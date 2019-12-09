package ArraysArrayLists;

public class Contacts {
    private String name;
    private String phonenumber;

    public Contacts(String name, String phonenumber) {
        this.name = name;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }
    public static Contacts createContact(String name, String phonenumber) {
        return new Contacts(name, phonenumber);
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }


}
