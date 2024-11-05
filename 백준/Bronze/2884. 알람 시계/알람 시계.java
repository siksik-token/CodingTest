import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        // hour
        int h = sc.nextInt();
        // minute
        int m = sc.nextInt() - 45;
        
        // 방법
        // 1. Math.abs()
        // 2. -m
        
        // 산술연산자는 비교연산자보다 우선순위가 높다.
        if(m>=0){
            System.out.print(h + " " + m);
        }else{
        	// m이 음수일 경우 h는 1시간을 - 해야한다. 그러나 0시인 경우 23시로 돌아가야 하기 때문에
        	// h에 23을 할당해줘야 한다. 그 외의 상황에서는 입력받은 h의 값에서 -1을 하여 재할당한다.
        	if(h==0){
        		h=23;
        	}else {
        		h-=1;
        	}
        	// m이 음수이기 때문에 양수로 변환하여 -60을 해주면 입력받은 분(minute)의 45분 전 값을 구할 수 있다.
            System.out.print(h + " " + (60-(-m)));
        }
        
        
        
    }
}