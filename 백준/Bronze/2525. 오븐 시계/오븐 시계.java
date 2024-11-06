import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
		Scanner sc = new Scanner(System.in);

		// 입력받은 현재 시각(시, 분)
		int currentHour = sc.nextInt();
		int currentMinute = sc.nextInt();

		// 오븐 구이에 필요한 시간(단위: 분)
		int requiredTime = sc.nextInt();

		// 끝나는 시각을 구해야 함.
		// 필요한 시간의 단위가 '분'이기 때문에 입력 받은 현재 시각의 분과 필요한 시간을 더해야 함
		// 왜 더해야 할까? -> 더했을 때 60 이상의 값이 나올 경우 시간이 바뀌어야 하기 때문.
		
		// 시간을 출력하는 문제를 풀 때 항상 주의해야 할 것
		// 1. 23시 다음에는 0시로 출력이 되는가
		// 2. 분 단위가 60분일 경우 시간에 +1이 되고 00분으로 출력이 되는가
		
        // 연산자 우선순위 항상 생각하기
        
		if (currentMinute + requiredTime < 60) {
			System.out.print(currentHour + " " + (currentMinute + requiredTime));
		} else {
			// currentMinute+requiredTime가 60 보다 클 경우 60 으로 나누어 몫을 구한다. 그리고 해당 몫만큼 시간에 + 해주기
			currentHour += (currentMinute+requiredTime)/60;
			
			// minute에는 60분이 존재하지 않는다.
			// 그렇기 때문에 currentMinute+requiredTime에 60을 나눴을 때 나머지가 0인 경우 0을 할당해주어야 한다.
			currentMinute = (currentMinute+requiredTime)%60==0 ? 0 : (currentMinute+requiredTime)%60;
			
			// 해당 문제에서는 24시는 존재하지 않고 0시가 된다.
            // 입력받는 필요 시간(분)이 몇분을 입력받을지 모르기 때문에
            // 조건을 꼭 24시보다 작을 경우로 한다.
			if (currentHour > 23) {
				currentHour = currentHour%24;
			}
            System.out.print(currentHour + " " + currentMinute);
		}
    }
}