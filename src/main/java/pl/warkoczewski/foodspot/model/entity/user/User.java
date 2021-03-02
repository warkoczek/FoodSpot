package pl.warkoczewski.foodspot.model.entity.user;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import pl.warkoczewski.foodspot.model.entity.BaseEntity;
import pl.warkoczewski.foodspot.model.entity.user.Role;

import javax.persistence.*;
import java.util.*;

@Entity(name = "users")
@Table(name = "users")
@Getter@Setter
@NoArgsConstructor
@ToString(exclude = "password", callSuper = true)
public class User extends BaseEntity implements UserDetails {
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();
    @Column
    private boolean isEnabled;

    public User( String username, String email, String password, HashSet<Role> roles, boolean isEnabled) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.roles = roles;
        this.isEnabled = isEnabled;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.roles;
        //return Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));
        /*List<SimpleGrantedAuthority> authorities = new ArrayList<>();
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getName())));
        return authorities;*/
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
