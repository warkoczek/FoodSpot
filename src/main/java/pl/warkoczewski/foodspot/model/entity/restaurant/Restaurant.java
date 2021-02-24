package pl.warkoczewski.foodspot.model.entity.restaurant;


import pl.warkoczewski.foodspot.model.entity.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Restaurant extends BaseEntity {
    private String name;
    @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL)
    private Set<Seat> seats;

    public Restaurant(){}
    public Restaurant(String name, Set<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Seat> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seat> seats) {
        this.seats = seats;
    }
}
