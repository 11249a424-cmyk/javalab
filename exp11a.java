import java.io.*;

class FitnessApp
{
    public static void main(String args[]) throws IOException
    {
        FileOutputStream fout = new FileOutputStream("profile.txt");

        String data = "Name: Yogitha\nAge: 20\nWeight: 55 kg";

        fout.write(data.getBytes());
        fout.close();

        System.out.println("Profile data written successfully.");

        FileInputStream fin = new FileInputStream("profile.txt");

        int ch;
        System.out.println("\nUser Profile Data:");

        while((ch = fin.read()) != -1)
        {
            System.out.print((char)ch);
        }

        fin.close();
    }
}