package medium;

import java.util.*;

public class Ex25_JavaStack {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            Stack<Character> charStack = new Stack<>();
            Map<Character, Character> charMap = new HashMap<Character, Character>() {{
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }};

            Boolean hasProblem = false;

            String input=sc.next();

            for (char currentChar: input.trim().toCharArray()) {
                if (charMap.containsKey(currentChar)) {
                    charStack.push(currentChar);
                } else if (charMap.containsValue(currentChar)) {
                    if (charStack.isEmpty() || currentChar != charMap.get(charStack.pop())) {
                        hasProblem = true;
                        break;
                    }
                }
            }

            if (hasProblem) {
                System.out.println("false");
            } else if (charStack.isEmpty()) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }

    }
}
