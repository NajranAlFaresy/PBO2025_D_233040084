package pertemuan2;

import pertemuan2.Ball;

public class mainBall {
    public static void main(String[] args) {
        String color = "red";
        int size = 10;
        boolean moveStatus = true;

        Ball myball = new Ball(color, size, moveStatus);

        System.out.println(myball.getColor());
    }
}