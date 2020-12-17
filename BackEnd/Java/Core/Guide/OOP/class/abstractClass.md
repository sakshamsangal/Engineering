```
abstract class Person {
    abstract void setNationality();
}

class Student extends Person {

    @Override
    void setNationality() {
        System.out.println("Indian");
    }
}
class Main {
    public static void main(String[] args) {
        new Student().setNationality(); // Indian
    }
}
```