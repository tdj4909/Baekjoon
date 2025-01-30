import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] H  = new int[N];
        long result = 0;
        for (int i = 0; i < N; i++){
            H[i] = Integer.parseInt(br.readLine());
        }

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < N; i++){
            while (!stack.isEmpty() && stack.peek() <= H[i]){
                stack.pop();
            }
            result += stack.size();

            stack.push(H[i]);
        }

        System.out.println(result);

        br.close();
    }
}