package Keywords_this_super;

/* 
 * this and super are reference variable
 * used to refer any number of current class
 */
class abc {
    int a, b; // instance variable

    void setdata(int a, int b) // local variable
    {
        this.a = a;
        this.b = b;

    }

    void show() {
        System.out.println(+a);
        System.out.println(+b);

    }
}

public class This_keywords {
    public static void main(String[] args) {
        abc ob1 = new abc();
        ob1.setdata(10, 20);
        ob1.show();

    }
}
