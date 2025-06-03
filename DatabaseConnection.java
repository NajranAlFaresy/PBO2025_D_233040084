package TugasFinalDanStatic;

public class DatabaseConnection { // Tugas 4 
    public static String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb";
        System.out.println("Static block: Connection string telah diinisialisasi.");
    }
}
