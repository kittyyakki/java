package section02.set.run;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /*
        * TreeSet 클래스
        * 데이터가 정렬된 상태로 저장되는 검색 트리의 형태로 요소를 저장한다
        * 이진 검색 트리는 데이터를 추가하거나 제거하는 등의 동작 시간이 매우 빠르다
        * Set인터페이스가 가지는 특징을 그대로 가지지만 정렬된 상태를 유지한다는 것이 다른 점이다.
        * 나는 어떠한 요소를 가져와서 정렬을 하고 싶으면 TreeSet 나는 저장순서대로 하고 싶다 LinkedSet
        * */

        TreeSet<String> tset = new TreeSet<>();
        
        tset.add("java");
        tset.add("oracle");
        tset.add("jtbc");
        tset.add("html");
        tset.add("css");

        System.out.println("tset = " + tset); //오름차순 정렬됨

        Set<Integer> lotto = new TreeSet<>(); //Set에 쓰는 이유는 더 큰값을 앞에두기 위해서.

        while (lotto.size() < 6){
            lotto.add(((int)(Math.random()*45)) + 1); //45까지 하고 1부터 시작 Math는 Double이니 int형변환
        }
        System.out.println("lotto = " + lotto);
    }
}
