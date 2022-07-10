package ss2022;
public class Ticketmachine
{
    private int ticketPrice;
    private int alreadyPaid;
    private int totalSum;

    public Ticketmachine(int l_ticketPrice, int l_alreadyPaid,int l_totalSum)
    {
            ticketPrice = l_ticketPrice;
            alreadyPaid = l_alreadyPaid;
            totalSum    = l_totalSum;
    }
    public int get_ticketPrice()
    {
        return ticketPrice;
    }
    public int get_alreadyPaid()
    {
        return alreadyPaid;
    }
    // getter: Attribute totalSum
    public int get_totalSum()
    {
        return totalSum;
    }
    public void setTicketPrice(int tkp)
    {
        this.ticketPrice = tkp;
    }
    public Ticketmachine(Ticketmachine tkm)
    {
        this(tkm.get_ticketPrice(),tkm.get_alreadyPaid(),tkm.get_totalSum());
    }
    public String toString()
    {
        return "Ticketmachine:" +"\n"
        + "TicketPrice: " + this.get_ticketPrice()+"\n"
        + "AlreadyPaid: " + this.get_alreadyPaid()+"\n"
        + "TotalSum: " + this.get_totalSum();
    }
}