package pl.warkoczewski.foodspot.model.entity.base;

import lombok.*;
import lombok.extern.slf4j.Slf4j;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@MappedSuperclass @Slf4j
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode(of = "id")
public class BaseEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    @PrePersist
    public void prePersist(){
        log.info("Date of creation set before persisting entity to the db: {}", LocalDateTime.now());
        this.createdOn = LocalDateTime.now();
        this.updatedOn = null;
    }
    @PreUpdate
    public void preUpdate(){
        this.updatedOn = LocalDateTime.now();
    }

}
