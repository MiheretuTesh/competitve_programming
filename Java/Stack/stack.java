package Java.Stack;

class Stack {
    int top;
    int arr[];
    int size;

    Stack(int size) {
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = value;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.pop();
        s.peek();
    }
}