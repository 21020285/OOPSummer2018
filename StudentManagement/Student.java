public class Student {

    // TODO: khai bao cac thuoc tinh cho Student
    private String name;
    private String id;
    private String group;
    private String email;
    // TODO: khai bao cac phuong thuc getter, setter cho Student

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup() {
        this.group = group;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail() {
        this.email = email;
    }
    /** 
     * define student infomation type
     */

    Student() {
        // TODO:
        name = "Student";
        id = "000";
        group = "K62CB";
        email = "uet@vnu.edu.vn";
    }

    /** 
     * take infomation from student
     * @param name first
     * @param id second
     * @param email third 
     */

    public Student(String name, String id, String email) {
        // TODO:
        this.name = name;
        this.id = id;
        this.group = "K62CB";
        this.email = email;
    }

    /** 
     * I don't know, maybe copy Student?
     * @param s add like Sutdent
     */
    Student(Student s) {
        // TODO:
        name = s.name;
        id = s.id;
        group = s.group;
        email = s.email;
    }

    String getInfo() {
        // TODO:
        return name + " - " + id + " - " + group + " - " + email;
    }
}
