package pl.warkoczewski.foodspot.validation.constraints;
import pl.warkoczewski.foodspot.validation.validator.LongitudeValidatorForBigDecimal;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LongitudeValidatorForBigDecimal.class)
@Target({ElementType.FIELD,ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Longitude {
    String message() default " Longitude range is -180 to 180";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
