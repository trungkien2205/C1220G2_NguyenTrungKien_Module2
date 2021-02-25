package _10_DSA.bai_tap;

public class Test {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>(10);
        list.add(0, "a");
        list.add(1, "b");
        list.add(3, "c");

        list.add(5, "b");
        System.out.println(list.size());
        list.remove(3);
        System.out.println(list.size());

    }
}