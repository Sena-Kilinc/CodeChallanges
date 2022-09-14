public class Main {
    public static void main(String[] args) {
        Course math= new Course("Math", "MAT101", "MATH");
        Course physics= new Course("Physics", "PHY101", "PHYSICS");
        Course chem= new Course("Chem", "CHEM101", "CHEM");

        Teacher t1 =new Teacher("Jack", "1111","MATH" );
        Teacher t2 =new Teacher("Brenda", "2222","PHYSICS" );
        Teacher t3 =new Teacher("Cassie", "333","CHEM" );

        math.addTeacher(t1);
        physics.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 =new Student("Robert", "444", 3, math, physics, chem);
        s1.addNote(50,60, 60,70, 70,60);
        s1.isPass();



    }
}
