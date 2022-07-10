package ss2022;
public class Adresse1 {
    private String strasse;
    private String hausnummer;
    private int postleitzahl;
    private String ort;

    //default Constructor
    public Adresse1(){};
    public Adresse1(String a_str, String a_hsn, int a_plz, String a_ort)
    {
         strasse = a_str;
         hausnummer = a_hsn;
         postleitzahl = a_plz;
         ort = a_ort;
    }
    public String toString()
    {
        return strasse + " " + hausnummer +" "+ postleitzahl + " "+ ort; 
    }

    public String getStrasse()
    {
        return strasse;
    }
    public String getHausnummer()
    {
        return hausnummer;
    }
    public int getPostleitzahl()
    {
        return postleitzahl;
    }
    public String getOrt()
    {
        return ort;
    }
}