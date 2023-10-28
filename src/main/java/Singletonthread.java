import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singletonthread {
    public static void main(String[] args) throws Exception {
        Singleton singleton = Singleton.getSingleton();
        Singleton singletonM = Singleton.getSingleton();
        Singleton singletonthread  ;

        /*try {
            Constructor<Singleton> declaredConstructor = Singleton.class.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            singletonthread = declaredConstructor.newInstance();

        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |
                 IllegalAccessException e) {
            throw new RuntimeException(e);
        }*/
        System.out.println("Singleton : "+singleton.hashCode());
        System.out.println("Singleton : "+singletonM.hashCode());
       // System.out.println("Singletonthread: "+singletonthread.hashCode());
        //System.out.println(singleton2.hashCode());
    }

}
