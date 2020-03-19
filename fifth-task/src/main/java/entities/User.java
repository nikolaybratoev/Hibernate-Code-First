package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Set<CreditCard> cards;
    private Set<BankAccount> accounts;

    public User() {

    }

    @Column(name = "first_name", length = 30)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", length = 30)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email", length = 20)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "password", length = 20)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @OneToMany(mappedBy = "owner", targetEntity = CreditCard.class,
    fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<CreditCard> getCards() {
        return cards;
    }

    public void setCards(Set<CreditCard> cards) {
        this.cards = cards;
    }

    @OneToMany(mappedBy = "owner", targetEntity = BankAccount.class,
    fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public Set<BankAccount> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<BankAccount> accounts) {
        this.accounts = accounts;
    }
}
