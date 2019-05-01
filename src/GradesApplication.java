import java.util.HashMap;

public class GradesApplication extends Student {

    public static void main(String[] args) {


        HashMap<String, Student> students = new HashMap<>();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        student4.setName("charles");
        student5.setName("John");
        student6.setName("Henry");
        students.put("student4@gmail", student4);
        students.put("student5@email", student5);
        students.put("student6@eramil", student6);
        student4.addGrade(89);
        student4.addGrade(69);
        student4.addGrade(79);
        student5.addGrade(89);
        student5.addGrade(54);
        student5.addGrade(100);
        student6.addGrade(29);
        student6.addGrade(68);
        student6.addGrade(74);





        System.out.println("Which student would you like to see more information about: " + students.toString());

    }
}
