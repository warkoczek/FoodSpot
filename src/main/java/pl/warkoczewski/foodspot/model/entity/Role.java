package pl.warkoczewski.foodspot.model.entity;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity(name = "roles")
@Table(name = "roles")
@NoArgsConstructor@AllArgsConstructor
@Getter@Setter@ToString(callSuper = true)
public class Role extends BaseEntity implements GrantedAuthority {
    @Column(nullable = false)
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }
}
