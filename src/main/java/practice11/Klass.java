package practice11;

public class Klass {
    private int number;
    private Student leader;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() == this.number) {
            this.leader = student;
            this.getTeacher().sayLeader(student.getName(),this.getDisplayName());
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        student.setKlass(this);
        if(this.getTeacher()!=null){
            this.getTeacher().say(student.getName(),this.getDisplayName());
        }


    }

    public Boolean isIn(Student student) {
        return student.getKlass().getNumber() == this.getNumber();
    }
}
