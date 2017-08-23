public class AnonymousInnerClass {
    //****** This is Anonymous Inner Class Example
    //Can be acheived by 2 ways 1)by abstract class or concrete class and by interface

    public static void main(String[] args) {
        AnonyInterface ai=new AnonyInterface() {
            @Override
            public void show() {
                System.out.println("This is by using the interface");
            }
        };

        anonym an=new anonym() {
            @Override
            void display() {
                System.out.println("This is by using the abstract class");
            }
        };

        ai.show();
        an.display();

    }

}

abstract class anonym{ //using absrtact class
    abstract void display();
}

interface AnonyInterface{ //using Interface
    void show();
}
