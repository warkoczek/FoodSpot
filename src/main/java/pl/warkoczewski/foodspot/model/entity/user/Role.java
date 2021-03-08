package pl.warkoczewski.foodspot.model.entity.user;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import pl.warkoczewski.foodspot.model.entity.base.BaseEntity;

import javax.persistence.*;

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
