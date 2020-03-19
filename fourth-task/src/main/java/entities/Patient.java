package entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "patients")
public class Patient extends BaseEntity{

    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private LocalDateTime birthDate;
    private char[] picture;
    private boolean havingMedicalInsurance;
    private Set<Visitation> visitations;

    public Patient() {

    }

    @Column(name = "first_name", length = 20)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 20)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "address", length = 60)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "email", length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "date_of_birth")
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    @Lob
    @Column(name = "picture")
    public char[] getPicture() {
        return picture;
    }

    public void setPicture(char[] picture) {
        this.picture = picture;
    }

    @Column(name = "medical_insurance")
    public boolean isHavingMedicalInsurance() {
        return havingMedicalInsurance;
    }

    public void setHavingMedicalInsurance(boolean haveMedicalInsurance) {
        this.havingMedicalInsurance = haveMedicalInsurance;
    }

    @OneToMany(mappedBy = "patient", targetEntity = Visitation.class,
    fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<Visitation> getVisitations() {
        return visitations;
    }

    public void setVisitations(Set<Visitation> visitations) {
        this.visitations = visitations;
    }
}
