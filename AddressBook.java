import java.util.Scanner;

class Contact {

    String fname;
    String lname;
    String address;
    String city;
    String state;
    int zip;
    String email;
    String pohneNo;

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

    @Override
    public String toString(){
        System.out.println("Contact Name : "+fname+" "+lname);
        System.out.println("Contact Address : "+address);
        System.out.println("Contact City : "+city);
        System.out.println("Contact State : "+state);
        System.out.println("Contact Zip : "+zip);
        System.out.println("Contact Phone No : "+pohneNo);
        System.out.println("Contact Email : "+email);
        return"";
    }

}


public class AddressBook {

    public static void main(String[] args) {
        
        System.out.println("\nWelcome to Address Book Program\n");
        Contact contact = new Contact("Vaibhav", "Kumbhar", "Chembur", "Mumbai", "Maharashtra", 400071,"vaibhavkumbhar@gmail.com", "8108910982");
        System.out.println(contact);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact Details");
        System.out.println("Enter First Name ");
        String fname = scanner.nextLine();
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

        Contact contact2 = new Contact(fname, lname, address, city, state, zip, email, phoneNo);
        System.out.println(contact2);
    } 

    
}