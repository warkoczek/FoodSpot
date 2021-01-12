package pl.warkoczewski.foodspot.model.entity;

import lombok.*;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
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


    public void prePersist(){
        this.createdOn = LocalDateTime.now();
        this.updatedOn = null;
    }

    public void preUpdate(){
        this.updatedOn = LocalDateTime.now();
    }

}
