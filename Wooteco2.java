import java.util.Arrays;

public class Wooteco2 {

    public String solution(String[] log) {
        String answer = "";
        String time[] = new String[log.length];
        int hour = 0;
        int min = 0;
        int sum = 0;
        int study[] = new int[log.length];

        for(int i=0; i<log.length; i++) {
            String str = log[i];
            str = str.replace(":","");
            time[i] = str;
        }

        // 시간과 분을 분리해서 계산
        for(int i=0; i<time.length; i++) {
            hour = Integer.parseInt(time[i].substring(0,2)) * 60;
            min = Integer.parseInt(time[i].substring(2,4));
            sum = hour + min;
            study[i] = sum;
        }

        sum =0;
        for(int i=0; i<study.length; i++) {

            int temp = 0;
            
            if(i % 2 == 1) {
                temp = Math.abs(study[i - 1] - study[i]);
                if(temp >= 105) {
                    temp = 105;
                }
                else if(temp < 5){
                    temp = 0;
                }
            }   
            sum+=temp;
        } 
  
        hour = sum / 60;
        min = sum % 60;
        

        answer = String.format("%02d:%02d", hour, min);

        return answer;
    }

    public static void main(String[] args) {
        Wooteco2 test = new Wooteco2();
        String log1[] = {"01:00", "08:00", "15:00", "15:04", "23:00", "23:59"};

        System.out.println("\"" + test.solution(log1) + "\"");
    }
    
}
