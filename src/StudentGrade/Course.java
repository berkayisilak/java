package StudentGrade;

public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int verbal;
    Teacher teacher;

    Course(String name, String code, String prefix, Teacher teacher) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.verbal = 0;
        this.note = 0;

    }

    void addTeacher (Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
        } else {
            System.out.println("Öğretmen ve ders alanları uyuşmuyor.");
        }

    }

    void printTeacher () {
        this.teacher.printInfo();
    }

}
