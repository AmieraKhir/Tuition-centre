// application team in UTP
import java.util.*;
public class Main
{

    // application code
    public static void main(String[] args) {
        System.out.println("WELCOME TO PANDAI SDN BHD!");

        Student aliah = new Student();
        Name alia = new Name();
        alia.setFName("Aliah");
        alia.setMName("binti");
        alia.setLName("Razak");
        // aliah.setIc("0412023233");
        // aliah.setAddress("322, Jalan Tengkuanum");
        aliah.setName(alia);


        try {  // try block.. something in here can cause exception
            aliah.setMark(10, 0);
            aliah.setMark(20, 1);
            aliah.setMark(40, 2);
            aliah.setMark(60, 3);
            aliah.setMark(70, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }


        Student adila = new Student();
        Name adil= new Name();
        adil.setFName("Adila");
        adil.setMName("binti");
        adil.setLName("Izzat");
        adila.setName(adil);


        try {  // try block.. something in here can cause exception
            adila.setMark(80, 0);
            adila.setMark(23, 1);
            adila.setMark(43, 2);
            adila.setMark(60, 3);
            adila.setMark(93, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        // calculate and print the avg for aliah
        // System.out.println("Avg mark for Adila is " + adila.calcAvg());
        // // calculate the min marks for aliah
        // System.out.println("Min mark for Adila is " + adila.calcMin());

        Student imran = new Student();
        Name ran= new Name();
        ran.setFName("Syed");
        ran.setLName("Imran");
        imran.setName(ran);

        try {  // try block.. something in here can cause exception
            imran.setMark(10, 0);
            imran.setMark(90, 1);
            imran.setMark(80, 2);
            imran.setMark(60, 3);
            imran.setMark(70, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }

        //kp
        aliah.setKP("028394028394");
        adila.setKP("031203948444");
        imran.setKP("039499403403");

        //address
        aliah.setAddress("KL");
        adila.setAddress("Kedah");
        imran.setAddress("Penang");

        //schoolname
        aliah.setSchoolName("SMKTATAR");
        adila.setSchoolName("SMKKB");
        imran.setSchoolName("SMKTKK");

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(aliah, 0);
        sb2023.add(adila, 1);
        sb2023.add(imran, 2);


//        boolean findName = sb2023.find("Imran");
//        System.out.println(findName);

        TuitionCenter center1 = new TuitionCenter("KL001", "Ku Hakim");
        // Add some students and tutors to the center
        center1.addStudent(aliah);
        center1.addStudent(adila);

        Teacher teacher1 = new Teacher("Amar", "987654321","Degree in Mathematics", "34, Jln Tengku",  5);
        Teacher teacher2 = new Teacher("Alexander", "123456789", "Degree in Science","78, Taman Alam",  3);
        center1.addTeacher(teacher1);
        center1.addTeacher(teacher2);

        TuitionCenter center2 = new TuitionCenter("KL002", "Malia");
        center2.addStudent(imran);

        Teacher teacher3 = new Teacher("Akim", "987654321","Degree in English", "122, Taman Suasnaa",  3);
        Teacher teacher4 = new Teacher("Aliff Hazim", "123456789", "Degree in History","78, Taman Damai",  6);
        center2.addTeacher(teacher3);
        center2.addTeacher(teacher4);



        System.out.println("\n---Background of " + center1.centerName()  +"---" );
        System.out.println("The HeadMaster is: "+center1.getHeadMaster());
        System.out.println(center1.getNumberOfTeachers() + " teachers work at " + center1.centerName()+":\n"+ center1.getTeachersBackground());
        System.out.println(center1.getNumberOfStudents() + " students are enrolled in " + center1.centerName());
        System.out.println("---Student's Info---");
        System.out.println("Student Name: " + alia.getFname() + " " + alia.getMname() + " " + alia.getLname());
        aliah.getKP();
        aliah.getAddress();
        aliah.getSchoolName();


        System.out.println("---Aliah's Marks---");
        aliah.displayMarks();
        System.out.println("----Aliah's Calculations----");
        // calculate and print the avg for aliah
        System.out.println("Avg mark for Aliah is " + aliah.calcAvg());
        // calculate the min and max marks for aliah
        System.out.println("Min mark for Aliah is " + aliah.calcMin());
        System.out.println("Max mark for Aliah is " + aliah.calcMax());

        System.out.println("---Student's Info---");
        System.out.println("Student Name: " + adil.getFname() + " " + adil.getMname() + " " + adil.getLname());
        adila.getKP();
        adila.getAddress();
        adila.getSchoolName();
        System.out.println("---Adila's Marks---");
        imran.displayMarks();
        System.out.println("----Adila's Calculations----");
        // calculate and print the avg for aliah
        System.out.println("Avg mark for Adila is " + adila.calcAvg());
        // calculate the min and max marks for aliah
        System.out.println("Min mark for Adila is " + adila.calcMin());
        System.out.println("Max mark for Adila is " + adila.calcMax());

        System.out.println("\n---Background of " + center2.centerName()  +"---" );
        System.out.println("The HeadMaster is: "+center2.getHeadMaster());
        System.out.println(center2.getNumberOfTeachers() + " teachers work at " + center2.centerName()+":\n"+ center2.getTeachersBackground());
        System.out.println(center2.getNumberOfStudents() + " students are enrolled in " + center2.centerName());
        System.out.println("---Student's Info---");
        System.out.println("Student Name: " + ran.getFname() +" " + ran.getLname());
        imran.getKP();
        imran.getAddress();
        imran.getSchoolName();

        System.out.println("---Imran's Marks---");
        imran.displayMarks();
        System.out.println("----Imran's Calculations----");
        // calculate and print the avg for aliah
        System.out.println("Avg mark for Imran is " + imran.calcAvg());
        // calculate the min and max marks for aliah
        System.out.println("Min mark for Imran is " + imran.calcMin());
        System.out.println("Max mark for Imran is " + imran.calcMax());

    }

}
