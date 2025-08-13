package $01_DataTypes_Variable_Input;

class EscapeSequences {
    public static void main(String[] args) {

        // ----- Common Escape Sequences -----
        System.out.println("Hello\nWorld");      // \n → New line
        System.out.println("Hello\tWorld");      // \t → Tab space
        System.out.println("This is a \"quote\""); // \" → Double quote
        System.out.println("It\'s Java!");       // \' → Single quote
        System.out.println("Backslash: \\");     // \\ → Backslash

        // ----- Special Escape Sequences -----
        System.out.println("Carriage return:\rHello World"); // \r → Moves cursor to line start
        System.out.println("Backspace: ABC\bD"); // \b → Deletes previous character

        // ----- Unicode Escape -----
        System.out.println("Unicode for A: \u0041"); // Prints A
        System.out.println("Unicode heart: \u2665"); // ♥ symbol

        // ----- Combining escape sequences -----
        System.out.println("List:\n\t1. Apple\n\t2. Banana\n\t3. Cherry");
    }
}

/*
📌 Java Escape Sequences:
--------------------------------
\n   - New line
\t   - Tab
\"   - Double quote
\'   - Single quote
\\   - Backslash
\r   - Carriage return
\b   - Backspace
\f   - Form feed (used in printers)
\UXXXX - Unicode character
*/

