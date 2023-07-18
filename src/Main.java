import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans=0;
        int p = 0;
        while(a>0){
            ans += (a%10)*(Math.pow(b,p));
            a/=10;
            p++;
        }
        System.out.println(ans);
    }
}