import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

// Level - Medium
// Problem 150 - Evaluate Reverse Polish Notation 
public class Problem150 {
    public int evalRPN(String[] tokens) {

        Set operators = new HashSet<>(Arrays.asList("+", "-", "*", "/"));

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (operators.contains(token)) {
                int secondNum = stack.pop();
                int firstNum = stack.pop();
                int result;

                if (token.equals("+")) {
                    result = firstNum + secondNum;
                } else if (token.equals("-")) {
                    result = firstNum - secondNum;
                } else if (token.equals("*")) {
                    result = firstNum * secondNum;
                } else {
                    result = firstNum / secondNum;
                }
                stack.push(result);
            } else {
                int num = Integer.parseInt(token);
                stack.push(num);
            }
        }

        return stack.pop();
    }
}
