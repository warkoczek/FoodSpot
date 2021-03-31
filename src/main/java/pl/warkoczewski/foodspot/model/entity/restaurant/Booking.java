package pl.warkoczewski.foodspot.model.entity.restaurant;

import pl.warkoczewski.foodspot.model.entity.base.BaseEntity;
import pl.warkoczewski.foodspot.model.entity.user.User;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Booking extends BaseEntity {
    @ManyToMany
    private Set<Restaurant> restaurants = new HashSet<>();
    @ManyToMany
    private Set<User> users = new HashSet<>();
}
