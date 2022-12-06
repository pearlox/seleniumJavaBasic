public class StudentClass {

    private String name;
    private int rollNo;
    private String dept;
    private AddressClass addressClass;

    public StudentClass(String name, int rollNo,String dept,AddressClass addressClass) {
        this.addressClass = addressClass;
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public AddressClass getAddressClass() {
        return addressClass;
    }

    public void setAddressClass(AddressClass addressClass) {
        this.addressClass = addressClass;
    }
}
