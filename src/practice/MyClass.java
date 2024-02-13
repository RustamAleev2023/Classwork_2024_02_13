package practice;

@MyAnnotation
public class MyClass {
    int num;

    public MyClass(int num) {
        this.num = num;
    }

    public void function(int num1, int num2) {
        System.out.println((num1 + num2) * num);
    }
}
