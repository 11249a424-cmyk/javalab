class StringOperations {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Character at index 5: " + str.charAt(5));
        System.out.println("Substring (5 to end): " + str.substring(5));
        System.out.println("Contains 'Program': " + str.contains("Program"));
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Index of 'P': " + str.indexOf('P'));

        String str2 = " Language";
        System.out.println("Concatenation: " + str.concat(str2));

        // Reverse the string
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reversed String: " + reverse);
    }
}