import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class MinimumElement {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(15);
        input.add(22);
        input.add(5);
        input.add(17);
        input.add(12);
        input.stream().min(Integer::compareTo).ifPresent(System.out::println);

        List<String> stringinput = new ArrayList<>();
        stringinput.add("abc");
        stringinput.add("abcd");
        stringinput.add("ab");
        stringinput.add("a");
        stringinput.add("abcde");

        stringinput.stream().min(Comparator.comparing(String::length)).ifPresent((Consumer<? super String>) System.out::println);

    }
}
