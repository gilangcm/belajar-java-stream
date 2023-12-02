package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {

        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(data -> {
            System.out.println(data);
        });

        Stream<String> oneStream = Stream.of("gils");
        oneStream.forEach(data -> {
            System.out.println(data);
        });

        String data = null;
        Stream<String> emptyOrNotStream = Stream.ofNullable(data);
        emptyOrNotStream.forEach(item -> {
            System.out.println(item);
        });
    }

    @Test
    void testStreamFromArray() {
        Stream<String> arrayStream = Stream.of("gils","diva","udin");
        arrayStream.forEach(name -> System.out.println(name));

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
          "Gilang",  "Chandra" , "Maulana"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> collection = List.of("Gils","diva","Udin");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "Programmer Zaman Now");
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1,value -> value + 1);
//        iterate.forEach(System.out::println);
    }
}
