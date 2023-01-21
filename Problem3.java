import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        String[][] arr ={ {"Kenya",  "Nairobi"}, {"Rwanda", "Kigali"},
            {"Gambia", "Banjul"},  {"Ghana",  "Accra"},
            {"Niger",  "Niamey"},  {"Zambia", "Lusaka"} };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name of Country: ");
        String country = scanner.nextLine();

        boolean found = false;

        for (String[] pair : arr){
            if (pair[0].equalsIgnoreCase(country)){
                System.out.println("The capital of "+ pair[0] + "is " + pair[1]);
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Country not found in the list");
        }

    }
}
