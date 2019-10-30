package generics;

public class GenericsType<T> {
    private T t;

    public T get(){
        return this.t;
    }

    @SuppressWarnings("rawtypes")
    public void set(T t1){
        this.t = t1;
    }

    public static void main(String[] args) {
        GenericsType<String> type = new GenericsType<>();
        type.set("Test");

        GenericsType type1 = new GenericsType();
        type1.set("Test1");
        type1.set(20);
    }
}
