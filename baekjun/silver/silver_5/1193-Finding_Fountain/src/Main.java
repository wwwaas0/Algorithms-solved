import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int i;
        int first, second;

        int input = Integer.parseInt(br.readLine());
        for(i=1; input>0 ; i++){
            input -=i;
        }

        if(i%2 == 1){
            //더한 값이 홀수일때
            first = i+input-1;
            second = i - first;
        }
        else{
            //더한 값이 짝수일때
            second = i+input-1;
            first = i - second;
        }
        System.out.println(first+"/"+second);
    }
}