public class Person {
    protected String firstName;
    protected String lastName;
    protected String sId;
    protected String birthDate;
    protected String phoneNumber;

    public Person() {
        setFirstName("John");
        setLastName("Doe");
        setBirthDate("09/26/1964");
        setsId("00000");
        setPhoneNumber("(000)000-0000");
    }

    public Person(String lastName, String firstName, String sId, String birthDate, String phoneNumber) {
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setsId(sId);
        this.setBirthDate(birthDate);
        this.setPhoneNumber(phoneNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
