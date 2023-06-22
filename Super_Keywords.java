package Keywords_this_super;

/* 
 * ised in the concept of inheritance 
 * used to access parent class objects
 * used to invoke/call parent class constructors
 */
/* 
 * if he have two classes let suppose class A and class B
 * where class A inherits the class B 
 * in tha tcase if i wanna access that member of that class then i can use super class keywords
 */
/* 
 * one ore use of this super class
 * used to invoke parent class constructor
 */
class gh {
    int a; // instance variable
}

class ig extends gh {
    int a; // instance variable

    void show() {
        a = 10; // variabel of class ig
        super.a = 20; // it means i am assigning the variable of class gf a=20
        System.out.println("Parent class =" + super.a);
        System.out.println("SubClass =" + a);

    }
}

public class Super_Keywords {
    public static void main(String[] args) {
        ig ob1 = new ig();
        ob1.show();
    }

}
