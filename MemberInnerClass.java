public class MemberInnerClass {
    //****** This is Member Inner Class Example
    private int a=30;
    void myMethod(){
        System.out.println("in outer method " +a);
    }
    public class mainInner{

        void show(){
            System.out.println("in main Inner class value of a is \t"+a);
        }

    }


    public static void main(String[] args) {
        MemberInnerClass ot=new MemberInnerClass();
        MemberInnerClass.mainInner in=ot.new mainInner();
        in.show();
    }
}

