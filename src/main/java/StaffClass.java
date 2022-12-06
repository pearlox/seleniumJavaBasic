public class StaffClass {

    private String name;
    private int rollNo;
    private String designation;
    private AddressClass addressClass;

    public StaffClass(String name, int rollNo, String designation, AddressClass addressClass) {
        this.addressClass = addressClass;
        this.name = name;
        this.rollNo = rollNo;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public AddressClass getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(AddressClass addressClass) {
        this.addressClass = addressClass;
    }
}
