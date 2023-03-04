public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Ahmet Hoca", "TRH", "0505" );
        Teacher t2 = new Teacher("Mustafa Hoca", "FZK", "0506" );
        Teacher t3 = new Teacher("Ali Hoca", "BIO", "0507" );

        Course tarih = new Course("Tarih", "101", "TRH");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course biyo = new Course("Biyoloji", "103", "BIO");

        Student s1 = new Student("inek Saban", "123", "4", tarih, fizik, biyo);

        s1.addBulkExamNote(80,50,70, 80, 60, 75);

        s1.isPass();
        s1.printNot();

        //t1.printTeacher();
        tarih.addTeacher(t1);
        tarih.printTeacherInfo();

        //t2.printTeacher();
        fizik.addTeacher(t2);
        fizik.printTeacherInfo();

        //t3.printTeacher();
        biyo.addTeacher(t3);
        biyo.printTeacherInfo();

    }
}