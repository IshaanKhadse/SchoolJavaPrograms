public class StringSplit {

    public static void main(String[] args) {
        String str = "KANHA I";
        String[] splits = str.split("\\s");
        for(String splits2: splits) {
            System.out.println(splits2);
        }

    }

}
