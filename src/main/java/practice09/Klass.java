package practice09;


public class Klass {
    private int number;
    private Student leader;
    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName(){
        return "Class "+this.number;
    }
    public void assignLeader(Student student){
        if(student.getKlass().getNumber()==this.number){
            this.leader=student;
        }else {
            System.out.println("It is not one of us.\n");
        }
    }
    public void appendMember(Student student){
        student.setKlass(this);
    }
}
