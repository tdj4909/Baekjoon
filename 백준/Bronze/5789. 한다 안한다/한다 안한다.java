import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        while (N-- > 0){
            String str = br.readLine();
            if (str.charAt(str.length()/2-1) == str.charAt(str.length()/2)){
                sb.append("Do-it\n");
            } else {
                sb.append("Do-it-Not\n");
            }
        }

        System.out.println(sb.toString());
    }
}