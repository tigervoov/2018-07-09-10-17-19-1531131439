package practice07;

public class Teacher extends Person{
    public Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce(){
        String outPut;
        if(this.klass ==null || this.klass.getNumber()==0)
        {
            outPut=" I am a Teacher. I teach No Class.";
        }else {
            outPut=" I am a Teacher. I teach "+this.klass.getDisplayName()+".";
        }
        return super.introduce()+outPut;
    }
    public String introduceWith(Student student){
        String outPut;
        if(student.getKlass().getNumber()==this.klass.getNumber()){
            outPut=" I am a Teacher. I teach "+student.getName()+".";
        }else {
            outPut=" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return super.introduce()+outPut;
    }
}
