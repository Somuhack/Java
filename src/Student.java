public class Student {
    String name;
    int age=21;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student details: {name:"+name +
                ", age:"+age+"}";
    }

    public static void main(String[] args) {
        Student st = new Student("somnath",21);
        System.out.println(st);
    }
}
