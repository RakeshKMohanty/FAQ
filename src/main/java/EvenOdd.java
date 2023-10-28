import java.util.Arrays;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {

        int[] input = {1,5,2,6,12,13,24,7,18};
        System.out.println("Even Elements are : "+Arrays.stream(input).boxed().filter(element -> element % 2 == 0).collect(Collectors.toList()));
    }
}
