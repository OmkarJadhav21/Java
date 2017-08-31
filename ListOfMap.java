import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMap {    //We have to iterate that list of map

   void ListMap(){
List<Map<String,Object>>list=new ArrayList<>();

       Map<String,Object>map1=new HashMap<>();
        List<String>list1=new ArrayList<String>();
        list1.add("omkar");
        list1.add("jadhav");
        list1.add("pune");
       map1.put("Res",list1);
      //  System.out.println(list1);

       Map<String,Object>map2=new HashMap<>();
        List<String>list2=new ArrayList<String>();
        list2.add("myname");
        list2.add("mycity");
        list2.add("myid");
       map2.put("Res",list2);
      // System.out.println(list2);

list.add(map1);
list.add(map2);
       System.out.println(list);

       for (Map<String,Object>mpitr:list) {
           for (Map.Entry<String,Object>finitr:mpitr.entrySet()) {
               System.out.println(finitr.getKey() +"  "+finitr.getValue());
           }
       }

   }

    public static void main(String[] args) {
        ListOfMap l=new ListOfMap();
        l.ListMap();
    }










    }
