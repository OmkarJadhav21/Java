import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map_ListofObject {
    void LiofMap() {
    Map<String, List<Student2>> map=new HashMap<>();
        List<Student2> mylist = new ArrayList<>();

        Student2 stud1 = new Student2();
        stud1.setPrice(1000);
        stud1.setProduct("Mobiles");

        Student2 stud2=new Student2();
        stud2.setProduct("Ganpati");
        stud2.setPrice(50000);

        mylist.add(stud1);
        mylist.add(stud2);
    map.put("values",mylist);
        System.out.println(map);

        for (Map.Entry<String,List<Student2>>mitr:map.entrySet()) {
            List<Student2>li=mitr.getValue();
            for (Student2 l:li) {
                System.out.println(l.getPrice() +" "+l.getProduct());

            }


        }
    }







    public static void main(String[] args) {
        Map_ListofObject mp=new Map_ListofObject();
        mp.LiofMap();
        }
    public class Student2{
        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        int price;

        @Override
        public String toString() {
            return "Student2{" +
                    "price=" + price +
                    ", product='" + product + '\'' +
                    '}';
        }

        String product;

    }
}
