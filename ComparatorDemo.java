import com.sun.corba.se.impl.orbutil.ObjectStreamClassUtil_1_3;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
void compare() {
    List<Customer>list=new ArrayList<>();
    Customer c1=new Customer();
    c1.setId(21);
    c1.setName("AOmkar");
    c1.setAge(21);

    Customer c2=new Customer();
    c2.setId(24);
    c2.setName("CRaj");
    c2.setAge(20);

    Customer c3=new Customer();
    c3.setId(3);
    c3.setName("Bhrishi");
    c3.setAge(25);


    list.add(c1);
    list.add(c2);
    list.add(c3);

    System.out.println("This is unsorted list");
    for (Customer clist:list) {
        System.out.println(clist.getId()+" "+clist.getName()+" "+clist.getAge());
    }


    Collections.sort(list, new Comparator<Customer>() {
        @Override
        public int compare(Customer o1, Customer o2) {
//          return o1.getId()-o2.getId();       //sort by Id
//          return o1.getAge()-o2.getAge();     //sort by Age
          return o1.getName().compareTo(o2.getName());  //Sort by Name

        }
    });
//   LAMBDA EXPRESSIONN FOR THIS CODE IS --
//    list.sort((o1,o2)->o1.getName().compareTo(o2.getName()));

    System.out.println("This is sorted  list by **** ");

    for (Customer clist:list) {
        System.out.println(clist.getId()+" "+clist.getName()+" "+clist.getAge());

    }
}
public static void main(String[] args) {
        ComparatorDemo cd=new ComparatorDemo();
        cd.compare();
    }


public class Customer{

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int id;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    int age;
        String name;


}
}
