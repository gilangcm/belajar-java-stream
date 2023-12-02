package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperationTest {
    @Test
    void testPeekBefore() {
        List.of("gilang", "chandra","maulana").stream()
                .map(name -> {
                    System.out.println("Before change name to UPPER: " + name);
                String upper = name.toUpperCase();
                    System.out.println("CHANGE name to UPPER: " + upper);
                    return upper;
                })
                .forEach(name -> System.out.println("FINAL NAME: " + name));
    }
    @Test
    void testPeekAfter() {
        List.of("gilang", "chandra","maulana").stream()
                .peek(name -> System.out.println("Before change name to UPPER: " + name))
                .map(name -> name.toUpperCase())
                .peek(upper -> System.out.println("CHANGE name to UPPER: " + upper))
                .forEach(name -> System.out.println("FINAL NAME: " + name));
    }
}
