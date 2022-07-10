package ss2022;
public class Student1 
{
    private String voll_name;
    private String tel_No;
    private String sprache;
    private Adresse1 adresse1=null;
    // Konstrutur1
    public Student1(String a_voll_name, String a_tel_No, String a_sprache)
    {
        voll_name = a_voll_name;
        tel_No = a_tel_No;
        sprache = a_sprache;
    }
    public Student1(Adresse1 a_adresse1, String a_voll_name, String a_tel_No, String a_sprache)
    {
        voll_name = a_voll_name;
        tel_No = a_tel_No;
        sprache = a_sprache;
        adresse1 = a_adresse1;
        
    }
    public String get_voll_name()
    {
        return this.voll_name;
    }
    String getDetails()
    {
        String Tel_Nr = "Telefonnummer";
        String l_add = "have to check if address object exists";
        // to check if a address object exists
        if(adresse1==null)
        {
            l_add = "\n";
        }else
        {
            l_add = "Addresse: "+ adresse1.toString();    
        }
        //Sprachschlüssel ES (ISO-Code für Spanien) soll 
        //der Ausgabetext zur Telefonnummer auf Spanisch erfolgen 
        if(this.sprache.equals("EN"))
        {
            Tel_Nr = "número de teléfono";
        }
        return "Name:\n" + this.voll_name +"\n"
               +Tel_Nr+": "+ tel_No +"\n"
               +l_add;
        
    }
}
