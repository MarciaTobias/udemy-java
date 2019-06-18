public class Operators {

    public static void main(String[] args) {

        boolean isCar = true;

        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        System.out.println("Was car is true");

        double myVariable = 20d;
        double mySecondVariable = 80d;
        double myMultiplication = (myVariable + mySecondVariable) * 25;
        System.out.println("My total is: " + myMultiplication);

        double total = myMultiplication % 40;
        System.out.println("My second total: " + total);

        if (total <= 20)
            System.out.println("Total was over the limit");
    }
}
