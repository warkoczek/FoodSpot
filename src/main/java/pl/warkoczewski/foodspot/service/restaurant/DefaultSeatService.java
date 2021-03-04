package pl.warkoczewski.foodspot.service.restaurant;

import org.springframework.stereotype.Service;
import pl.warkoczewski.foodspot.dto.restaurant.RestaurantSeatDTO;
import pl.warkoczewski.foodspot.exception.RestaurantNotFoundException;
import pl.warkoczewski.foodspot.model.entity.restaurant.Seat;
import pl.warkoczewski.foodspot.repository.RestaurantRepository;
import pl.warkoczewski.foodspot.repository.SeatRepository;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class DefaultSeatService implements SeatService {
    private final SeatRepository seatRepository;
    private final RestaurantRepository restaurantRepository;

    public DefaultSeatService(SeatRepository seatRepository, RestaurantRepository restaurantRepository) {
        this.seatRepository = seatRepository;
        this.restaurantRepository = restaurantRepository;
    }
    @Override
    public List<RestaurantSeatDTO> getAllByRestaurantName(String name) {
        return seatRepository.findAllByRestaurantName(name).stream()
                .map(seat -> RestaurantSeatDTO.builder().amount(seat.getAmount())
                        .name(seat.getSEAT_name().name()).build()).collect(Collectors.toList());
    }

    @Override
    public List<Seat> addAll(List<Seat> seats) {
        return seatRepository.saveAll(seats);
    }

    @Override
    public Seat addSeat(Seat seat, String name) {
        return restaurantRepository.findByName(name).map(restaurant -> {
                seat.setRestaurant(restaurant);
                return seatRepository.save(seat);
    }).orElseThrow(() -> new RestaurantNotFoundException("Restaurant with name: " + name + "Does not exists"));
    }


}
