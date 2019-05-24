package raise0203;

public class Communication {

    public String greet(String str) {

        try {
            if (str.equals("上司")) {
                return "おはようございます";
            }

            if (str.equals("同僚")) {
                return "おはよう";
            }

            if (str == "") {
                throw new Exception("誰もいません");
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return "（知らない人なので挨拶しない）";
    }
}
