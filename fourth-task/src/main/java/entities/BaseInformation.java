package entities;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseInformation extends BaseEntity {

    private String name;

    @Column(name = "name", length = 30)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
