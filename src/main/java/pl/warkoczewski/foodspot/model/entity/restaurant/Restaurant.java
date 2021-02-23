package pl.warkoczewski.foodspot.model.entity.restaurant;


import pl.warkoczewski.foodspot.model.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Restaurant extends BaseEntity {
    private String name;
    private String address;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Table> tables = new HashSet<>();

    public Restaurant(){}
    public Restaurant(String name, String address, Set<Table> tables) {
        this.name = name;
        this.address = address;
        this.tables = tables;
    }
}
