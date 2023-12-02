package programmer.zaman.now.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationTest {
    @Test
    void testIntermediateOperation() {

        List<String> names = List.of("gils","diva","udin");

        Stream<String> upper = names.stream()
                .map(name ->{
                    System.out.println("CHANGE " + name + " to UPPERCASE");
                    return name.toUpperCase();
                } );

    }

    @Test
    void testTerminalOperation() {

        List<String> names = List.of("gils","diva","udin");

        names.stream()
                .map(name ->{
                    System.out.println("CHANGE " + name + " to UPPERCASE");
                    return name.toUpperCase();
                })
                .map(upper ->{
                    System.out.println("CHANGE " + upper + " to Mr. ");
                    return "Mr." + upper;
                })
                .forEach(mr ->{
                    System.out.println(mr);
                });

    }
}
