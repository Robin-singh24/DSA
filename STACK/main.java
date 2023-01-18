package STACK;

public class main {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new DynamicStack(5);

        stack.push(2);
        stack.push(12);
        stack.push(22);
        stack.push(32);
        stack.push(42);
        stack.push(52);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
