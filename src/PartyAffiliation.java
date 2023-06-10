import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String party = input.nextLine();
        String animal;
        if (party.equalsIgnoreCase("D"))
        {
            animal = "Donkey";
        }
        else if (party.equalsIgnoreCase("R"))
        {
            animal = "Elephant";
        } else if (party.equalsIgnoreCase("I"))
        {
            animal = "Person";
        }
        else
        {
            animal = "Other";
        }
        System.out.println("You get a " + animal + ".");
    }
}