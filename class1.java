import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

public class class1 {
        public static void main(String[] args) {

        try{

            FileReader fr=new FileReader("file.txt");

            FileWriter fw=new FileWriter("file2.txt");
            String s="";
            int n;
            while((n=fr.read()) != -1)
            {
                s+=(char)n;
            }
            System.out.println(s);

            fw.write(s);

            fr.close();

            fw.close();

            System.out.println("Both file reading & writting is completed");

        }

        catch(IOException e)

        {

            System.out.println("Exception occured");

        }

    }

}