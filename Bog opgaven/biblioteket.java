import java.util.Scanner;

public class biblioteket {
    public Bog createBog(){
        Scanner in = new Scanner(System.in);
        System.out.println("Skriv isbNummeret , titel og udgivelsesdatoen for den bog du gerne vil søge efter");

        int isbNummeret = in.nextInt();
        String titel = in.next();
        int udgivelsesdato = in.nextInt();

        return new Bog (isbNummeret, titel, udgivelsesdato);
    }
}
