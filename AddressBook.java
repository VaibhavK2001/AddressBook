import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class Contact {

    private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String email;
    private String pohneNo;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPohneNo() {
        return pohneNo;
    }

    public void setPohneNo(String pohneNo) {
        this.pohneNo = pohneNo;
    }

    public Contact() {
        //Empty Constructor
    }

    Scanner scanner = new Scanner(System.in); 
    
    ArrayList<Contact> contactList = new ArrayList<Contact>();

    public Contact(String fname, String lname, String address, String city, String state, int zip,String email,String pohneNo) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.pohneNo = pohneNo;
        this.email = email;
    }

    public boolean addContact(){

        System.out.println();
        System.out.println("Enter Contact Details\n");
        System.out.println("Enter First Name :");
        String fname = scanner.nextLine();

        if (contactList.stream().anyMatch(contact->contact.getFname().equalsIgnoreCase(fname))) {
            return false;
        }else{
            System.out.println("Enter Last Name : ");
            String lname = scanner.nextLine();
            System.out.println("Enter Address : ");
            String address = scanner.nextLine();
            System.out.println("Enter City : ");
            String city = scanner.nextLine();
            System.out.println("Enter State : ");
            String state = scanner.nextLine();
            System.out.println("Enter Zip code :");
            int zip = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Phone No : ");
            String phoneNo = scanner.nextLine();
            System.out.println("Enter Email : ");
            String email = scanner.nextLine();

            Contact contact = new Contact(fname, lname, address, city, state, zip, email, phoneNo);
            contactList.add(contact);
            return true;
        }

    }

    public void editContact(String name){
        // Scanner scanner = new Scanner(System.in);
        boolean flag = false; boolean temp = true;
        for (Contact contact : contactList) {
            if (name.equalsIgnoreCase(contact.getFname())) {
                flag = true;
                System.out.println();
                System.out.println("Enter what to update:");
                System.out.println("1. First Name");
                System.out.println("2. Last Name");
                System.out.println("3. Address");
                System.out.println("4. City");
                System.out.println("5. State");
                System.out.println("6. Zip");
                System.out.println("7. Phone Number");
                System.out.println("8. Email");
                System.out.println("9. Update All");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter First Name : ");
                        String fName = scanner.nextLine();
                        contact.setFname(fName);
                        break;
                    
                    case 2:
                        System.out.println("Enter Last Name : ");
                        String lName = scanner.nextLine();
                        contact.setLname(lName);
                        break;
                    
                    case 3:
                        System.out.println("Enter Address : ");
                        String address = scanner.nextLine();
                        contact.setAddress(address);
                        break;

                    case 4:
                        System.out.println("Enter City : ");
                        String city = scanner.nextLine();
                        contact.setCity(city);
                        break;

                    case 5:
                        System.out.println("Enter State : ");
                        String state = scanner.nextLine();
                        contact.setState(state);
                        break;

                    case 6:
                        System.out.println("Enter Zip Code : ");
                        int zip = scanner.nextInt();
                        scanner.nextLine();
                        contact.setZip(zip);
                        break;

                    case 7:
                        System.out.println("Enter Phone Number :");
                        String phone = scanner.nextLine();
                        contact.setPohneNo(phone);
                        break;

                    case 8:
                        System.out.println("Enter Email : ");
                        String mail = scanner.nextLine();
                        contact.setEmail(mail);
                        break;

                    case 9:
                        System.out.println("Enter Contact Details\n");
                        System.out.println("Enter First Name :");
                        String fname = scanner.nextLine();
                        System.out.println("Enter Last Name : ");
                        String lname = scanner.nextLine();
                        System.out.println("Enter Address : ");
                        String add = scanner.nextLine();
                        System.out.println("Enter City : ");
                        String city1 = scanner.nextLine();
                        System.out.println("Enter State : ");
                        String state1 = scanner.nextLine();
                        System.out.println("Enter Zip code :");
                        int zip1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Phone No : ");
                        String phoneNo = scanner.nextLine();
                        System.out.println("Enter Email : ");
                        String email = scanner.nextLine();

                        contact.setFname(fname);
                        contact.setLname(lname);
                        contact.setAddress(add);
                        contact.setCity(city1);
                        contact.setState(state1);
                        contact.setZip(zip1);
                        contact.setPohneNo(phoneNo);
                        contact.setEmail(email);
                        break;


                    default:
                        System.out.println("Wrong input");
                        temp = false;
                        break;
                }
            }
        }
            if (temp && flag) {
                System.out.println("Contact Updated Successfully...");
            }
            if (!flag) {
                System.out.println("Contact Not Found for "+name);
            }
    }

    public void deleteContact(String name){
        boolean flag = false;
        Contact tempContact = new Contact();
        for (Contact contact : contactList) {
            if (name.equalsIgnoreCase(contact.getFname())) {
                flag = true;
                tempContact = contact;
                break;
            }
        }
        if (flag) {
            contactList.remove(tempContact);
            System.out.println("Contact Deleted Successfully...!");
            System.out.println("=====================================");
        }
        if (!flag) {
            System.out.println("Contact Not found for "+name);
            System.out.println("=====================================");
        }
    }

    public void displayContact(){
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }
        

    @Override
    public String toString(){
        System.out.println();
        System.out.println("========== CONTACT DETAILS ==========");
        System.out.println("Contact Name : "+fname+" "+lname);
        System.out.println("Contact Address : "+address);
        System.out.println("Contact City : "+city);
        System.out.println("Contact State : "+state);
        System.out.println("Contact Zip : "+zip);
        System.out.println("Contact Phone No : "+pohneNo);
        System.out.println("Contact Email : "+email);
        System.out.println("=====================================");
        return"";
    }

}


