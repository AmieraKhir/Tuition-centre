
public class StudentBatch {

    // data section
    Student students[] = new Student[10];
    int currsz = 0;

    // operation
    void add(Student s, int i) {
        students[i] = s;
    }

    // method overloading
    void add(Student s) {
        students[currsz++] = s;
    }

    // find a particular student
    boolean find(String name) {
        // loop thru the array students
        // for each student in students
        //    check whether name is the same as that in student
        String findName;
        for (int i=0; i<currsz; i++) {
            findName= students[i].name.toString();
            System.out.println(students[i].name);
            if (findName == name)
                return true;
        }
        return false;
    }

}