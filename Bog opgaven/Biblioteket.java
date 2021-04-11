import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteket {
   private Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Bog> bogListe = new ArrayList<Bog>();

        Bog bog1 = new Bog(12768381, "Gitte1", 1999);
        Bog bog2 = new Bog(420, "Gitte2", 1879);
        Bog bog3 = new Bog(81, "Gitte 3", 199);

        bogListe.add(bog1);
        bogListe.add(bog2);
        bogListe.add(bog3);
    }
    public boolean erBogenHer(){
        boolean status;
        int søgeNummer = sc.nextInt();
            if (søgeNummer == Bog){
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }
}
