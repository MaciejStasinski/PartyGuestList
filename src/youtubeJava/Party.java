package youtubeJava;

import java.util.*;

public class Party {
     Scanner scanner=new Scanner(System.in);
    private List<Guest> guests= new ArrayList<>();
    private Set<String> meals=new HashSet<>();
    private Map<Integer, Guest> phoneToGuest = new HashMap<>();

    public void addGuests(){
        System.out.println("Wprowadź imię gościa: ");
        String name = scanner.nextLine();

        System.out.println("Podaj preferowany posiłek");
        String meal=scanner.nextLine();

        System.out.println("podaj numer telefonu: ");
        int phoneNumber=Integer.valueOf(scanner.nextLine());

        System.out.println("czy jest veganinem? (Y/N) ");
        String VeganString =scanner.nextLine();

        boolean isVegan;
        if (VeganString.equals("Y"))
            isVegan = true;
        else
            isVegan = false;
        Guest guest = new Guest(name, meal, phoneNumber, isVegan);
        meals.add(meal);
        phoneToGuest.put(phoneNumber,guest);
        guests.add(guest);
    }
    public void displayMeals(){
        for (String meal:meals) {
            System.out.println(meal);
        }
    }

    public void displayGuestForPhoneNumber(){
        System.out.println("wprowadź numer telefonu: ");
        Integer phoneNumber= Integer.valueOf(scanner.nextLine());
        Guest guest=phoneToGuest.get(phoneNumber);
        guest.displayGuestInformation();
    }
    public void displayGuests(){
        for (Guest guest: guests) {
            guest.displayGuestInformation();
            System.out.println();
        }

    }
}
