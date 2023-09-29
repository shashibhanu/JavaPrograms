package designPatterns;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // Private constructor to prevent instantiation from other classes
    private EagerInitializedSingleton() {}

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Initialized Singleton");
    }

    public static void main(String[] args) {
        EagerInitializedSingleton singleton = EagerInitializedSingleton.getInstance();
        singleton.showMessage();
    }
}

