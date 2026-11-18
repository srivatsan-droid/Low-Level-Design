package DesignPattern.Singleton;

public final class Singleton {
    private static Singleton instance;
    String value;

    private Singleton(String value) {
        this.value = value;
    }

//    public Singleton(String value) {
//        try {
//            Thread.sleep(1000);
//        }
//        catch(InterruptedException e) {
//            e.printStackTrace();
//        }
//        this.value = value;
//    }
    public static Singleton getInstance(String value) {
//        if(instance == null) {
//            instance = new Singleton(value);
//        }
//        return instance;
        Singleton result = instance;
        if(result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if(instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
