public class Main {

    // Создать программу, которая переворачивает вводимые строки (читает справа налево)
    //
    // Создать класс для реализации дека.
    public static void main(String[] args) {
        String hello = "Hello world!";
        MyStack stack = new MyStack(hello.length());

        for (Character character : hello.toCharArray()) {
            stack.push(character);
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());
    }
}
