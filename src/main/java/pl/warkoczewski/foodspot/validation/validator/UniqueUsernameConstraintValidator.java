package pl.warkoczewski.foodspot.validation.validator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.warkoczewski.foodspot.service.validation.ValidationService;
import pl.warkoczewski.foodspot.validation.constraints.UniqueUsername;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
@Component
@Scope("prototype")
public class UniqueUsernameConstraintValidator implements ConstraintValidator<UniqueUsername, String> {
    private final ValidationService validationService;

    public UniqueUsernameConstraintValidator(ValidationService validationService) {
        this.validationService = validationService;
    }

    @Override
    public void initialize(UniqueUsername constraintAnnotation) {
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return validationService.isUsernameUnique(username);
    }
}
