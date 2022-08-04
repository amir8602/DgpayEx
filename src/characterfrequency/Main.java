package characterfrequency;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String input = new String("asdewsdfaaaaacxxzasdf");
        input.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList())
                .stream().collect(Collectors.
                        groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().sorted((first, second) ->
                        second.getValue().equals(first.getValue()) ?
                                second.getKey().compareTo(first.getKey()) :
                                second.getValue().compareTo(first.getValue()))
                .map(characterLongEntry ->
                        Collections.nCopies(characterLongEntry.getValue().intValue(),
                                characterLongEntry.getKey()))
                .flatMap(List::stream)
                .collect(Collectors.toList()).forEach(System.out::print);



    }
}
