package pl.warkoczewski.foodspot.model.entity.restaurant;

import pl.warkoczewski.foodspot.model.entity.BaseEntity;
import pl.warkoczewski.foodspot.model.enums.SEAT_NAME;

import javax.persistence.*;

@Entity
public class Seat extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private SEAT_NAME SEAT_name;
    private Long amount;
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
    private Restaurant restaurant;

    public Seat(){
    }
    public Seat(SEAT_NAME SEAT_name, Long amount, Restaurant restaurant){
        this.SEAT_name = SEAT_name;
        this.amount = amount;
        this.restaurant = restaurant;
    }
    public SEAT_NAME getSEAT_name() {
        return SEAT_name;
    }
    public void setSEAT_name(SEAT_NAME SEAT_name) {
        this.SEAT_name = SEAT_name;
    }
    public Long getAmount() {
        return amount;
    }
    public void setAmount(Long amount) {
        this.amount = amount;
    }
    public Restaurant getRestaurant() {
        return restaurant;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public boolean isAvailable() {
        return amount > 0;
    }
}
