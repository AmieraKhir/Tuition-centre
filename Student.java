// created by team in KL
public class Student {
    // data/attributes
    Name name;
    private String kp;
    private String address;
    private String schoolname;
    double avg;
    int min;
    int max;
    private float marks[] = new float[5];

    public void setName(Name name) {
        this.name = name;
    }

    public void setKP(String kp){
        this.kp = kp;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setSchoolName(String schoolname){
        this.schoolname = schoolname;
    }

    //GET
    public Name getName(){
        System.out.println("Student Name: " + name);
        return name;
    }

    public String getKP(){
        System.out.println("IC Number: " + kp);
        return kp;
    }

    public String getAddress(){
        System.out.println("Address: " + address);
        return address;
    }

    public String getSchoolName(){
        System.out.println("School Name: " + schoolname);
        return schoolname;
    }
    // methods or operations

    float calcAvg() {
        float sum=0;
        float avg=0;
        for(int i=0; i<5;i++){
            sum+= marks[i];
        }
        avg= sum/5;
        return avg;
    }

    public double getAvg(){
        return this.avg;
    }

    float calcMin() {
        float min = 9999;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        return min;

    }

    public int getMin(){
        return this.min;
    }


    float calcMax() {
        float max = -100;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        return max;

    }

    public int getMax(){
        return this.max;
    }


    public void setMark(float mark, int i) throws Exception {
        if (mark < 0)
            throw new Exception("Error in mark detected");
        marks[i] = mark;
    }

    public void displayMarks() {
        // print the marks
        for (int i=0; i<marks.length; i++) {
            System.out.println("marks at index "+i+" :"+marks[i]);
        }
    }

}