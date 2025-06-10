package TugasFinalDanStatic;

public class TestCounter { // Tugas 3
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total objek Counter dibuat: " + Counter.getInstanceCount());
    }
}
