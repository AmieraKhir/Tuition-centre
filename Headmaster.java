import java.util.*;
public class Headmaster {
    private String name;
    private String ic;
    private String address;
    private String qualification;
    private int yearsOfExperience;

    public Headmaster(String name, String ic, String address, String qualification, int yearsOfExperience) {
        this.name = name;
        this.ic = ic;
        this.address = address;
        this.qualification = qualification;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getName(String name) {
        return name;
    }

    public String getIc() {
        return ic;
    }

    public String getAddress() {
        return address;
    }

    public String getQualification() {
        return qualification;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
