package TugasFinalDanStatic;

public class Counter { // tugas 3
	    private static int instanceCount = 0;

	    public Counter() {
	        instanceCount++;
	    }

	    public static int getInstanceCount() {
	        return instanceCount;
	    }
}
