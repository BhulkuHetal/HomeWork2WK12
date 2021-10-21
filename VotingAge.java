package HomeWork2;


public class VotingAge<age> {
    public static void main(String[] args) {
        int age1 = 25;
        if (age1 > 18) {
            System.out.println("  Eligible for voting");

            int age2 = 15;
            if (age2 > 18) {
                System.out.println("candidate can vote");


            } else {
                System.out.println(" Not eligible for voting");
            }


        }
    }
}