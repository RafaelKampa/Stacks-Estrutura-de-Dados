public class Array {
    public int[] data;

    public Array(int size) {
        this.data = new int[size];
    }

    public void set(int index, int value) {
        this.data[index] = value;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return data.length;
    }

    public int indexOf(int value) {
        for (int i = 0; i <= size(); i++) {
            if (data[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

}
