public class Singleton {
    private static Singleton singleton = null;
    volatile int vol = 10;
    private Singleton() throws Exception {
        if(singleton != null)
            throw new Exception();

    }
    public static Singleton getSingleton() throws Exception {
        if (singleton == null) {
            synchronized(Singleton.class){
                //volatile int v = 23;
                singleton = new Singleton();
            }

        }
        return singleton;
    }

}
