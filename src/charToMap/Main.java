package charToMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Character> characterList = new ArrayList<>();
        characterList.add('a');
        characterList.add('z');
        characterList.add('x');
        characterList.add('t');
        characterList.add('x');
        characterList.add('t');
        characterList.add('a');
        characterList.add('a');

        Map<Character, Long> collect = characterList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
