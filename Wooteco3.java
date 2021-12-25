import java.util.Arrays;

public class Wooteco3 {
    public int solution(String[] ings, String[] menu, String[] sell) {
        int answer = 0;
        // 1. ings, menu, sell을 원소들을 분리해서 2차원 배열로 만든다.
        String[][] ingArr = new String[ings.length][2];
        String[][] menuArr = new String[menu.length][3];
        String[][] sellArr = new String[sell.length][2];

        // 겹치는 부분 MENU_NAME은 배열로 따로 만들자.
        //String[] menuName = new String[menu.length];

        // 1. ings와 sell은 2차원 공백을 기준으로 분리해서 2차원 배열로 생성한다.
        // 2. MENU_NAME은 겹치는 부분이기 때문에 이름으로 찾기 위해서 배열로 따로 만든다.


        // ings 2차원 배열로 만들기
        for(int i=0; i<ings.length; i++) {
            //ING_NAME은 알파벳 소문자 하나로만 표시됨.

            // 1. 문자내 띄어쓰기 공백 제거
            String str = ings[i].replaceAll(" ", "");

            // 2. 공백이 제거된 문자열을 다시 앞 첫글자를 식재료 이름 뒤의 내용은 가격으로 분리
            String ING_NAME = str.substring(0, 1);
            String ING_PRICE = str.substring(1, str.length());

            for(int j=0; j<2; j++) {
                if(j == 0) {
                    ingArr[i][j] = ING_NAME;
                }else {
                    ingArr[i][j] = ING_PRICE;
                }
            }
        }

        // menu 2차원 배열로 만들기
        for(int i=0; i<menu.length; i++) {
            //ING_NAME은 알파벳 소문자 하나로만 표시됨.

            // 1. 문자내 띄어쓰기 공백 으로 분리
            String MENU_NAME = menu[i].split("\\s+")[0];
            String ING_LIST = menu[i].split("\\s+")[1];
            String MENU_PRICE = menu[i].split("\\s+")[2];

            // 2. 공백이 제거된 문자열을 다시 앞 첫글자를 식재료 이름 뒤의 내용은 가격으로 분리
            for(int j=0; j<3; j++) {
                if(j == 0) {
                    menuArr[i][j] = MENU_NAME;
                }
                else if (j == 1) {
                    menuArr[i][j] = ING_LIST;
                }
                else {
                    menuArr[i][j] = MENU_PRICE;
                }
            }
        }

        // sell 2차원 배열로 만들기
        for(int i=0; i<sell.length; i++) {
            //ING_NAME은 알파벳 소문자 하나로만 표시됨.

            // 1. 문자내 띄어쓰기 공백 제거
            String MENU_NAME = sell[i].split("\\s+")[0];
            String SELL_COUNT = sell[i].split("\\s+")[1];

            for(int j=0; j<2; j++) {
                if(j == 0) {
                    sellArr[i][j] = MENU_NAME;
                }else {
                    sellArr[i][j] = SELL_COUNT;
                }
            }
        }

        for(int i=0; i<sell.length; i++) {
            String menuName = sellArr[i][0];

            if(menuArr[i][0] == menuName) {
                System.out.println("있어요");
            }
            
        }
    

        return answer;
    }

    public static void main(String[] args) {
        String in[] = {"r 10", "a 23", "t 124", "k 9"};
        String me[] = {"PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50", "SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20"};
        String se[] = {"BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1"};

        Wooteco3 w = new Wooteco3();

        System.out.println(w.solution(in, me, se));
    }
}
