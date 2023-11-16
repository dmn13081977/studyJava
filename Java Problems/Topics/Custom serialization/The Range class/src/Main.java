import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
    Represents inclusive integer range.
*/
class Range implements Serializable {

	private static final long serialVersionUID = 1L;

	private final int from;

	private final int to;


	private void readObject(ObjectInputStream ois) throws IllegalArgumentException, IOException, ClassNotFoundException {
		ois.defaultReadObject();
		if (from > to) throw new IllegalArgumentException("Start is greater than end");

	}

	public Range(int from, int to) {
		if (from > to) {
			throw new IllegalArgumentException("Start is greater than end");
		}
		this.from = from;
		this.to = to;
	}

	public int getFrom() {
		return from;
	}

	public int getTo() {
		return to;
	}

}