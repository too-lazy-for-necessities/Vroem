package be.intecbrussel.MiniautoverkoopzaakVroem.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String jobTitle;
    @ManyToOne
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;
    @ManyToOne
    @JoinColumn(name = "officeCode")
    private Office officeCode;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}
