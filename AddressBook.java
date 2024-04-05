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
    }
    
}