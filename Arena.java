package ss2022;
/**
 *@Class Arena
 *@author Sof 
 *@version 1.0
 *@Date: 01.04.2022 
 */
public class Arena {
    private int ticketPrice;
    private int numberSeats;
    private int numberSeatsCL;
    private Ticketmachine ticketmachine=null;
    
    public Arena(int l_ticketPrice)
    {
        ticketPrice = l_ticketPrice;
    }
    public Arena(int l_ticketPrice,int l_numberSeate)
    {
        ticketPrice = l_ticketPrice;
        numberSeats = l_numberSeate;
    }
    public Arena(int l_ticketPrice,int l_numberSeate,int l_numberSeatsCL)
    {
        ticketPrice = l_ticketPrice;
        numberSeats = l_numberSeate;
        numberSeatsCL = l_numberSeatsCL;
    }

    public int getNumberSeats()
    {
        return numberSeats;
    }
    public int getNumberSeatsCL()
    {
        return numberSeatsCL;
    }
    public Ticketmachine getTicketmachine()
    {
        return ticketmachine;
    }
    
    // Kopierkonstruktor für die Klasse Arena, 
    //der eine tiefe Kopie eines Datenelements mit Datentyp Ticketmachine durchführt.
    public Arena(Arena that)
    {
        this.ticketPrice = that.getTicketmachine().get_ticketPrice();
        this.numberSeats = that.getNumberSeats();
        this.numberSeatsCL = that.getNumberSeatsCL();
        this.ticketmachine = new Ticketmachine(that.getTicketmachine()); // Deep Copying 
    }
    public void assignTicketMachine(Ticketmachine ticketmachine)
    {
        if(this.getTicketmachine()==null)
           this.ticketmachine = ticketmachine;
    }
   public String toString()
   {
       return "Arena Info: " + "\n" 
              + "Ticketprice: " + this.getTicketmachine().get_ticketPrice() + "\n"
              + "NumberSeats: " + this.getNumberSeats() + "\n"
              + "NumberSeatsCL: " + this.getNumberSeatsCL() + "\n";

   }
}
