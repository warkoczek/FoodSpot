package pl.warkoczewski.foodspot.model.entity.restaurant;


import pl.warkoczewski.foodspot.model.entity.base.BaseEntity;

import javax.persistence.Entity;


@Entity
public class Restaurant extends BaseEntity {
    private String name;
    //@OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //private Set<Seat> seats;

    public Restaurant(){}
    public Restaurant(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
