package raise0201;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String greeting = "Hello World!";
        System.out.println(greeting);

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        LocalDateTime nowDate = LocalDateTime.now();
        nowDate.plusYears(3);
        System.out.println("3年後の今日は" + nowDate.getDayOfWeek());

        ZeroOrOne(1);

        List<String> fruits = new ArrayList<String>();
        fruits.add("いちご");
        fruits.add("みかん");
        fruits.add("なし");
        fruits.add("メロン");
        fruits.add("もも");

        for(String fruit : fruits) {
            System.out.println(fruit);
        }

        HashMap<Integer, String> rank  = new HashMap<Integer, String>();
        rank.put(1, "田中");
        rank.put(2, "佐藤");
        rank.put(3, "山田");

        rank.forEach((key, value) -> { System.out.println(key + ": " + value); });
    }

    public static void ZeroOrOne(int x) {
        if (x == 1) {
            System.out.println("真");
        } else if (x == 0) {
            System.out.println("偽");
        }
    }
}
