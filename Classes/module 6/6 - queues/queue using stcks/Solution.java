public static class UserQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public UserQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int X) {
        stack1.push(X);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}public static class UserQueue {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public UserQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int X) {
        stack1.push(X);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}