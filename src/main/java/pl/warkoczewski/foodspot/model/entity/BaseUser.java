package pl.warkoczewski.foodspot.model.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@MappedSuperclass
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class BaseUser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @PrePersist
    public void prePersist(){
        this.createdOn = LocalDateTime.now();
        this.updatedOn = null;
    }
    @PreUpdate
    public void preUpdate(){
        this.updatedOn = LocalDateTime.now();
    }

}
