import java.io.*;

class TextEditor
{
    public static void main(String args[]) throws IOException
    {
        FileWriter fw = new FileWriter("text.txt");

        fw.write("Welcome to Java Programming.");
        fw.close();

        System.out.println("Content written successfully.");

        FileReader fr = new FileReader("text.txt");

        int ch;
        System.out.println("\nFile Content:");

        while((ch = fr.read()) != -1)
        {
            System.out.print((char)ch);
        }

        fr.close();
    }
}