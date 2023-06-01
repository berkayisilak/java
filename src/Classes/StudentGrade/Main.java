package Classes.StudentGrade;

public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Berk", "55555", "FZK");
        Teacher teacher2 = new Teacher("Berkay", "88888888", "MAT");
        Teacher teacher3 = new Teacher("Berker", "333", "TRH");
        Course tarih = new Course("Tarih", "101", "TRH",teacher3);
        tarih.addTeacher(teacher3);
        Course fizik = new Course("Fizik", "101", "FZK", teacher1);
        fizik.addTeacher(teacher1);
        Course matematik = new Course("Matematik", "101", "MAT", teacher2);
        matematik.addTeacher(teacher2);
        Course fizik2 = new Course("Fizik", "102", "FZK", teacher1);
        fizik2.addTeacher(teacher1);

        Student student1 = new Student("Ahmet", "1234", "7", fizik, matematik, tarih);
        student1.addBulkExamNote(60,60,60,90,90,90);
        student1.isPass();
        student1.printNote();
    }
}
