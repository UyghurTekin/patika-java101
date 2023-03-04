public class Course {
    Teacher teacher;
    String name, code, prefix;
    int note, sNote;
    double total;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sNote = 0;
        this.total = 0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            System.out.println("Atama Gerceklesti !");
        } else {
            System.out.println("Ogretmen Ve Ders Bolumleri Uyusmadi !");
        }

    }

    void printTeacherInfo() {
        this.teacher.printTeacher();

    }

    // ======= odev ========
    double totalHesaplama(String coursePrefix) {

        switch (coursePrefix) {
            case "MTK":
                this.total = (this.note * 0.75) + (this.sNote * 0.25);
                break;
            case "FZK":
                this.total = (this.note * 0.8) + (this.sNote * 0.2);
                break; // 56 +16 = 72
            case "KMY":
                this.total = (this.note * 0.85) + (this.sNote * 0.15);
                break;
            case "BIO":
                this.total = (this.note * 0.7) + (this.sNote * 0.3);
                break; // 42 + 22.5 = 64.5
            case "TRK":
                this.total = (this.note * 0.6) + (this.sNote * 0.4);
                break;
            case "TRH":
                this.total = (this.note * 0.5) + (this.sNote * 0.5);
                break; // 40 + 25 = 65
            default:
                System.out.println(this.name + " Dersi bulunamadi ! 0 olarak eklendi");
        }
        return this.total;
    }

}
