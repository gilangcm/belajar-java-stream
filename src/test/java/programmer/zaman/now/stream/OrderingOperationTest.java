package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class OrderingOperationTest {
    @Test
    void testSorted() {
        List.of("gilang", "chandra", "maulana", "diva" , "farah", "oves").stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("gilang", "chandra", "maulana", "diva" , "farah", "oves").stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
