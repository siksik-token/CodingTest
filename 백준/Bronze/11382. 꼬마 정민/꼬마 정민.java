import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // 문제에서 주어진 예제 입력값이 아닌 입력값의 범위를 확인할 것
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        
        System.out.print(A+B+C);
    }
}