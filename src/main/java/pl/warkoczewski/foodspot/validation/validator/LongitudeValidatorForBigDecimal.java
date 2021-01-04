package pl.warkoczewski.foodspot.validation.validator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.warkoczewski.foodspot.service.validation.ValidationServiceImpl;
import pl.warkoczewski.foodspot.validation.constraints.Longitude;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;
@Component
@Scope("prototype")
public class LongitudeValidatorForBigDecimal implements ConstraintValidator<Longitude, Double> {
    private final ValidationServiceImpl validationService;

    public LongitudeValidatorForBigDecimal(ValidationServiceImpl validationService) {
        this.validationService = validationService;
    }
    @Override
    public void initialize(Longitude constraintAnnotation) {
    }
    @Override
    public boolean isValid(Double longitude, ConstraintValidatorContext context) {
        return validationService.isLongitudeBetween(longitude);
    }
}
