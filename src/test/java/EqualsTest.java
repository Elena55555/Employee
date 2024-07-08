import org.example.Employee;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
//import static org.example.BalancedBracketService.isBalancedBrackets;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class EqualsTest {
//    @ParameterizedTest
//    @MethodSource("provideParameters")
//    public void testParametersFromMethod(boolean expected, String input) {
//        boolean actual = isBalancedBrackets(input);
//        assertEquals(expected, actual);
//    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(false, "[((())()(())]]"),
                Arguments.of(true, "[((())()(()))]"),
                Arguments.of(true, "[[(())()(())]]"),
                Arguments.of(false, "[[(())a()(())]]"),
                Arguments.of(false, "[[(())aa()(())]]"),
                Arguments.of(false, ")()[]")
        );
    }
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setId(200);
        e2.setId(200);

        // equals (true or false)
        System.out.println(e1.equals(e2));


        //  hashCode (different or the same)
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }

//            Employee s1 = new Employee(new String[]{"Hello", "World"});
//        Employee s2 = new Employee(new String[]{"World", "Hello"});
//        assertEquals(s1, s2);
//        assertTrue(s1.hashCode() == s2.hashCode());

//    Employee s1 = new Employee();
//    Employee s2 = new Employee();
//        e1.setId(200);
//        e2.setId(200);
//
//    assertEquals(s1, s2);
//
//    assertTrue(s1.hashCode() ==s2.hashCode());
}

