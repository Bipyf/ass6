package one;

public final class singlleton {
    private static singlleton instance;
    public int single;

    private singlleton(int single) {
        this.single = single;
    }

    public static singlleton getInstance(int single) {
        if (instance == null) {
            instance = new singlleton(single);
        }
        return instance;
    }
}
