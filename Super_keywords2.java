package Keywords_this_super;

// in this way , we can access super class amthod 
class mahi {
    int a;

    void show() {
        System.out.println("Parent class");
    }

    void msg() {
    }
}

class Nafisa extends mahi {
    int a;

    void show() {
        System.out.println("Subclass class ");
    }

    void msg() {
        show();
        super.show();
    }

}

public class Super_keywords2 {
    public static void main(String[] args) {
        mahi ob = new mahi();
        ob.msg();
    }
}
