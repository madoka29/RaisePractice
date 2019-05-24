package raise0101;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        for(int i = 1; i <= 20; i++) {
            if(i <= 10) {
                System.out.println("Hello World!");
                continue;
            }

            System.out.println("Hello!");
        }
    }
}
