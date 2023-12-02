package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {

    @Test
    void testCreateStreamBuilder() {

        Stream.Builder<String> builder = Stream.builder();
        builder.accept("gils");
        builder.add("diva").add("udin");

        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplify() {
        Stream<Object> stream = Stream.builder()
                .add("Gilang").add("Chandra").add("Maulana").build();
        stream.forEach(System.out::println);
    }
}
