import java.util.Scanner; // Scanner라는 도구를 사용하기 위해 import

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        System.out.print(A+B);
    }
}