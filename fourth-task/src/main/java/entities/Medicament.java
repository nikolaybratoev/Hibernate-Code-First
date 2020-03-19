package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "medicaments")
public class Medicament extends BaseInformation{

    private Set<Diagnose> diagnoses;

    public Medicament() {

    }

    @ManyToMany(mappedBy = "medicaments", targetEntity = Diagnose.class)
    public Set<Diagnose> getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(Set<Diagnose> diagnoses) {
        this.diagnoses = diagnoses;
    }
}
