import java.util.Scanner;

public class Pangram {
    public static boolean checkPangram(String str) {
        boolean[] mark = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('A' <= ch && ch <= 'Z') {
                int index = ch - 'A';
                mark[index] = true;
            } else if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                mark[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!mark[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = scanner.nextLine();

        scanner.close();

        if (checkPangram(str)) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
    }
}
