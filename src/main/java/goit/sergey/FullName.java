package goit.sergey;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter


public class FullName {

    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}