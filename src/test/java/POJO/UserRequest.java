package POJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("personalFirstName")
    private String personalFirstName;

    @JsonProperty("personalLastName")
    private String personalLastName;

    @JsonProperty("personalMiddleName")
    private String personalMiddleName;

    @JsonProperty("personalPhoneNumber")
    private String personalPhoneNumber;

    @JsonProperty("personalNumberOfPassport")
    private String personalNumberOfPassport;

    @JsonProperty("citizenLastName")
    private String citizenLastName;

    @JsonProperty("citizenFirstName")
    private String citizenFirstName;

    @JsonProperty("citizenMiddleName")
    private String citizenMiddleName;

    @JsonProperty("citizenBirthDate")
    private String citizenBirthDate;

    @JsonProperty("citizenNumberOfPassport")
    private String citizenNumberOfPassport;

    @JsonProperty("citizenGender")
    private String citizenGender;

    @JsonProperty("dateOfMarriage")
    private String dateOfMarriage;

    @JsonProperty("newLastName")
    private String newLastName;

    @JsonProperty("anotherPersonLastName")
    private String anotherPersonLastName;

    @JsonProperty("anotherPersonFirstName")
    private String anotherPersonFirstName;

    @JsonProperty("anotherPersonMiddleName")
    private String anotherPersonMiddleName;

    @JsonProperty("birth_of_anotoherPerson")
    private String birthOfAnotherPerson;

    @JsonProperty("anotherPersonPassport")
    private String anotherPersonPassport;

    @JsonProperty("birth_place")
    private String birthPlace;

    @JsonProperty("birth_mother")
    private String birthMother;

    @JsonProperty("birth_father")
    private String birthFather;

    @JsonProperty("death_dateOfDeath")
    private String deathDateOfDeath;

    @JsonProperty("death_placeOfDeath")
    private String deathPlaceOfDeath;


    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getPersonalFirstName() {
        return personalFirstName;
    }

    public void setPersonalFirstName(String personalFirstName) {
        this.personalFirstName = personalFirstName;
    }

    public String getPersonalLastName() {
        return personalLastName;
    }

    public void setPersonalLastName(String personalLastName) {
        this.personalLastName = personalLastName;
    }

    public String getPersonalMiddleName() {
        return personalMiddleName;
    }

    public void setPersonalMiddleName(String personalMiddleName) {
        this.personalMiddleName = personalMiddleName;
    }

    public String getPersonalPhoneNumber() {
        return personalPhoneNumber;
    }

    public void setPersonalPhoneNumber(String personalPhoneNumber) {
        this.personalPhoneNumber = personalPhoneNumber;
    }

    public String getPersonalNumberOfPassport() {
        return personalNumberOfPassport;
    }

    public void setPersonalNumberOfPassport(String personalNumberOfPassport) {
        this.personalNumberOfPassport = personalNumberOfPassport;
    }

    public String getCitizenLastName() {
        return citizenLastName;
    }

    public void setCitizenLastName(String citizenLastName) {
        this.citizenLastName = citizenLastName;
    }

    public String getCitizenFirstName() {
        return citizenFirstName;
    }

    public void setCitizenFirstName(String citizenFirstName) {
        this.citizenFirstName = citizenFirstName;
    }

    public String getCitizenMiddleName() {
        return citizenMiddleName;
    }

    public void setCitizenMiddleName(String citizenMiddleName) {
        this.citizenMiddleName = citizenMiddleName;
    }

    public String getCitizenBirthDate() {
        return citizenBirthDate;
    }

    public void setCitizenBirthDate(String citizenBirthDate) {
        this.citizenBirthDate = citizenBirthDate;
    }

    public String getCitizenNumberOfPassport() {
        return citizenNumberOfPassport;
    }

    public void setCitizenNumberOfPassport(String citizenNumberOfPassport) {
        this.citizenNumberOfPassport = citizenNumberOfPassport;
    }

    public String getCitizenGender() {
        return citizenGender;
    }

    public void setCitizenGender(String citizenGender) {
        this.citizenGender = citizenGender;
    }

    public String getDateOfMarriage() {
        return dateOfMarriage;
    }

    public void setDateOfMarriage(String dateOfMarriage) {
        this.dateOfMarriage = dateOfMarriage;
    }

    public String getNewLastName() {
        return newLastName;
    }

    public void setNewLastName(String newLastName) {
        this.newLastName = newLastName;
    }

    public String getAnotherPersonLastName() {
        return anotherPersonLastName;
    }

    public void setAnotherPersonLastName(String anotherPersonLastName) {
        this.anotherPersonLastName = anotherPersonLastName;
    }

    public String getAnotherPersonFirstName() {
        return anotherPersonFirstName;
    }

    public void setAnotherPersonFirstName(String anotherPersonFirstName) {
        this.anotherPersonFirstName = anotherPersonFirstName;
    }

    public String getAnotherPersonMiddleName() {
        return anotherPersonMiddleName;
    }

    public void setAnotherPersonMiddleName(String anotherPersonMiddleName) {
        this.anotherPersonMiddleName = anotherPersonMiddleName;
    }

    public String getBirthOfAnotherPerson() {
        return birthOfAnotherPerson;
    }

    public void setBirthOfAnotherPerson(String birthOfAnotherPerson) {
        this.birthOfAnotherPerson = birthOfAnotherPerson;
    }

    public String getAnotherPersonPassport() {
        return anotherPersonPassport;
    }

    public void setAnotherPersonPassport(String anotherPersonPassport) {
        this.anotherPersonPassport = anotherPersonPassport;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(String birthMother) {
        this.birthMother = birthMother;
    }

    public String getBirthFather() {
        return birthFather;
    }

    public void setBirthFather(String birthFather) {
        this.birthFather = birthFather;
    }

    public String getDeathDateOfDeath() {
        return deathDateOfDeath;
    }

    public void setDeathDateOfDeath(String deathDateOfDeath) {
        this.deathDateOfDeath = deathDateOfDeath;
    }

    public String getDeathPlaceOfDeath() {
        return deathPlaceOfDeath;
    }

    public void setDeathPlaceOfDeath(String deathPlaceOfDeath) {
        this.deathPlaceOfDeath = deathPlaceOfDeath;
    }
}
