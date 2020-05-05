import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args) {
        String restriction;
        String allUpperCaseRestriction;

        Scanner in = new Scanner(System.in);
        ArrayList<Bakery> bradList = new ArrayList<>();
        ArrayList<Bakery> customerList = new ArrayList<>();


        Bakery bread1 = new Bakery("Mult-Grain White Bread", 1, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread1);
        customerList.add(bread1);
        Bakery bread2 = new Bakery("Banana Bread", 2, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread2);
        customerList.add(bread2);
        Bakery bread3 = new Bakery("6-Pack of Muffins", 3, "jun-4-2020","GLUTEN , EGG , SOY", 100);
        bradList.add(bread3);
        customerList.add(bread3);
        Bakery bread4 = new Bakery("Gluten free dinner Rools", 4, "jun-4-2020","GLUTEN , SOY,", 100);
        bradList.add(bread4);
        customerList.add(bread4);
        Bakery bread5 = new Bakery("Best breads box", 5, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread5);
        customerList.add(bread5);
        Bakery bread6 = new Bakery("Cinnamon bread", 6, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread6);
        customerList.add(bread6);
        Bakery bread7 = new Bakery("Soft pizza Crust", 7, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread7);
        customerList.add(bread7);
        Bakery bread8 = new Bakery("Savory Rolls", 8, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread8);
        customerList.add(bread8);
        Bakery bread9 = new Bakery("Large hamburger buns", 9, "jun-4-2020","GLUTEN , SOY", 100);
        bradList.add(bread9);
        customerList.add(bread9);
        Bakery bread10 = new Bakery("Spring happy set", 10, "jun-4-2020","GLUTEN" , 100);
        bradList.add(bread10);
        customerList.add(bread10);
        Bakery bread11 = new Bakery("Cinnamon Raisin bread", 11, "jun-4-2020","GLUTEN" , 100);
        bradList.add(bread11);
        customerList.add(bread11);
        Bakery bread12 = new Bakery("Dozen savory empanadas", 12, "jun-4-2020","EGG , DAIRY" , 100);
        bradList.add(bread12);
        customerList.add(bread12);
        Bakery bread13 = new Bakery("Bread pudding", 13, "jun-4-2020","GLUTEN , DAIRY" , 100);
        bradList.add(bread13);
        customerList.add(bread13);
        Bakery bread14 = new Bakery("Udi's Gluten free sandwich", 14, "jun-4-2020","GLUTEN" , 100);
        bradList.add(bread14);
        customerList.add(bread14);
        Bakery bread15 = new Bakery("Artisan Style Gluten Free Bread", 15, "jun-4-2020"," " , 100);
        bradList.add(bread15);
        customerList.add(bread15);

        System.out.println("Welcome to Brookley's Better Bakery App!");
        System.out.println("We contain peanut, gluten, soy and dairy in our products.");

        System.out.print("To search for foods that you can eat,\n please enter the name of the diet restriction GLUTEN, DAIRY, SOY, PEANUT, EGG or NONE: ");
        restriction = in.nextLine();
        restriction = restriction.toUpperCase();



        while (!(restriction.equalsIgnoreCase("NONE"))){
            for (Bakery bread : bradList) {
                if(bread.getDietRestrictions().contains(restriction)){
                    customerList.remove(bread);
                }
            }
            System.out.print("Any other restriction: ");
            restriction = in.nextLine();
            restriction = restriction.toUpperCase();
        }

        System.out.println("Your list based on the restrictions you gave us: " );
        for (Bakery bread : customerList) {
            System.out.printf("%35s\t%7d\t%15s\t%15s\t%7d\n", bread.getName(), bread.getPrice(), bread.getExpirationDate(),
                    bread.getDietRestrictions(), bread.getQuantity());
        }



    }
}
