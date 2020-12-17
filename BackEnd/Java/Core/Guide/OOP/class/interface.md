public because so that implementing class can access it.
static because interface object is not created.
final because so that we cannot reassign variable.
abstract because methods are declared without deinition.

In Java 8, we can have default and static methods in interfaces


class Base {
    public void display() {
        System.out.println("This is the display function of the base class.");
    }
}

interface BaseInterface {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class Source extends Base implements BaseInterface {

    public static void main(String[] args) {
        Source obj = new Source();
        obj.display(); // class has higher priority than interface.
    }

}

// output
// This is the display function of the base class.
 

 
// example 2
interface Interface1 {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

interface Interface2 {
    default public void display() {
        System.out.println("This is the display function of the interface class.");
    }
}

class Source implements Interface1, Interface2 {

    @Override
    public void display() { // override display to avoid method conflict
        System.out.println("Source");
    }
    public static void main(String[] args) {
        Source obj = new Source();
        obj.display();
    }

}


For reference:
https://www.geeksforgeeks.org/default-methods-java/