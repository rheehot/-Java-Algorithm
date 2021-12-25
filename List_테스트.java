import java.util.*;

public class List_테스트 {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        List<String> list = new ArrayList<>();
        String arr[] = {"5", "6"};

        arrList.add("1");
        arrList.add("2");

        list.add("3");
        list.add("4");

        System.out.println("arrList : " + arrList);
        System.out.println("list : " + list);

        //Array를 ArrayList로 변환
        //arr의 모든 내용을 List로 이동
        list.addAll(Arrays.asList(arr));
        System.out.println("arr : " + Arrays.toString(arr));

        //list 와 Array합치기
        Collections.addAll(list, arr);
        System.out.println("list : " + list);

        //Listiterator 사용
        ListIterator listIterator = list.listIterator();

        // 정방향으로 출력
        System.out.print("정방향 list : ");
        while(listIterator.hasNext()){
            System.out.print(" " + listIterator.next());
        }
        System.out.println();

        //역방향으로 출력
        System.out.print("역방향 list : ");
        while(listIterator.hasPrevious()) {
            System.out.print(" " + listIterator.previous());
        }
        System.out.println();

        // 제네릭을 지정하지 않으면 문자열 정수형 상관없이 모두 삽입가능
        List list2 = new ArrayList();

        list2.add(1);
        list2.add("two");
        System.out.println("list2 : " + list2);

        ArrayList arrList2 = new ArrayList<>();
        arrList2.add("1");
        arrList2.add(2);
        
        System.out.println("arrList2 : " + arrList2);


    }
}
