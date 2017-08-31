import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {  //**set removes duplicate elements from the list/hashset
    // ,means it is having unique elements
    void Myset(){
//        HashSet<Student>hash=new HashSet<Student>();
//        Student s3=new Student();
//        s3.setName("myname");
//        s3.setCity("Pune");
//        s3.setId(1);
//        Student s4=new Student();
//        s4.setName("your name");
//        s4.setCity("Mumbai");
//        s4.setId(2);
//        hash.add(s3);
//        hash.add(s4);
//
//        for (Student d:hash) {
//            System.out.println(d.city+" "+d.id+" "+d.name);
//        }

        HashSet<String>hash=new HashSet<String >();
        hash.add("Omkar");
        hash.add("jadhav");
        hash.add("Jadhav");
        hash.add("Omkar");
        System.out.println(hash);
        hash.clone();//clone the instances of elements not elements
        System.out.println(hash);
        System.out.println(hash.size());//print size of set
        System.out.println(hash.contains("Omkar"));//Returns true or false if the value is present
        System.out.println(hash.remove("jadhav"));//remove specified value from set
        System.out.println(hash);

        Iterator<String>itr=hash.iterator();        //iterate the set
        while (itr.hasNext()){
            System.out.println("values are  \t"+itr.next());
        }

        hash.clear();//Removes all the elements
        System.out.println(hash);
        System.out.println(hash.isEmpty());//Returns true or false if set is empty
        System.out.println(hash.size());



    }

    public static void main(String[] args) {
        HashSetDemo h=new HashSetDemo();
        h.Myset();
    }
}
