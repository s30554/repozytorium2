import java.util.Scanner;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        double ticket=obliczCene();
       // double discount=rabat(ticket);
        informaje (ticket);}
    public static double obliczCene(){
        double ticket=40;

        System.out.println("Podaj swoj wiek");
        Scanner scanner=new Scanner(System.in);
        int wiek= scanner.nextInt();

        if (wiek<10){
            ticket=ticket*0;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        else if (wiek>=10&& wiek<=18){
            ticket=ticket/2;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        System.out.println("Podaj miasto,w ktorym mieszkasz");
        String nazwaMiasta=scanner.next();
        if (nazwaMiasta.equals("Warszawa")){
            ticket=ticket*0.9;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        if (jakiDzienTygodnia().equals("Thursday")){
            ticket=ticket*0;
            System.out.println(ticket);
        }
        return ticket;
    }
    public static String jakiDzienTygodnia(){
        String dayOfWeek=LocalDate.now().getDayOfWeek().name();

        return dayOfWeek;
    }
    public static double rabat(double ticket){
        double discount= ticket*2.5;
        return discount;
    }
    public static void informaje(double ticket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int wiek = scanner.nextInt();
        System.out.println("Podaj miasto, w którym mieszkasz");
        String nazwaMiasta = scanner.next();


        System.out.println("Data: " + nazwaMiasta + ", " + wiek + " years old, " + "weekday Ticket price: " + ticket + " PLN");

        double discount = ticket * 2.5;
        System.out.println("Discount: " + discount + " %");
    }}
