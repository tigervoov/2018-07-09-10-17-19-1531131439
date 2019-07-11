package practice11;
import java.util.LinkedList;

public class Teacher extends Person {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public String introduce(){
        String outPut;
        if(this.classes==null || this.classes.size()==0)
        {
            outPut=" I am a Teacher. I teach No Class.";
        }else {
            StringBuffer sb = new StringBuffer();
            for (int i=0;i<this.classes.size();i++){
                sb.append(this.classes.get(i).getNumber()).append(", ");
            }
            String classStr = sb.delete(sb.length() - 2,sb.length()).toString();
            outPut=" I am a Teacher. I teach Class "+classStr+".";
        }
        return super.introduce()+outPut;
    }
    public String introduceWith(Student student){
        String outPut;
        if(isTeaching(student)){
            outPut=" I am a Teacher. I teach "+student.getName()+".";
        }else {
            outPut=" I am a Teacher. I don't teach "+student.getName()+".";
        }
        return super.introduce()+outPut;
    }
    public Boolean isTeaching(Student student){
        boolean isTeaching=false;
        for(int i=0;i<this.classes.size();i++){
            if(this.classes.get(i).isIn(student)){
                isTeaching=true;
            }
        }
        return isTeaching;
    }
}
