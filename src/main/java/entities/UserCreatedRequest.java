package entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserCreatedRequest {

    private String mode;

    private String personalFirstName;

    private String personalLastName;

    private String personalMiddleName;

    private String personalPhoneNumber;

    private String personalNumberOfPassport;

    private String citizenLastName;

    private String citizenFirstName;

    private String citizenMiddleName;

    private String citizenBirthDate;

    private String citizenNumberOfPassport;

    private String citizenGender;

    private String dateOfMarriage;

    private String newLastName;

    private String anotherPersonLastName;

    private String anotherPersonFirstName;

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
}
