// createed by team in Bangalore
public class Teacher {
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearsOfExperience;
    private int dateJoined;
    private int yearsInCenter;

    public Teacher(String name, String ic, String address, String qualification, int yearsOfExperience) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
        this.dateJoined = dateJoined;
        this.yearsInCenter = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getIc() {
        return this.ic;
    }

    public String getAddress() {
        return this.address;
    }

    public String getQualification() {
        return this.qualification;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public int getDateJoined() {
        return this.dateJoined;
    }

    public int getYearsInCenter() {
        return this.yearsInCenter;
    }

    public void setYearsInCenter(int years) {
        this.yearsInCenter = years;
    }
}



