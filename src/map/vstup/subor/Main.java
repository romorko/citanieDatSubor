package map.vstup.subor;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //bufrovaný vstup, výrazne urýchli načítanie dát. Používať vtedy, ak je rýchlosť dôležitá resp. je dát veľmi veľa.
        BufferedReader br = null;
        try
        {
            br = new BufferedReader(new FileReader("data.in"));
            //bufrovaný vstup načítava celý riadok ako reťazec, ak potrebujem jednotlivé slová, musím reťazec na ne rozdeliť
            //napr. pomocou split a určeného oddeľovača
            String riadok;
            while ((riadok = br.readLine()) != null)
            {
                System.out.println(riadok);
                String []slova=riadok.split(" ");
                for(String slovo:slova)
                {
                    System.out.println(slovo);
                }
            }
            //v prípade, ak sa pokúšate načítať zo súboru čísla, stále ich dostanete ako reťazec. Preto ich nezabudnite pred
            //použitím previesť na čísla! Použite napr. Integer.parseInt(). Implementáciu nechám na vás :-)
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Subor sa nepodarilo otvorit!");
        }
        catch (IOException e)
        {
            System.out.println("Chyba pri citani dat!");
        }
        finally
        {
            try
            {
                //uzatváranie súboru má zmysel len vtedy, ak sa ho podarilo otvoriť
                if (br != null)
                {
                    br.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Chyba pri uzatvarani suboru!");
            }
        }

        //filereader načítava zo súboru po znaku bez bufrovania. Vracia nám bajtovú hodnotu (t.j. číslo), preto ho musíme
        //pretypovať na znak
        FileReader fr = null;
        try
        {
            fr = new FileReader("data.in");
            int i;
            while ((i=fr.read()) != -1)
            {
                System.out.print((char) i);
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
        finally
        {
            try
            {
                if (fr != null)
                {
                    fr.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("Chyba pri uzatvarani suboru!");
            }
        }


        //scaner je jediný spôsob načítavania dát, pri ktorom ihneď prebieha parsovanie na jednotlivé typy dát
        //má to však aj vedľajší dôsledok: jeho použitie je pomalé a preto sa nehodí tam, kde potrebujeme načítať veľké
        //množstvo nástrojov a kde záleží na rýchlosti načítania. V nasledujúcom príklade načítavam celé riadky ako reťazce
        //ak by ste chceli načítavať napr. čísla, použili by ste sc.nextInt(). Implementáciu nechám na vás...
        Scanner sc=null;
        {
            try
            {
                sc = new Scanner(new FileReader("data.in"));
                String veta;
                while (sc.hasNextLine())
                {
                    veta=sc.nextLine();
                    System.out.println(veta);
                }
            }
            catch (FileNotFoundException e)
            {
                System.out.println("Subor sa nepodarilo otvorit!");
            }
            finally
            {
                if (sc != null)
                {
                    sc.close();
                }
            }
        }
    }
}





