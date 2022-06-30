import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal2 {
    public double getValue(BigDecimal numberA) {
        BigDecimal retorn = numberA.setScale(2, RoundingMode.HALF_UP);
        double x = retorn.doubleValue(); // CONVERSIÓN DEL BIGDECIMAL ROUNDED A DOUBLE

        return x;
    }

    public double nearest(BigDecimal numberA) {
        BigDecimal retorn = numberA.setScale(1, RoundingMode.HALF_UP);
        double x = -(retorn.doubleValue());

        return x;
    }
}
