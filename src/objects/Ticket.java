package objects;



public record Ticket(String PassengerName, int id){
    public Ticket{
        System.out.println("Билет №: "+id+" Пассажир: "+PassengerName);
    }
}