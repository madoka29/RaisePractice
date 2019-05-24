package raise0202;

public class WorkSpaceCommunication implements ICommunication {

    // 職場かそうでないかを判定
    boolean IsWorkSpace = false;

    @Override
    public void greet(String str) {

        if (IsWorkSpace) {
            if (str.equals("Hello")) {
                System.out.println("Hello!");
            } else {
                System.out.println("...Hello");
            }
        } else {
            System.out.println("（無視する）");
        }
    }
}
