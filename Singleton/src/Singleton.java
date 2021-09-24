public class Singleton {

    private static Singleton uniqueInstance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    //public static synchronized Singleton release()
    //public static synchronized Singleton getCurrentConnections()
    //public static synchronized Singleton send()


}
