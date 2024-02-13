package classwork;

@Company()
class CustomAnnotationEmployee {
    int id;
    String name;

    public CustomAnnotationEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void getEmployeeDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Employee name: " + name);
    }
}
