package section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        
        /*
        * LinkedHashSet 클래스
        * HashSet의 기능을 모두 가지고 있고 추가적으로 저장순서를 유지하는 기능을하고 있다
        * */

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("java");
        linkedHashSet.add("oracle");
        linkedHashSet.add("html");
        linkedHashSet.add("jdbc");
        linkedHashSet.add("css");

        System.out.println("linkedHashSet = " + linkedHashSet); //HashSet과 다르게 저장순서가 유지됨

        TreeSet<String> tset = new TreeSet<>(linkedHashSet);//하고 안에 인자를 넣어줌
        //같은 타입을 비교해서 오름차순으로 정렬을 해줌
        System.out.println("tset = " + tset);

    }
}
