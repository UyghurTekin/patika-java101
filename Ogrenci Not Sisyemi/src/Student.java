public class Student {
    Course c1, c2, c3;
    String name, stuNo, classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int sNote1, int note2,int sNote2, int note3, int sNote3){
        if (note1 >= 0 && note1 <= 100 && sNote1 >= 0 && sNote1 <= 100){
            c1.note = note1;
            c1.sNote = sNote1;
        }
        if (note1 >= 0 && note2 <= 100 && sNote2 >= 0 && sNote2 <= 100){
            c2.note = note2;
            c2.sNote = sNote2;
        }
        if (note1 >= 0 && note3 <= 100 && sNote3 >= 0 && sNote3 <= 100){
            c3.note = note3;
            c3.sNote = sNote3;
        }
    }

    void isPass(){
        // 65 + 72 + 64.5 = 201.5 / 3 = 67.17
        this.avarage = (c1.totalHesaplama(c1.prefix) + c2.totalHesaplama(c2.prefix) + c3.totalHesaplama(c3.prefix)) / 3;

        if (this.avarage >= 60){
            System.out.println(this.name + " sinifi Gecti !");
            this.isPass = true;
        }else {
            System.out.println(this.name + " sinifita kaldi !");
            this.isPass = false;
        }
    }

    void printNot(){
        System.out.println(this.c1.name + " Sinav Notunuz:" + this.c1.note  );
        System.out.println(this.c1.name + " Sozlu Notunuz:" + this.c1.sNote);
        System.out.println(this.c2.name + " Sinav Notunuz:" + this.c2.note  );
        System.out.println(this.c2.name + " Sozlu Notunuz:" + this.c2.sNote);
        System.out.println(this.c3.name + " Sinav Notunuz:" + this.c3.note  );
        System.out.println(this.c3.name + " Sozlu Notunuz:" + this.c3.sNote);
        System.out.printf("Ortalamaniz: %.2f %n",this.avarage);
    }
}
