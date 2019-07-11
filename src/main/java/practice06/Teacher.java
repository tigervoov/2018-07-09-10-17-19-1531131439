package practice06;

public class Teacher extends Person{
    public int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    public String introduce(){
        String outPut;
        if(this.klass==0)
        {
            outPut=" I am a Teacher. I teach No Class.";
        }else {
            outPut=" I am a Teacher. I teach Class"+this.klass+".";
        }
        return super.introduce()+outPut;
    }
}
