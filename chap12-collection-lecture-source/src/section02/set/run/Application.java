package section02.set.run;

import java.util.HashSet;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        /*
        * Set 인터페이스를 구현한 Set 컬렉션 클래스의 특징
        * 1. 요소의 저장 순서를 유지하지 않는다
        * 2. 같은 요소의 중복저장을 허용하지 않는다(null값도 중복되지 않게 하나의 null만 저장한다)
        * */
        /*
        * HashSet 클래스
        * Set 컬렉션 클래스에서 가장 많이 사용되는 클래스 중 하나이다
        * JDK1.2부터 제공되고 있으며 해시 알고리즘을 사용하여 검색 속도가 빠르다는 장점을 가진다.
        * */

        HashSet<String> hset = new HashSet<>();
        
        hset.add("java");
        hset.add("oracle");
        hset.add("jdbc");
        hset.add("html");
        hset.add("css");
        System.out.println("hset = " + hset); //저장순서 뒤죽박죽
        
        hset.add(new String("java"));
        //hset.add("java"); 이렇게 해도 됨 new는 새로운 인스턴스생성

        System.out.println("hset = " + hset); //중복 저장안됨 그대로
        System.out.println("hset.size() 저장된 객체수 = " + hset.size()); //저장된 객체수
        System.out.println("hset.contains(new) 포함확인 = " + hset.contains(new String("oracle"))); //포함확인

        /* 1. toArray() 배열로 바꾸고 for loop를 사용 */
        Object [] arr = hset.toArray(new String[0]); //모든 타입 받아주는 object 로 string 배열객체 생성
        for(int i = 0 ; i< arr.length; i++){
            System.out.println(i + "arr[i] = " + arr[i]);
        }

        /* iterator()로 목록 만들어 연속처리*/
        Iterator<String> iter = hset.iterator(); //Iterator로 목록만들어 연속처리
        while (iter.hasNext()){
            System.out.println("iter.next() = " + iter.next());
        }
        hset.clear(); //싹다 비우기
        System.out.println("hset = " + hset.isEmpty()); //확인할때는 isEmpty()
        
    }
}
