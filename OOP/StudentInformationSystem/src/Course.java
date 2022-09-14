public class Course {
    Teacher teacher;
    String name,code,prefix;
    int note;
    int verbalNote;

    public Course(String name, String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        int note =0;
        int verbalNote = 0;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else {
            System.out.println("Teacher and Class information does not match.");
        }
    }
    public  void printTeacher(){
        if (teacher!=null){
            System.out.println(this.name+" course's teacher: "+teacher.name);
        }else {
            System.out.println(this.name +" course doesn't have a teacher.");
        }
    }


}
