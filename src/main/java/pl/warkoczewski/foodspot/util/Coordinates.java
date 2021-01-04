package pl.warkoczewski.foodspot.util;

import java.math.BigDecimal;

public final class Coordinates {
    public static final BigDecimal LATITUDE_MIN = BigDecimal.valueOf(-90);
    public static final BigDecimal LATITUDE_MAX = BigDecimal.valueOf(90);
    public static final BigDecimal LONGITUDE_MIN = BigDecimal.valueOf(-180);
    public static final BigDecimal LONGITUDE_MAX = BigDecimal.valueOf(180);

    public Coordinates() {
    }
}
