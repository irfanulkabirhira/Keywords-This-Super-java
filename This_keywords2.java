package Keywords_this_super;

// this key word is used to onvoke current class constructor
class def {
    int d, e, f;

    def(int d, int e) {
        this.d = d;
        this.e = e;

    }

    def(int d, int e, int f) {
        // invoking current class constructor
        this(d, e);
        this.f = f;
    }

    void show() {
        System.out.println(+d);
        System.out.println(+e);

    }

    void show1() {
        System.out.println(+d);
        System.out.println(+e);
        System.out.println(+f);

    }

}

public class This_keywords2 {
    public static void main(String[] args) {
        def ob = new def(10, 20);
        ob.show1();
    }
}
