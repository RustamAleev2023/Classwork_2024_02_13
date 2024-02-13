import practice.MyAnnotation;
import practice.MyClass;
import practice.MyClassDivide;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

//        classwork.CustomAnnotationEmployee employee = new classwork.CustomAnnotationEmployee(1, "Jones");
//        employee.getEmployeeDetails();
//        Annotation companiAnnotation = employee.getClass().getAnnotation(classwork.Company.class);
//        classwork.Company company = (classwork.Company) companiAnnotation;
//        System.out.println("classwork.Company name: " + company.name());
//        System.out.println("classwork.Company city: " + company.city());
//
//        classwork.CustomAnnotationManager manager = new classwork.CustomAnnotationManager(2, "Manager");
//        manager.getEmployeeDetails();
//        Annotation companiAnnotation1 = manager.getClass().getAnnotation(classwork.Company.class);
//        classwork.Company company1 = (classwork.Company) companiAnnotation1;
//        System.out.println("classwork.Company name: " + company1.name());
//        System.out.println("classwork.Company city: " + company1.city());

        MyClass myClass = new MyClass(10);
        Annotation myClassAn = myClass.getClass().getAnnotation(MyAnnotation.class);
        MyAnnotation annotation = (MyAnnotation) myClassAn;
        myClass.function(annotation.num1(), annotation.num2());
        System.out.println("============================================");

        MyClassDivide myClassDivide = new MyClassDivide(3);
        Annotation myClassDivAn = myClassDivide.getClass().getAnnotation(MyAnnotation.class);
        MyAnnotation annotation1 = (MyAnnotation) myClassDivAn;
        myClassDivide.function(annotation1.num1(), annotation1.num2());

    }
}

