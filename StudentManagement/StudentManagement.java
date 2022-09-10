public class StudentManagement {

    // TODO: khai bao thuoc tinh students la array chua cac doi tuong thuoc lop Student (max. 100)

    Student[] students = new Student[100];
    // check whether 2 student have same class

    public static boolean sameGroup(Student s1, Student s2) {
        // TODO:
        String per1 = s1.getGroup();
        String per2 = s2.getGroup();
        return per1.equals(per2);
    }
    // add student into Student class

    public void addStudent(Student newStudent) {
	    // TODO:
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = new Student(newStudent);
                break;
            }
        }
    }
    //return like what question required

    public String studentsByGroup() {
        // TODO:
        //create a blank string to return as info need
        StringBuilder res = new StringBuilder();
        int studentNum = students.length;
        boolean[] printStudent = new boolean[studentNum];

        //create array to check whether that student print or not

        int attend = 0;

        // count the student in list as attend

        for (Student student : students) {
            if (student != null) {
                attend++;
            } else {
                break;
            }
        }
        for (int i = 0; i < attend; i++) {
            if (!printStudent[i]) {
                res.append(students[i].getGroup());
                res.append("\n");
                for(int j = i; j < attend; j++) {
                    if(sameGroup(students[i], students[j])) {
                        res.append(students[j].getInfo());
                        res.append("\n");
                        printStudent[i] = true;
                    }
                }
            }
        }

	    return res.toString();
    }
    //remove student from id infomation

    public void removeStudent(String id) {
        // TODO:
        int studentNum = 0;
        for (Student student : students) {
            if (student != null) studentNum++;
            else {
                break;
            }
        }
        // find the number of student in student array

        for (int i = 0; i < studentNum; i++) {
            if (id.equals(students[i].getId())) {
                for (int j = i; j < studentNum - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        // find id student then put behind place to that id place then clear the last place
        students[studentNum - 1] = null;
    }

    public static void main(String[] args) {
        // TODO:
    }
}
