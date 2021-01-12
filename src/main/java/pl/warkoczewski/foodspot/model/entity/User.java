package pl.warkoczewski.foodspot.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor @AllArgsConstructor
public class User extends BaseUser {

    private String username;
    private String email;
    private Boolean active = Boolean.FALSE;
    private String password;
}
