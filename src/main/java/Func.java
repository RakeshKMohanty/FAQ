@FunctionalInterface
public interface Func<T> {
    public void aMethod(T t);

    default void sayHello(){
        System.out.println("Hello Everybody");
    }
}
