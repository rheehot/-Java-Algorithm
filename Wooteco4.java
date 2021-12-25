import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Wooteco4 {
    public int[] solution(String s) {
        char[] charArray = new char[s.length()];
        int count = 1;
        List<Integer> list = new ArrayList<>();

        //같은 글자가 나올때마다 count를 증가시켜서 배열에 집어넣는다.
        for(int i=0; i<charArray.length - 1; i++) {
            charArray[i] = s.charAt(i);

            if(s.charAt(i) == s.charAt(i+1)) {
                count++;
            }else {
                list.add(count);
                count = 1;
            }  
        }
        list.add(count);

        int size = list.size();

        if(s.charAt(0) == s.charAt(charArray.length - 1)) {
               int first = list.get(0);
               int last = list.get(size - 1);
               first += last;
                list.set(0, first);
                list.remove(size -1);
                size = size - 1;
        }


        //배열 생성 후 전달.
        int answer[] = new int[size];
        for(int i=0; i<size; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
    
    public static void main(String[] args) {
        String value = "ytttyyyatt";
        
        Wooteco4 w = new Wooteco4();
        System.out.println(Arrays.toString(w.solution(value)));
    }
}
