package org.example;

public class String_Methods {

        public static void main(String[] args) {

            String str1 = "Java Programming";
            String str2 = "java programming";
            String str3 = "   Welcome to Java   ";
            String str4 = "Hello,Java,World";

            System.out.println("Length of str1: " + str1.length());

            System.out.println("Is str1 empty?: " + str1.isEmpty());

            System.out.println("Character at index 5 in str1: " + str1.charAt(5));

            System.out.println("Substring from index 5 in str1: " + str1.substring(5));

            System.out.println("Substring from index 0 to 4 in str1: " + str1.substring(0, 4));

            System.out.println("Does str1 contain 'Java'?: " + str1.contains("Java"));

            System.out.println("Is str1 equal to str2?: " + str1.equals(str2));

            System.out.println("Is str1 equal to str2 (ignore case)?: " + str1.equalsIgnoreCase(str2));

            System.out.println("Comparing str1 to str2: " + str1.compareTo(str2));

            System.out.println("Comparing str1 to str2 (ignore case): " + str1.compareToIgnoreCase(str2));

            System.out.println("Does str1 start with 'Java'?: " + str1.startsWith("Java"));

            System.out.println("Does str1 end with 'ing'?: " + str1.endsWith("ing"));

            System.out.println("First occurrence of 'a' in str1: " + str1.indexOf('a'));

            System.out.println("Last occurrence of 'a' in str1: " + str1.lastIndexOf('a'));

            System.out.println("str1 in lowercase: " + str1.toLowerCase());

            System.out.println("str1 in uppercase: " + str1.toUpperCase());

            System.out.println("Trimmed str3: '" + str3.trim() + "'");

            System.out.println("str1 after replacing 'a' with 'o': " + str1.replace('a', 'o'));

            System.out.println("str1 after replacing 'Java' with 'Python': " + str1.replace("Java", "Python"));

            String[] splitArray = str4.split(",");
            System.out.println("str4 split by ',': " + java.util.Arrays.toString(splitArray));

            char[] charArray = str1.toCharArray();
            System.out.println("str1 as character array: " + java.util.Arrays.toString(charArray));

            String intAsString = String.valueOf(42);
            System.out.println("Integer 42 as String: " + intAsString);

            String formattedString = String.format("I have %d apples and %d oranges.", 5, 10);
            System.out.println("Formatted string: " + formattedString);

            String joinedString = String.join(", ", "Java", "Python", "C++");
            System.out.println("Joined string: " + joinedString);

            boolean matches = str1.matches("Java.*");
            System.out.println("Does str1 match 'Java.*'?: " + matches);

            String internedString = str1.intern();
            System.out.println("Interned string of str1: " + internedString);

            String concatenatedString = str1.concat(" is awesome!");
            System.out.println("Concatenated string: " + concatenatedString);
        }
}
