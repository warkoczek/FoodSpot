package pl.warkoczewski.foodspot.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
@AllArgsConstructor@NoArgsConstructor
@Getter@Setter@ToString(callSuper = true)
public class Role extends BaseEntity {
    @Column(nullable = false)
    private String name;
}
