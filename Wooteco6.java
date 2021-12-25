import java.util.ArrayList;

public class Wooteco6 {
    public String solution(double time, String[][] plans) {
        String answer = "";

        // 금요일 퇴근시간 오후 6시 
        int endTime = 18;
        // 월요일 출근 시간 오후 1시
        int startTime = 13;

        ArrayList<String> destination = new ArrayList<>(); 
        // 핵심 공식
        // 출발 -> 금요일 퇴근 시간 - 출발 시간
        // 도착 -> 월요일 출근 시간 - 도착 시간

        // 1. 2차원 배열로 받은 plans 테이블의 시간 int값으로 전환하기
        // plans 테이블에서 2열이 출발시간 3열이 도착 시간이다.
        // PM과 AM을 없애고 숫자형으로만 계산할 건데 PM일 경우 12시간을 더해준다.
        // 일단 PM과 AM을 구분시켜주자

        for(int i= 0; i<plans.length; i++) {
            double sum = 0;
            for(int j=0; j<plans[i].length; j++) {

                // 시간 format을 24시간 형식으로 변경해서 계산
                if(j == 1 || j == 2) {
                    String str = plans[i][j].substring(plans[i][j].length()-2,plans[i][j].length());

                    // AM과 PM을 표시하는 문자를 찾아서 제거한다.
                    plans[i][j] = plans[i][j].replace(str, "");

                    // PM일 경우 12시간을 더해준다.
                    if(str.equals("PM")) {
                        int temp = Integer.parseInt(plans[i][j]) + 12;
                        plans[i][j] = String.valueOf(temp);
                    }
                }
                
            }

            int departure = Integer.parseInt(plans[i][1]);
            int arrival  = Integer.parseInt(plans[i][2]);

            // 출발 시간과 퇴근 시간 차이 체크
            if(endTime > departure) {
                int temp = endTime - departure;
                sum += temp;
            }   
            
            // 도착 시간과 출근 시간 차이 체크
            if(startTime < arrival) {
                int temp = arrival - startTime;
                sum += temp;
            }

            if(time > sum) {
                answer = plans[i][0];
            }
        }
        
        
        return answer;
    }

    public static void main(String[] args) {
        double t = 3.5;
        String[][] p = {{"홍콩", "11PM", "9AM"}, {"엘에이", "3PM", "2PM"}};

        Wooteco6 w = new Wooteco6();
        System.out.println(w.solution(t, p));
    }
}
