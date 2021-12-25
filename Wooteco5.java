import java.util.Arrays;

public class Wooteco5 {
    public int[][] solution(int rows, int columns) {
        int[][] test = new int [rows][columns];
        int[][] answer = {};
        int num = 1;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                test[i][j] = 0;
            }
        }
        test[0][0] = 1;

        for(int i=0; i<rows; i++) {          
            for(int j=0; j<columns; j++) {
                test[i][j] = num;
                num ++;

                if(num % 2 == 0) {
                    break;
                }

                if(i == rows) {
                    i = 1;
                }
            }
        }


        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                if(test[i][j] == 0) {
                    return answer;
                }
            }
        }

        //2차원 배열 출력 테스트
        System.out.println(Arrays.deepToString(test));




        

        return answer;
    }
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        Wooteco5 w = new Wooteco5();

        System.out.println(Arrays.toString(w.solution(r, c)));
        
    }
}
