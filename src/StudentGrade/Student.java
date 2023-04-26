package StudentGrade;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course course1;
    Course course2;
    Course course3;
    double average;
    double c1;
    double c2;
    double c3;

    boolean isPass;

    Student(String name, String stuNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote (int note1, int note2, int note3, int verbal1, int verbal2, int verbal3) {
        if (note1 >= 0 && note1 <= 100) {
            this.course1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            this.course2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            this.course3.note = note3;
        }

        if (verbal1 >= 0 && verbal1 <= 100) {
            this.course1.verbal = verbal1;
        }

        if (verbal2 >= 0 && verbal2 <= 100) {
            this.course2.verbal = verbal2;
        }

        if (verbal3 >= 0 && verbal3 <= 100) {
            this.course3.verbal = verbal3;
        }
    }

    void isPass() {
        this.c1 = (this.course1.note * 0.8 + this.course1.verbal * 0.2);
        this.c2 = (this.course2.note * 0.8 + this.course2.verbal * 0.2);
        this.c3 = (this.course3.note * 0.8 + this.course3.verbal * 0.2);
        this.average = (this.c1 + this.c2 + this.c3) / 3.0;
        if (this.average > 50) {
            System.out.println("Sınıfı geçtiniz");
            isPass = true;
        } else {
            System.out.println("Sınıfta kaldınız.");
            isPass = false;
        }
    }

    void printNote () {
        System.out.println(course1.name + " notu\t: " + (int)this.c1);
        System.out.println(course2.name + " notu\t: " + (int)this.c2);
        System.out.println(course3.name + " notu\t: " + (int)this.c3);
        System.out.println("Ortalamanız: " + this.average);

    }
}