public class AddressBook {
    
    Contact contact = new Contact();
    Map<String, AddressBook> addressBooks;
    
    
    public AddressBook() {
        addressBooks = new HashMap<>();
    }

    public void addAddressBook(String name){

        for (Map.Entry<String, AddressBook> entry: addressBooks.entrySet()) {
            if (entry.getKey().equalsIgnoreCase(name)) {
                System.out.println("AddressBook already exsits for "+name);
                return;
            }
        }
            addressBooks.put(name, new AddressBook());
            System.out.println("Address Book created Successfully for "+name);
        
    }
    

    public AddressBook searchAddressbook(String name){
        AddressBook addBook = new AddressBook();
        boolean flag = false;
        for (Map.Entry<String, AddressBook> set : addressBooks.entrySet()) {
            if (set.getKey().equalsIgnoreCase(name)) {
                addBook = set.getValue();
                flag = true;
                break;
            }
        }
        if (flag) {
            return addBook;
        }
        else{
            return null;
        }
        
    } 
        
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n========= Welcome to Address Book Program =========\n");


        AddressBook addressbooks = new AddressBook();

        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("Select Operation");
            System.out.println("1. Create New AddressBook");
            System.out.println("2. Add Contact");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contact");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter Name for new AddressBook : ");
                    String addName = scanner.nextLine();
                    addressbooks.addAddressBook(addName);
                    System.out.println("=====================================");
                    break;
                
                case 2:
                    System.out.println("Enter Name of AddressBook to add Contact : ");
                    String name1 = scanner.nextLine();
                    AddressBook addressbook2 =  addressbooks.searchAddressbook(name1);
                    if (addressbook2 != null) {
                        if (addressbook2.contact.addContact()) {
                            System.out.println("\nContact Added Successfully...\n");
                            System.out.println("=====================================");
                        }else{
                            System.out.println("Contact is Exsiting for given name");
                            System.out.println("Please try again with another name...");
                            System.out.println("=====================================");
                        }
                    }else{
                        System.out.println("AddressBook Not Found!");
                    }
                    break;

                case 3:
                    System.out.println("Enter Name of AddressBook to edit Contact : ");
                    String name2 = scanner.nextLine();
                    AddressBook addressbook3 =  addressbooks.searchAddressbook(name2);
                    if (addressbook3 != null) {
                        System.out.println("Enter Name to edit Contact");
                        String name = scanner.nextLine();
                        addressbook3.contact.editContact(name);
                    System.out.println("=====================================");
                    }else{
                        System.out.println("AddressBook Not Found!");
                    }
                    break;

                case 4:
                    System.out.println("Enter Name to of AddressBook to Delete Contact");
                    String name = scanner.nextLine();
                    AddressBook addressbook4 =  addressbooks.searchAddressbook(name);
                    if (addressbook4 != null) {
                        System.out.println("Enter Name to Delete Contact :");
                        String nameDel = scanner.nextLine();
                        addressbook4.contact.deleteContact(nameDel);
                    System.out.println("=====================================");
                    }else{
                        System.out.println("AddressBook Not Found!");
                    }
                    break;

                case 5:
                    System.out.println("Enter Name of AddressBook to view Contact :");
                    String viewName  = scanner.nextLine();
                    AddressBook addressbook5 =  addressbooks.searchAddressbook(viewName);
                    if (addressbook5 != null) {
                        addressbook5.contact.displayContact();
                    }else{
                        System.out.println("AddressBook Not Found!");
                    }
                    break;

                case 0:
                    flag = false;
                    break;
                
                default:
                    System.out.println("\nEnter valid input!");
                    break;
            }
        }

        System.out.println("\nExiting Program...");
        System.out.println("Thank You!");

        scanner.close();
    } 

    
}