package pl.warkoczewski.foodspot.model.entity.restaurant;


import pl.warkoczewski.foodspot.model.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Restaurant")
public class Restaurant extends BaseEntity {
    private String name;
    @ManyToMany(mappedBy = "restaurants")
    private List<Seat> seats = new ArrayList<>();

    public Restaurant(){}

    public Restaurant(String name, List<Seat> seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }
}
