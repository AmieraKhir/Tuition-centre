import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TuitionCenter {
    private Name name;
    private String centerName;
    private String headMaster;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public TuitionCenter(String centerName, String headMaster) {
        this.centerName = centerName;
        this.headMaster = headMaster;
        this.teachers = new ArrayList<>();
        this.students = new ArrayList<>();
    }
    public String centerName() {
        return this.centerName;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    public int getNumberOfTeachers() {
        return this.teachers.size();
    }

    public int getNumberOfStudents() {
        return this.students.size();
    }
    public String getHeadMaster() {
        return this.headMaster;
    }

    public List<String> getTeachersBackground() {
        List<String> background = new ArrayList<>();
        for (Teacher teacher : this.teachers) {
            String info = teacher.getName() + " (" + teacher.getQualification() + ", " + teacher.getYearsOfExperience() + " years experience)";
            background.add(info);

        }
        return background;
    }
//    public List<Name> getStudentsNames() {
//        List<Name> backgroundStudent = new ArrayList<>();
//        for (Student student : this.students) {
//            Name infos = student.getName() ;
//            backgroundStudent.add(infos);
//
//        }
//        return backgroundStudent;
//    }

}