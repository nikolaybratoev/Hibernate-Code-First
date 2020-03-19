package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "diagnoses")
public class Diagnose extends BaseInformation{

    private String comments;
    private Visitation visitation;
    private Set<Medicament> medicaments;

    public Diagnose() {

    }

    @Column(name = "comments")
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @OneToOne(mappedBy = "diagnose", targetEntity = Visitation.class)
    public Visitation getVisitation() {
        return visitation;
    }

    public void setVisitation(Visitation visitation) {
        this.visitation = visitation;
    }

    @ManyToMany
    @JoinTable(name = "diagnoses_medicaments", joinColumns =
    @JoinColumn(name = "diagnose_id", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "medicament_id", referencedColumnName = "id"))
    public Set<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(Set<Medicament> medicaments) {
        this.medicaments = medicaments;
    }
}
