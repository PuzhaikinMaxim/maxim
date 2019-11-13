import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min;
        int sec;
        int a;
        int k = 0;
        a = sc.nextInt();
        min = a;
        sec = a;
        for (int i = 0; i < N - 1; ++i)
        {
            a = sc.nextInt();
            if (k > min && k < a)
                sec = k;
            else if (k > min && k > a)
                sec = a;
            if (a < min)
                min = a;
            /*if (a > min)
                sec = a;*/
            k = a;
        }
        System.out.println(sec);
    }
}
