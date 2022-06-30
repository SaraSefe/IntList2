
import java.math.BigDecimal;
import java.math.MathContext;

public class BigDecimal1 {
    double d = 4.2545;
    MathContext mc = new MathContext(3);
    BigDecimal a = new BigDecimal(d);
    BigDecimal result = new BigDecimal(String.valueOf(a.round(mc)));

        System.out.println(result);
}

