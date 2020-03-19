package entities;

import javax.persistence.*;

@MappedSuperclass
public abstract class BillingDetail extends BaseEntity{

    private String number;
    private User owner;

    @Column(name = "billing_number")
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @ManyToOne
    @JoinColumn(name = "detail_id", referencedColumnName = "id")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
