import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumWordPrinterTest {

    NumWordPrinter printer = new NumWordPrinter();

    @Test
    public void testDivisibleBy2() {
        assertEquals("Even", printer.printWord(4, false));
    }

    @Test
    public void testDivisibleBy11() {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }


    @Test
    public void testDivisibleBy13() {
        assertEquals("LuckyThirteen", printer.printWord(26, false));
    }

    @Test
    public void testDivisibleBy2And11() {
        assertEquals("EvenPrimeEleven", printer.printWord(22, false));
    }



}