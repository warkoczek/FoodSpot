package pl.warkoczewski.foodspot.validation.validator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.warkoczewski.foodspot.service.validation.ValidationServiceImpl;
import pl.warkoczewski.foodspot.validation.constraints.Latitude;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

@Component
@Scope("prototype")
public class LatitudeValidatorForBigDecimal implements ConstraintValidator<Latitude, Double> {
    private final ValidationServiceImpl validationService;

    public LatitudeValidatorForBigDecimal(ValidationServiceImpl validationService) {
        this.validationService = validationService;
    }

    @Override
    public void initialize(Latitude constraintAnnotation) {
    }
    @Override
    public boolean isValid(Double latitude, ConstraintValidatorContext context) {
        return validationService.isLatitudeBetween(latitude);
    }


}
