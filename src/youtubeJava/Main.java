package youtubeJava;



import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean shouldContinue = true;

        Party party=new Party();
      while (shouldContinue){
          System.out.println("wybierz opcję");
          System.out.println("1 Wyświetl gości");
          System.out.println("2 Dodaj gościa");
          System.out.println("3 Wyświetl potrawy");
          System.out.println("4 Wybierz po numerze telefonu");
          System.out.println("5 Wyjście");

          int userChoise = scanner.nextInt();


          switch(userChoise){
              case 1:
                  party.displayGuests();
                  break;
              case 2:{
                  party.addGuests();
                  break;}
              case 3:
                  party.displayMeals();
                  break;
              case 4:
                  party.displayGuestForPhoneNumber();
                  break;
              case 5:
                  shouldContinue=false;

          }
      }






























    }
}