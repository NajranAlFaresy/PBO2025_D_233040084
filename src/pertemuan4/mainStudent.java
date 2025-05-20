package pertemuan4;

public class mainStudent {
    public static void main(String[] args) {
        Student x = new Student ();
        Student y = x;

        x.setNrp("01");
        y.setNrp("02");

        System.out.println(x.getNrp());

        Student z = new student();

        z.setNrp("03");

        System.out.println(x.getNrp());
        System.out.println(y.getNrp());
    }
}