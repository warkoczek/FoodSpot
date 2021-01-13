package pl.warkoczewski.foodspot.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.warkoczewski.foodspot.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

