package pl.warkoczewski.foodspot.model.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter
@Setter
@ToString(exclude = "password", callSuper = true)
public class User extends BaseUser {

    private String username;
    private String email;
    private Boolean active = Boolean.FALSE;
    private String password;
}
