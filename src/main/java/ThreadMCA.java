import java.util.function.BiFunction;

public class ThreadMCA implements Runnable{
    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadMCA());
        t.run();
        t.run();
        t.start();

        BiFunction<String,String,Boolean> bfn = String::equals;
        System.out.println(bfn.apply("java8","java8"));
    }
}
