import java.util.Arrays;

public class wooteco_demotest {

        public int[] solution(int[][] v) {
            int[] answer = {0, 0};
            int[] x = new int[3];
            int[] y = new int[3];
            
            for(int i=0; i<v.length; i++) {
                x[i] = v[i][0];
                y[i] = v[i][1];
            }

            if(x[0] == x[1]) {
               answer[0] = x[2];
            }
            else if(x[0] == x[2]) {
                answer[0] = x[1];
            }
            else {
                answer[0] = x[0];
            }

            if(y[0] == y[1]) {
                answer[1] = y[2];
            }
            else if(y[0] == y[2]) {
                answer[1] = y[1];
            }
            else {
                answer[1] = y[0];
            }

            return answer;
        }
    

    public static void main(String[] args) {
        
        wooteco_demotest test = new wooteco_demotest();
        int [][] value = {{1,4}, {3, 4}, {3, 10}};

        System.out.println(Arrays.toString(test.solution(value)));
    }
}
