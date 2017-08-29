import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

    void getData(){
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Omkar from list");
        s1.setCity("Pune");
        List<Student> list=new ArrayList<Student>();
        list.add(s1);
        System.out.println(list);

        Student s2=new Student();
        s2.setId(2);
        s2.setCity("Pune");
        s2.setName("omk from list1");
        List<Student>list1=new ArrayList<Student>();
        list1.add(s2);

        System.out.println(list1);

        for (Student s:list1) {
            System.out.println(list);
        }

    }


    public static void main(String[] args) {
        ListDemo l=new ListDemo();
        l.getData();
    }

}
