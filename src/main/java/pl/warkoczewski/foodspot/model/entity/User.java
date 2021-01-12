package pl.warkoczewski.foodspot.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Getter@Setter
@NoArgsConstructor @AllArgsConstructor
@ToString(exclude = "password", callSuper = true)
public class User extends BaseEntity {
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private Boolean active = Boolean.FALSE;
    @Column(nullable = false)
    private String password;
}
