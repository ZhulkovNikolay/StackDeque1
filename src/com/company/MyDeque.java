public class MyDeque {

    private int size;
    private int head;
    private int tail;
    private int[] deque;

    public MyDeque(int size) {
        this.size = size;
        deque = new int[this.size];
    }

    public void insertLeft(int value) {
        if (++tail == size)
            tail = 0;
        deque[tail] = value;
    }

    public int removeLeft() {
        int deleted = deque[tail];
        if (--tail < 0)
            tail = size - 1;
        return deleted;
    }

    public void insertRight(int value) {
        deque[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    public int removeRight() {
        if (++head == size)
            head = 0;
        return deque[head];
    }

    public boolean isEmpty() {
        return head == tail;
    }

}
