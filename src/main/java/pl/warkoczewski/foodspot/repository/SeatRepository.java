package pl.warkoczewski.foodspot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
