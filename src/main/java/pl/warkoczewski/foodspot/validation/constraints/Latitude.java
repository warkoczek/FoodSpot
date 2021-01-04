package pl.warkoczewski.foodspot.validation.constraints;

import pl.warkoczewski.foodspot.validation.validator.LatitudeValidatorForBigDecimal;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LatitudeValidatorForBigDecimal.class)
@Target({ElementType.FIELD,ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Latitude {
    String message() default "Latitude range is -90 to 90";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
