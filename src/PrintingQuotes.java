import java.util.Scanner;

public class PrintingQuotes {
    public static void main(String[] args){
        System.out.print("What is the quote? ");
        Scanner quote = new Scanner(System.in);
        String quote1 = quote.nextLine();

        System.out.print("Who said it? ");
        Scanner name = new Scanner(System.in);
        String name1 = name.nextLine();

        System.out.printf("%s says, \"%s.\"",name1,quote1);



    }
}
