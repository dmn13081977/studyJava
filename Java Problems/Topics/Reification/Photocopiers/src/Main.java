/**
 * Class to work with
 */
class Multiplicator {

	public static <T extends Copy<T>> Folder<T>[] multiply(Folder<T> folder, int arraySize) {
        Folder<T>[] arr = new Folder[arraySize];

        for (int i = 0; i < arr.length; i++) {
            Folder<T> newFolder = new Folder<>();
            newFolder.put(folder.get().copy());
            arr[i] = newFolder;
        }

        return arr;
	}

}

// Don't change the code below
interface Copy<T> {
	T copy();
}

class Folder<T> {

    private T item;

    public void put(T item) {
    	this.item = item;
    }

    public T get() {
        return this.item;
    }
}