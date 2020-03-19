package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers")
public class Customer extends BaseEntity{

    private String email;
    private String creditCardNumber;
    private Set<Sale> sales;

    public Customer() {

    }

    @Column(name = "email", length = 40)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "credit_card_number", length = 10)
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @OneToMany(mappedBy = "customer", targetEntity = Sale.class)
    public Set<Sale> getSales() {
        return sales;
    }

    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }
}
