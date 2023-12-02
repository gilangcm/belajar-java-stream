package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationTest {
    @Test
    void testFilter() {
        List.of("gils","diva","gilang", "Chandra", "maulana","ika").stream()
                .filter(name -> name.length() < 5 )
                .forEach(System.out::println);

        List.of(1,2,3,4,5,6,7,8,9,10).stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);
    }

    @Test
    void testDistinct() {
        List.of("gils","diva","gilang", "ika", "Chandra", "maulana","ika", "diva").stream()
                .distinct()
                .forEach(System.out::println);
    }
}
