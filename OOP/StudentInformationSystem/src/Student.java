public class Student {
    String name,stuNo;
    int classes;
    Course math,physics,chem;
    double avg,physAvg,mathAvg,chemAvg;
    boolean isPass;

    public Student(String name, String stuNo, int classes, Course math, Course physics, Course chem) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.math = math;
        this.physics = physics;
        this.chem = chem;
        calcAvg();
        this.isPass=false;
    }


    public void addNote(int mathVerb, int mathPaper,int phyVerb,
                        int phyPaper,int chemVerb,int chemPaper){
        if (mathVerb>=0 && mathVerb<=100){
            this.math.verbalNote = mathVerb;
        }
        if (mathPaper>=0 && mathPaper<=100){
            this.math.note = mathPaper;
        }

        if (phyVerb>=0 && phyVerb<=100){
            this.physics.verbalNote = phyVerb;
        }
        if (phyPaper>=0 && phyPaper<=100){
            this.physics.note = phyPaper;
        }

        if (chemVerb>=0 && chemVerb<=100){
            this.chem.verbalNote = chemVerb;
        }
        if (chemPaper>=0 && chemPaper<=100){
            this.chem.note = chemPaper;
        }
    }

    public void calcAvg(){
        this.physAvg = this.physics.verbalNote * 0.2 + this.physics.note * 0.8;
        this.mathAvg = this.math.verbalNote * 0.2 + this.math.note * 0.8;
        this.chemAvg = this.chem.verbalNote * 0.2 + this.chem.note * 0.8;
        this.avg=(physAvg+mathAvg+chemAvg)/3;
    }

    public boolean isCheckPass(){
        calcAvg();
        return this.avg>55;
    }
    public void isPass(){
        if (this.math.note == 0 || this.physics.note==0 || this.chem.note==0){
            System.out.println("Please enter the notes correctly.");
        }else{
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Average: "+this.avg);
            if (this.isPass){
                System.out.println("Passed the course.");
            }else {
                System.out.println("Failed the course.");
            }

        }
    }
    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mathAvg);
        System.out.println("Fizik Notu : " + this.physAvg);
        System.out.println("Kimya Notu : " + this.chemAvg);
    }
}
