public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String [] studentNo;
    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
        this.studentNo = new String[maxCapacity];
    }


    static void setMaxCapacity(int capacity){
        Course.maxCapacity=capacity;
    }
    void enrollStudent(String studentName){
        System.out.println("Congratulation");
        studentNo[enrollments]=studentName;
        enrollments++;
    }
    void unenrollStudent(String studentName){
        System.out.println(studentName +" Successfully Remove");
        findAndDeleteElement ar= new findAndDeleteElement();
        studentNo= ar.findPosition(studentName,studentNo);
        for(int i=0;i<studentNo.length;i++){
            if(studentNo[i]==null) break;
            System.out.println(studentNo[i]);
        }

        enrollments--;
    }

    public static void main(String[] args) {
        Course java = new Course("java");
        Course python = new Course("python");
        Course c= new Course("c");
        Course html = new Course("html");
        Course js = new Course("js");

       js.enrollStudent("Somnath");
        js.enrollStudent("sumon");
        js.enrollStudent("avi");
        js.enrollStudent("raja");
        js.unenrollStudent("sumon");
    }
}
