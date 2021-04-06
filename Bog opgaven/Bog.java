//Skriv enklasse kaldet Bog, der indeholderISBN-nummer,titelog udgivelsesår
public class Bog {
    private int isbNummer;
    private String titel;
    private int udgivelsesår;

    public Bog(int isbNummer, String titel, int udgivelsesår){
        this.isbNummer = isbNummer;
        this.titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public int getIsbNummer() {
        return isbNummer;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }
}

