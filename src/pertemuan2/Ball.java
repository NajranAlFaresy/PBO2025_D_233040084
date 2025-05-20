package pertemuan2;

public class Ball {
    private String color;
    private int size;
    private boolean moveStatus;

    // Constructor for the Ball class
    public Ball(String color, int size, boolean moveStatus) {
        this.color = color;
        this.setSize(size);
        this.setMoveStatus(moveStatus);
    }

    // Getter method for color
    public String getColor() {
        return color;
    }

	public boolean isMoveStatus() {
		return moveStatus;
	}

	public void setMoveStatus(boolean moveStatus) {
		this.moveStatus = moveStatus;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}