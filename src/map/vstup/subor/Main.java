package map.vstup.subor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main
{

    public static void main(String[] args)
    {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("data.in"));
            String st;
            while ((st = br.readLine()) != null)
            {
                System.out.println(st);
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nepodarilo otvorit!");
        }
        catch (IOException e)
        {
            System.out.println("Chyba pri citani dat!");
        }

    }
}

