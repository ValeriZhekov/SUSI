package Entities;

public abstract class Person {
    protected String name;
    protected String FN;
    protected String phoneNum;
    protected String dateOfBirth;

    public Person(String name, String FN, String phoneNum, String dateOfBirth) {
        this.name = name;
        this.FN = FN;
        this.phoneNum = phoneNum;
        this.dateOfBirth = dateOfBirth;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFN() {
        return FN;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setFN(String FN) {
        this.FN = FN;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
