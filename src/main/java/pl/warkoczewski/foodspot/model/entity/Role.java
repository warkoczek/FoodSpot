package pl.warkoczewski.foodspot.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "roles")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter@ToString(callSuper = true)
public class Role extends BaseEntity {
    @Column(nullable = false)
    private String name;


}
