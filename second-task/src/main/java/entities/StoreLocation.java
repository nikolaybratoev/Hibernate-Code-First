package entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "store_location")
public class StoreLocation {

    private long id;
    private String locationName;
    private Set<Sale> sales;

    public StoreLocation() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "location_name", length = 50)
    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    @OneToMany(mappedBy = "storeLocation", targetEntity = Sale.class)
    public Set<Sale> getSales() {
        return sales;
    }

    public void setSales(Set<Sale> sales) {
        this.sales = sales;
    }
}
