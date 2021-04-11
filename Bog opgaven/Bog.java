//Skriv enklasse kaldet Bog, der indeholderISBN-nummer,titelog udgivelsesår
public class Bog {
    private final int isbNummer;
    private final String titel;
    private final int udgivelsesr;

    public Bog(int isbNummer, String titel, int udgivelsesr){
        this.isbNummer = isbNummer;
        this.titel = titel;
        this.udgivelsesr = udgivelsesr;
    }
    public int getIsbNummer() {
        return isbNummer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesr() {
        return udgivelsesr;
    }
    public String toString() {
        return isbNummer + " " + titel + " " + udgivelsesr;
    }
}

