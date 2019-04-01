package learn;

public class StudentProxy implements Person {
    private Student student;
    public StudentProxy(Student student){
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println("----start----");
        student.run();
        System.out.println("----end----");
    }
    public static void main(String[] args){
        Student student1 = new Student();
        StudentProxy studentProxy = new StudentProxy(student1);
        studentProxy.run();
    }
}
