package designPatterns;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    // Private constructor to prevent instantiation from other classes
    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Initialized Singleton");
    }

    public static void main(String[] args) {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        singleton.showMessage();
    }
}

