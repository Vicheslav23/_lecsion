import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        // Написать программу, принимающую с клавиатуры слово, состоящее из не повторяющихся
        // заглавных или прописных (больших или маленьких) букв и принимающую затем также с клавиатуры
        // одну из букв этого слова.
        // Программа заменяет эту букву в строке на звездочку и все буквы на прописные(маленькие) и
        // выводит результат на экран

        Scanner scanner = new Scanner(System.in);
             System.out.println("Enter a word ");
             String str = scanner.nextLine();
             System.out.println("you entered "+str);

            System.out.println("Enter one of the word letters ");

           char change = scanner.nextLine().toLowerCase().charAt(0);
             char changeCh = (char)System.in.read();
             int index = str.toLowerCase().indexOf(change);

             String resultReplace = (str.substring(0,index)+'*'+str.substring(index+1)).toLowerCase();
             System.out.println(resultReplace);











        //System.out.println("Hello world!");
    }
}