package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationTest {
    @Test
    void testMax() {
        List.of("gilang", "Chandra", "maulana", "farah", "ovestiani").stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMin() {
        List.of("gilang", "Chandra", "maulana", "farah", "ovestiani").stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }
    @Test
    void testCount() {
        long count = List.of("gilang", "Chandra", "maulana", "farah", "ovestiani").stream()
                .count();
        System.out.println(count);
    }

    @Test
    void testSum() {
        var result = List.of(1, 2, 3, 4, 5).stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);
    }

    @Test
    void testFactorial() {
        var factorial = List.of(1, 2, 3, 4, 5).stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);
    }
}
