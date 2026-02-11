## Part D: Balanced Parentheses Using Stack (Java)

```java
import java.util.Stack;
import java.util.Scanner;

public class BalancedParentheses {

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();

        if (isBalanced(expr))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
```

## Program Output Screenshot

![Balanced Parentheses Output](./BalancedParanthesis.png)
