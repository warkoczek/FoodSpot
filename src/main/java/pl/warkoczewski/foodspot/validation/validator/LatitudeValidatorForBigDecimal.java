package pl.warkoczewski.foodspot.validation.validator;

import pl.warkoczewski.foodspot.service.validation.ValidationServiceImpl;
import pl.warkoczewski.foodspot.validation.constraints.Latitude;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.math.BigDecimal;

public class LatitudeValidatorForBigDecimal implements ConstraintValidator<Latitude, BigDecimal> {
    private final ValidationServiceImpl validationService;

    public LatitudeValidatorForBigDecimal(ValidationServiceImpl validationService) {
        this.validationService = validationService;
    }

    @Override
    public void initialize(Latitude constraintAnnotation) {
    }
    @Override
    public boolean isValid(BigDecimal latitude, ConstraintValidatorContext context) {
        return validationService.isLatitudeBetween(latitude);
    }


}
