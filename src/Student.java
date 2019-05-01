import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int grade;
    protected static ArrayList<Integer> grades = new ArrayList<>();

    public Student() {};

    public Student(String name, int grade, ArrayList grades) {
        this.name = name;
        this.grade = grade;
        this.grades = grades;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage(List<Integer> grades) {
           Integer sum = 0;
           for(Integer grade : grades) {
               sum += grade;
           }
           return sum.doubleValue() / grades.size();

    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.addGrade(50);
        student1.addGrade(100);
        student1.addGrade(100);
        student1.addGrade(100);

        System.out.println(student1.grades);
        System.out.println(student1.getGradeAverage(grades));

    }
}
