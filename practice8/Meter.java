public interface Meter {
    public abstract void start();
    public abstract int stop(int distance);
    public default void afterMidnight() {
        System.out.println("after 12, extra fare");
    }
    
}
