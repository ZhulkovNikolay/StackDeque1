class MyStack {
    private int maxSize;
    private char[] stack;
    private int top; //вершина стека.

    public MyStack(int size) {
        this.maxSize = size;
        this.stack = new char[this.maxSize];
        this.top = -1;
    }

    //Каждый новый элемент добавляют в конец стека
    public void push(char i) {
        this.stack[++this.top] = i;
    }

    //Он удаляет элемент из стека, который находится в позиции top
    public char pop() {
        return this.stack[this.top--];
    }

    //Для получения элемента стека, который находится в позиции top
    public int peek() {
        return this.stack[this.top];
    }

    public boolean isEmpty() {
        return (this.top == -1);
    }

//    public boolean isFull() {
//        return (this.top == this.maxSize - 1);
//    }
}
