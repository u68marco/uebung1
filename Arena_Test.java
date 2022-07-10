package ss2022;

public class Arena_Test {
    public static void main(String[] args)
    {
        Ticketmachine tkm1 = new Ticketmachine(50,200, 2000);
        Arena arena1 = new Arena(tkm1.get_ticketPrice());

        Arena arena2 = new Arena(tkm1.get_ticketPrice(),20000);

        Arena arena3 = new Arena(tkm1.get_ticketPrice(),20000,5000);

        // Test Method assignTicketMachine() and print the ticketmachine fields.
        arena3.assignTicketMachine(tkm1);
        System.out.println("the TicketMachine object that assigned to class Arena object arena3 has the Info:");
        System.out.println(arena3.getTicketmachine().toString());
        System.out.println(" ");
        System.out.println("Classe Object Arena.arena3: ");
        System.out.println(arena3.toString());

         // copy the object arena3 to a new object arena4
        Arena arena4 = new Arena(arena3);
        System.out.println(" ");
        System.out.println("Classe Object Arena.arena4(Copy of Arena.arena3): ");
        System.out.println(arena4.toString());

        //change the ticketprice of the copie object arena4. 
        arena4.getTicketmachine().setTicketPrice(888);
        // check it with the original object arena 3
        System.out.println("Class Object Arena.arena3 after the Copie Object arena4 changed field Ticketprice: ");
        System.out.println(arena3.toString());
        System.out.println(" ");
        System.out.println("Classe Object Arena.arena4 after changing field Ticketprice:");
        System.out.println(arena4.toString());

    }
}
