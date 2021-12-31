import java.util.*;

public class Test5 {
	public String[] solution(String []P) {
        String[] answer = new String[2];

        for(;;) {
            List<Character> list = new ArrayList<>();
           
        	for(int i=0; i<P.length-1; i++) {
        		String temp = P[i] + P[i+1];
        		
        		for(int j=0; j<temp.length(); j++) {
        			list.add(temp.charAt(j));
        		}
        		
        		for(int j=0; j<temp.length(); j++) {
        			
        		}
        	}     
        	
        	System.out.println(list);
        	list.clear();
        	break;
        }
    
        return answer;
    }
	
	public static void main(String[] args) {
		Test5 s = new Test5();
		
		String P[] = {"11","111","11","211"};

		System.out.println(Arrays.toString(s.solution(P)));
	}

}
