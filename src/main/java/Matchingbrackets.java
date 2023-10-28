import java.util.Stack;

public class Matchingbrackets {

    public static boolean balancedParenthesis(String inputStr) {

        // create an empty stack
        Stack stack = new Stack();

        // convert inputStr to char array
        char[] charArray = inputStr.toCharArray();

        // iterate charArray
        for (char current : charArray) {

            // get char
            //check whether current is '(', '[' or '{'
            if (current == '{' || current == '[' || current == '(') {
                // push current to stack
                stack.push(current);
                continue;
            }
            // if stack is empty, return false
            if (stack.isEmpty()) {
                return false;
            }

            // use switch statement to pop element from stack and if it is '(', '[' or '{', return false
            char popChar;
            switch (current) {
                case ')':
                    popChar = (char) stack.pop();
                    if (popChar == '{' || popChar == '[')
                        return false;
                    break;
                case '}':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '[')
                        return false;
                    break;
                case ']':
                    popChar = (char) stack.pop();
                    if (popChar == '(' || popChar == '{')
                        return false;
                    break;
                default:
                    return false;
            }
        }
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        String inputStr = "[[{]]";
        boolean matching = balancedParenthesis(inputStr);
        if (matching)
            System.out.println("Input string "+inputStr+" is balanced.");
        else
            System.out.println("Input string "+inputStr+" is not balanced.");

    }


}
