import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Wordcount {
    public static void main(String[] args) {
        String input = "My name is Rakesh Kumar M ";
        int numberOfWord = wordCount(input);
        System.out.println("Number of Words : " + numberOfWord);
        Map<Character, Long> collect = input.chars().mapToObj(operand -> (char) operand).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        collect.entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() == 1).findFirst().ifPresent(System.out::println);
       // collect.forEach((character, characters) -> System.out.println(character +" "+characters));
        collect.entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1).findFirst().ifPresent(System.out::println);

    }

    private static int wordCount(String word) {
        int counter = 0;
        System.out.println(word);
        if (word.charAt(0) != ' ') counter++;
        for (int i = 0, j = i + 1; i <= word.length() - 2; i++, j++) {
            if (word.charAt(i) == ' ' && word.charAt(i) != word.charAt(j)) {
                counter++;
            }
        }
        return counter;
    }
}
