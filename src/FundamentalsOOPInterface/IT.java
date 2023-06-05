package FundamentalsOOPInterface;

public class IT extends Officer {
    private String task;

    public IT(String nameSurname, String phoneNumber, String email, String department, String shift, String task) {
        super(nameSurname, phoneNumber, email,department, shift);
        this.task = task;
    }

    public String getTask() {
        return this.task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void networkSetup() {
        System.out.println(this.getNameSurname() + " kurulum yapıyor");
    }
}
