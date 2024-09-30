package Java.valid_parenthesis;

import java.util.Stack;

class ValidParenthesis {
    static boolean isValid(String str) {
        int n = str.length();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char currentChar = str.charAt(i);

            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(str.charAt(i));
            } else if (currentChar == ')' || currentChar == '}' || currentChar == ']') {
                if (stack.isEmpty()) {
                    return false;
                }

                char topChar = stack.pop();
                if ((currentChar == ')' && topChar != '(') || (currentChar == '}' && topChar != '{')
                        || (currentChar == ']' && topChar != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[{}";
        boolean result = isValid(str);

        System.out.println(result);
    }
}