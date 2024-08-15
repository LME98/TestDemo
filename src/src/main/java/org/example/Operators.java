package org.example;

public class Operators {

        public static void main(String[] args) {


            int num1 = 8, num2 = 3;
            boolean bool1 = true, bool2 = false;
            String str = "Java";


            System.out.println("Arithmetic Operators:");
            int sum = num1 + num2;
            int diff = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + diff);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);


            System.out.println("\nUnary Operators:");
            int negation = -num1;
            int preIncrement = ++num1;
            int postIncrement = num1++;
            int preDecrement = --num2;
            int postDecrement = num2--;
            System.out.println("Negation of num1: " + negation);
            System.out.println("Pre-Increment of num1: " + preIncrement);
            System.out.println("Post-Increment of num1: " + postIncrement);
            System.out.println("Pre-Decrement of num2: " + preDecrement);
            System.out.println("Post-Decrement of num2: " + postDecrement);


            System.out.println("\nAssignment Operators:");
            int value = 10;
            value += 5; // value = value + 5
            System.out.println("value += 5 -> value = " + value);
            value *= 2; // value = value * 2
            System.out.println("value *= 2 -> value = " + value);
            value /= 3; // value = value / 3
            System.out.println("value /= 3 -> value = " + value);


            System.out.println("\nRelational Operators:");
            boolean isEqual = (num1 == num2);
            boolean isNotEqual = (num1 != num2);
            boolean isGreater = (num1 > num2);
            boolean isLesser = (num1 < num2);
            System.out.println("num1 == num2: " + isEqual);
            System.out.println("num1 != num2: " + isNotEqual);
            System.out.println("num1 > num2: " + isGreater);
            System.out.println("num1 < num2: " + isLesser);


            System.out.println("\nLogical Operators:");
            boolean andOperation = bool1 && bool2;
            boolean orOperation = bool1 || bool2;
            boolean notOperation = !bool1;
            System.out.println("bool1 && bool2: " + andOperation);
            System.out.println("bool1 || bool2: " + orOperation);
            System.out.println("!bool1: " + notOperation);

            int bitwise1 = 5;
            int bitwise2 = 2;
            System.out.println("\nBitwise Operators:");
            int andResult = bitwise1 & bitwise2;
            int orResult = bitwise1 | bitwise2;
            int xorResult = bitwise1 ^ bitwise2;
            int notResult = ~bitwise1;
            int leftShift = bitwise1 << 1;
            int rightShift = bitwise1 >> 1;
            System.out.println("bitwise1 & bitwise2: " + andResult);
            System.out.println("bitwise1 | bitwise2: " + orResult);
            System.out.println("bitwise1 ^ bitwise2: " + xorResult);
            System.out.println("~bitwise1: " + notResult);
            System.out.println("bitwise1 << 1: " + leftShift);
            System.out.println("bitwise1 >> 1: " + rightShift);

            int max = (num1 > num2) ? num1 : num2;
            System.out.println("\nTernary Operator:");
            System.out.println("Maximum of num1 and num2: " + max);

            System.out.println("\nInstanceof Operator:");
            boolean isString = str instanceof String;
            System.out.println("Is str an instance of String? " + isString);

            int result = 7;
            System.out.println("\nCompound Assignment Operators:");
            result %= 2; // result = result % 2
            System.out.println("result %= 2 -> result = " + result);
            result += 5; // result = result + 5
            System.out.println("result += 5 -> result = " + result);

            boolean isPositive = (num1 > 0);
            System.out.println("\nConditional Operators:");
            System.out.println("Is num1 positive? " + isPositive);
        }
}
