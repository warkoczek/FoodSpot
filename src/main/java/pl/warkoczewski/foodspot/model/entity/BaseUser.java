package pl.warkoczewski.foodspot.model.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;

public class BaseUser implements Serializable {
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
