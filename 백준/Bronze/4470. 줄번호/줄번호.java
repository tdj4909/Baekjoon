import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= T; i++){
            String s = sc.nextLine();
            System.out.println(i + ". " + s);
        }
    }
}