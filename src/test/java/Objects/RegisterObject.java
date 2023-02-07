package Objects;

import java.util.HashMap;

public class RegisterObject {

    private String firstName;
    private String lastName;
    private String addressValue;
    private String emailValue;
    private String phoneValue;
    private String expectedLanguage;
    private String skillValue;
    private String countryValue;
    private String yearValue;
    private String monthValue;
    private String dayValue;
    private String firstPasswordValue;
    private String confirmPasswordValue;

    public RegisterObject(HashMap<String, String> TestData) {
        populateObject(TestData);
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

    public String getAddressValue() {
        return addressValue;
    }

    public void setAddressValue(String addressValue) {
        this.addressValue = addressValue;
    }

    public String getEmailValue() {
        return emailValue;
    }

    public void setEmailValue(String emailValue) {
        this.emailValue = emailValue;
    }

    public String getPhoneValue() {
        return phoneValue;
    }

    public void setPhoneValue(String phoneValue) {
        this.phoneValue = phoneValue;
    }

    public String getExpectedLanguage() {
        return expectedLanguage;
    }

    public void setExpectedLanguage(String expectedLanguage) {
        this.expectedLanguage = expectedLanguage;
    }

    public String getSkillValue() {
        return skillValue;
    }

    public void setSkillValue(String skillValue) {
        this.skillValue = skillValue;
    }

    public String getCountryValue() {
        return countryValue;
    }

    public void setCountryValue(String countryValue) {
        this.countryValue = countryValue;
    }

    public String getYearValue() {
        return yearValue;
    }

    public void setYearValue(String yearValue) {
        this.yearValue = yearValue;
    }

    public String getMonthValue() {
        return monthValue;
    }

    public void setMonthValue(String monthValue) {
        this.monthValue = monthValue;
    }

    public String getDayValue() {
        return dayValue;
    }

    public void setDayValue(String dayValue) {
        this.dayValue = dayValue;
    }

    public String getFirstPasswordValue() {
        return firstPasswordValue;
    }

    public void setFirstPasswordValue(String firstPasswordValue) {
        this.firstPasswordValue = firstPasswordValue;
    }

    public String getConfirmPasswordValue() {
        return confirmPasswordValue;
    }

    public void setConfirmPasswordValue(String confirmPasswordValue) {
        this.confirmPasswordValue = confirmPasswordValue;
    }

    private void populateObject(HashMap<String, String> TestData){
        for (String Key: TestData.keySet()){
            switch (Key){
                case "firstName":
                    setFirstName(TestData.get(Key));
                    break;
                case "lastName":
                    setLastName(TestData.get(Key));
                    break;
                case "addressValue":
                    setAddressValue(TestData.get(Key));
                    break;
                case "emailValue":
                    setEmailValue(TestData.get(Key));
                    break;
                case "phoneValue":
                    setPhoneValue(TestData.get(Key));
                    break;
                case "expectedLanguage":
                    setExpectedLanguage(TestData.get(Key));
                    break;
                case "skillValue":
                    setSkillValue(TestData.get(Key));
                    break;
                case "countryValue":
                    setCountryValue(TestData.get(Key));
                    break;
                case "yearValue":
                    setYearValue(TestData.get(Key));
                    break;
                case "monthValue":
                    setMonthValue(TestData.get(Key));
                    break;
                case "dayValue":
                    setDayValue(TestData.get(Key));
                    break;
                case "firstPasswordValue":
                    setFirstPasswordValue(TestData.get(Key));
                    break;
                case "confirmPasswordValue":
                    setConfirmPasswordValue(TestData.get(Key));
                    break;

            }
        }
    }


}
