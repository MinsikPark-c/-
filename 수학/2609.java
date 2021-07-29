import java.util.Scanner;
 
public class g2609 {
    static int min(int a, int b) {
        if(b==0)
            return a;
        return gcd(b, a%b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int min = min(a, b);
        int max = (a*b/min); //최소 공배수 구하기
        System.out.println(min);
        System.out.println(max);
        
    }
 
}
