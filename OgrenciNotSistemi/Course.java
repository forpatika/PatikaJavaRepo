public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int  sozluNotu;
    double sozluOran;

    public Course(String name, String code, String prefix, int sozluNotu, double sozluOran) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotu = sozluNotu;
        this.sozluOran = sozluOran;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("Ýþlem baþarýlý");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamýþtýr.");
        }
    }
}