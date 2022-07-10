package ss2022;
import java.util.*;
public class Uebung1
{
   public static void main(String[] args) {
       Adresse1 adr1 = new Adresse1("Carrier d' Aristides Maillol", "23", 8082, "Barcelona,​​ España");
       Student4 std1 = new Student4(adr1, "Marc-Andre ter Stegen", "902189900", "EN");
       Student4 std2 = new Student4("Franz, kaiser und Lichtgestalt", "1234", "DE");
       
       System.out.println("Student 1:");
       System.out.println(std1.getDetails());

        //Geben Sie 
        //danach die Bestandteile der Studentendaten 
        //über ein Objekt der Klasse StringTokenizer einzeln aus.
       StringTokenizer st = new StringTokenizer(std1.getDetails()," ");  
       while (st.hasMoreTokens()) {  
         System.out.println(st.nextToken());  
     }  

       System.out.println("");
       System.out.println("Student 2:");
       System.out.println(std2.getDetails());

       // format() Aufruf
       String format = String.format("Hello, %s!", std2.get_voll_name());
       System.out.println(format);

   }
}