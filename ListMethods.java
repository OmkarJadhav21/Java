import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {
    void show(){

        List<String> list=new ArrayList<String>();
       // List list=new ArrayList();
        list.add("1om");
        list.add("2omka");
        list.add("3omkar");
//        list.add(431321311);


        list.add(2,"Jadhav");       //here we added element at index 2
        System.out.println(list);
        System.out.println(list.lastIndexOf("3omkar"));

        System.out.println("Elemnt at locaton 2 is "+list.get(2));  //returns elmnt at specifd index
        list.set(2,"first");        //assign element to the location specified by index within the invoking list.
        list.remove(2);     //remove the element at position index 
        System.out.println("Elemnt at locaton 2 is "+list.get(2));  //returns elmnt at specifd index

        List<String>list2=new ArrayList<>();
        list2.addAll(list);     //this will add elemtns from list and list2
        System.out.println(list2);

//Method #1 : Iterate using for loop
        System.out.println("===>>Iterate using for loop");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

//Method #2 : Iterate using advanced for loop(for each)
        System.out.println("===>>Using Advanced for loop");
        for ( String myStr:list) {
            System.out.println(myStr);
        }

//Method #3 : Iterate using Iterator
        System.out.println("===>>Using Iterator");
        ListIterator<String>itr=list.listIterator();
        System.out.println("list in forward direction");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("list in reverse direction");
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }



        //Method #4 : Iterate using while loop
        System.out.println("===>>Using while  loop");
        int index=0;
        while (list.size()>index){
            System.out.println(list.get(index));
            index++;
        }

    }

    public static void main(String[] args) {
        ListMethods s=new ListMethods();
        s.show();

    }

}
