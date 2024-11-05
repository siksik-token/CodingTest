import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // "코드를 어떻게 짜야할까"보다는 문제의 본질을 먼저 이해하자.
        // 이 문제는 윤년의 조건을 정확하게 이해하고 있어야 풀 수 있는 문제였음.
        
        // 윤년의 조건
        // 1. 절대적으로 4의 배수여야함
        // 2. 100의 배수가 아니어야함
        // 3. 400의 배수일 경우 2번 조건을 무시할 수 있음
        
        // 조건에 윤년이 아닌, 평년 조건을 넣어서 구할 수도 있음.
        // 문제에서 주어진 조건에만 집중하지 말고 조건을 역으로도 생각해보자.
        
        int year = sc.nextInt();
        
        if ((year%4!=0||year%100==0)&&year%400!=0) {
           System.out.print(0);
        } else {
            System.out.print(1);
        }
        
    }
}
