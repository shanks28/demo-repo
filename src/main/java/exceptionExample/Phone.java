package exceptionExample;

public class Phone {
    private String phoneType;
    private String phoneNumber;

    public Phone(String phoneType, String phoneNumber) {
        if (phoneType == null || phoneNumber == null) {
            throw new IllegalArgumentException("The type and number cannot be null");
        }
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
    }

    public String getPhoneType(String phoneType) {
        return phoneType;
    }

    public String getPhoneNumber(String phoneNumber) {
        return phoneNumber;
    }

    public void setPhoneType() {
        this.phoneType = phoneType;
    }

    public void setPhoneNumber() {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "phone type "+phoneType+"phone number "+phoneNumber;
    }
}
