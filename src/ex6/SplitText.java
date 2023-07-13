package ex6;

public class SplitText {
    public static void main(String[] args) {
        String text = "Липень на дворі липне до спини.";
        int length = text.length();
        char defaultChar = (char) 0x2693;
        if (text.length() % 2 != 0){
            text = text + defaultChar;
            length++;
        }
        String one = text.substring(0, length / 2);
        String two = text.substring(length / 2);
        System.out.println(one);
        System.out.println(two);
    }
}
