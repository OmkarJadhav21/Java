import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {
    void myMap(){
List<Map<String,List<Student>>>list=new ArrayList<>();  //This is list of Maps

        Map<String,List<Student>>map1=new HashMap<>();

            Student st=new Student();
            st.setId(1);
            st.setName("omkar");
            st.setCity("Pune");
    //        System.out.println(st1);

            Student st1=new Student();
            st1.setId(2);
            st1.setName("Omiee");
            st1.setCity("Mumbai");
    //        System.out.println(st1);

            List<Student>list1=new ArrayList<>();
            list1.add(st);
            list1.add(st1);
//            System.out.println(list1);

        map1.put("Result1",list1);
        System.out.println(map1);


        Map<String,List<Student>>map2=new HashMap<>();

            Student st2=new Student();
            st2.setId(3);
            st2.setName("Jadhav");
            st2.setCity("Pune");
    //        System.out.println(st2);

            Student st3=new Student();
            st3.setId(4);
            st3.setName("RAj");
            st3.setCity("Mumbai");
    //        System.out.println(st3);

            List<Student>list2=new ArrayList<>();
            list2.add(st2);
            list2.add(st3);
//            System.out.println(list2);

         map2.put("Result2",list2);
         System.out.println(map2);

list.add(map1);
list.add(map2);
System.out.println(list);
    }

    public static void main(String[] args) {
        MapDemo m=new MapDemo();
        m.myMap();
    }


}

