import java.util.Arrays;

public class Wooteco1 {
        public int[] solution(int[] arr) {
            int[] value = new int[3];
            int[] answer = new int [value.length];

            Arrays.sort(arr);

            int i = 0;
            int count =  0;
            while(arr[i] == 1) {
                count ++;
                i ++;
            }
            value[0] = count;

            count = 0;
            while(arr[i] == 2) {
                count ++;
                i ++;
            }
            value[1] = count;

            count = arr.length - i;
            value[2] = count;
 
            int max = 0;
            for(i=0; i<value.length; i++) {
                if(max < value[i]) {
                    max = value[i];
                }
            }

            for(i=0; i<value.length; i++) {
                answer[i] = max - value[i];
            }

            return answer;
        }


    public static void main(String[] args) {
        int num[] = {2,1,3,1,2,1};

        Wooteco1 test = new Wooteco1();
        System.out.println(Arrays.toString(test.solution(num)));
    }
}
