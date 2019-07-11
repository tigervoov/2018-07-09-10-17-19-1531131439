package practice11;

public class Student extends Person{
    private Klass klass;


    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce(){
        String outPut;
        if(klass.getLeader()!=null&&klass.getLeader().getName()==super.getName()){
            outPut=" I am a Student. I am Leader of "+klass.getDisplayName()+".";
        }else {
            outPut=" I am a Student. I am at "+klass.getDisplayName()+".";
        }
        return super.introduce()+ outPut;
    }
}
