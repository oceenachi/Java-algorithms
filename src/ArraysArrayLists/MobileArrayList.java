package ArraysArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class MobileArrayList {

    private static Scanner scanner = new Scanner(System.in);
    private static MobileArrayList androidList = new MobileArrayList("1");
//    ArraysArrayLists.MobileArrayList androidList = new ArraysArrayLists.MobileArrayList("1");
    public static void main(String[] args) {

        Contacts phoneList = new Contacts("tyngor", "08130035142");
        Contacts tyngor = new Contacts("tify", "08068308212");
        Contacts somto = new Contacts("sommie", "08125598244");
        Contacts aalee = new Contacts("white", "07068700332");
        Contacts chidi = new Contacts("chidi", "08129090855");
        Contacts uramu = new Contacts("uramu", "09050070107");


        androidList.addNewContact(phoneList);
        androidList.addNewContact(tyngor);
        androidList.addNewContact(somto);
        androidList.addNewContact(aalee);
        androidList.addNewContact(chidi);
        System.out.println(androidList.findContact(chidi));
        System.out.println(androidList.findContact("white"));
        System.out.println(androidList.updateContact(chidi, uramu));
        System.out.println(androidList.findContact(chidi));

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\n Shutting down ....");
                    quit = true;
                    break;
                case 1:
                    androidList.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }


    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contacts newContact = Contacts.createContact(name, phone);
        if(androidList.addNewContact(newContact)) {
            System.out.println("New contact " + name + " with phone number "+ phone + " added.");
        }
        else{
            System.out.println("cannot add, "+name+ " already on the list file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = androidList.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone Number:");
        String phoneNum = scanner.nextLine();

        Contacts newContact = Contacts.createContact(newName, phoneNum);
        if(androidList.updateContact(existingContactRecord, newContact)) {
            System.out.println("successfully updated your details");
        }
        else{
            System.out.println("Error updating records");
        }

    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = androidList.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if(androidList.removeContact(existingContactRecord)) {
            System.out.println("successfully deleted");
        }
        else{
            System.out.println("error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contacts existingContactRecord = androidList.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+ " phone Number is " +existingContactRecord.getPhonenumber());
    }


    private static void startPhone(){
        System.out.println("phone is starting ....");
    }
    private static void printActions(){
        System.out.println("\nAvailable Actions:\npress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                            "2 - to add new contacts\n" +
                            "3 - to update existing contacts\n" +
                            "4 - to remove an existing contact\n" +
                            "5 - query id a contact exists\n" +
                            "6 - to print a list of available actions");
        System.out.println("choose your preferred action: ");
    }


    private String myNumber;
    private ArrayList<Contacts> contact;

    public MobileArrayList(String myNumber) {
        this.myNumber = myNumber;
        this.contact = new ArrayList<Contacts>();
    }

    public boolean addNewContact (Contacts newcontact) {
        if(findContact(newcontact.getName()) >= 0 ) {
            System.out.println("contact name already exists");
            return false;
            }
        contact.add(newcontact);
        return true;
    }
    public boolean updateContact(Contacts oldContact, Contacts newContact) {
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        }
        else if (findContact(newContact.getName()) != -1) {
            System.out.println("contact with name" + newContact.getName() + " already exists. unsuccessful update" );
            return false;
        }
        this.contact.set(foundPosition, newContact);
        System.out.println(oldContact);
        return true;
    }
    public boolean removeContact (Contacts contact) {
        int queryID = findContact(contact);
        if(queryID >= 0) {
            this.contact.remove(queryID);
            System.out.println(contact.getName() + " deleted successfully");
            return true;
        }
        else{
            System.out.println(contact.getName() + " was not found");
            return false;
        }
    }

    private int findContact(Contacts contact) {
        return this.contact.indexOf(contact);
    }

    private int findContact(String contactName) {
        for(int i= 0; i < this.contact.size(); i++) {
            Contacts contact = this.contact.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contacts contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contacts queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.contact.get(position);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("contact list");
        for(int i=0; i<this.contact.size(); i++) {
            System.out.println((i+1) + "." +
                    this.contact.get(i).getName() + "->" +
                    this.contact.get(i).getPhonenumber());
        }
    }
}
