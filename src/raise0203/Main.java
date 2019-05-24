package raise0203;

public class Main {

    public static void main(String[] args) {

        Communication com = new Communication();
        System.out.println(com.greet("上司"));
        System.out.println(com.greet(""));
        System.out.println(com.greet("その辺のひと"));
    }

}
