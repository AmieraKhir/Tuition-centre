class Name {

    private String fname;
    private String lname;
    private String mname;
    private String name;

    public void setFName(String fname) {
        // "this" refers to the class attributes
        this.fname = fname;
    }

    public void setMName(String mname) {
        // "this" refers to the class attributes
        this.mname = mname;
    }

    public void setLName(String lname) {
        // "this" refers to the class attributes
        this.lname = lname;
    }
    public String getFname() {
        // "this" refers to the class attributes
        return fname;}
    public String getMname() {
        // "this" refers to the class attributes
        return mname;}
    public String getLname() {
        // "this" refers to the class attributes
        return lname;}

}