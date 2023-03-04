public class Teacher {
    String name, branch, mpno;
    Teacher(String name, String branch, String mpno){
        this.name = name;
        this.branch = branch;
        this.mpno = mpno;
    }

    void  printTeacher(){
        System.out.println("Adi : " + this.name);
        System.out.println("Bolum : " + this.branch);
        System.out.println("Telefon : " + this.mpno);
    }
}
