package Practices.Ez;

// 58 in top 150
public class LengthOfLastWord {

    public static void main(String[] args) {
        System.out.println(sol("   fly me   to   the moon  "));
        System.out.println(sol("luffy is still joyboy"));
    }

    static int sol(String str) {
        String[] splittedStrs = str.split(" ");
        String lastWord = splittedStrs[splittedStrs.length - 1];
        return lastWord.length();
    }
}
