import java.util.Scanner;

public class Main {

//opgave 1

    String accountName = "Olga KFW";

    double balance=400;
    double balanceUp = deposit(100);
    double balanceDown = withdraw(50);

    Scanner scan = new Scanner (System.in);

//opgave 2
    int assignmentPoints;
    int examPoints;
    int projectPoints;

//opgave 3
    double basePrice=500.00;
    double discountPercemtage =20.00;
    double vatPercentage=25.00;



//opgave 1
    double deposit (double amount){
        return balance=balance+amount;
    }

    double withdraw (double amount){
        return balance=balance-amount;
    }

    void printBalance () {
        System.out.println(("on account: " + accountName));
        System.out.println("your balance is: "+balance+" kr.");
    }

// opgave 2
    void addAssignmentPoints (int points){
        assignmentPoints+=points;
    }
    void addExampoints(int points){
        examPoints+=points;
    }
    void addProjectPoints(int points){
        projectPoints+=points;
    }
    void printSum (){
        int sum = assignmentPoints+examPoints+projectPoints;
        System.out.println("Your total score is: "+sum);
    }




    void main (){
       // System.out.println("How much do you wish to withdraw?");

//opgave 1
        deposit(100);
        deposit(100);
        withdraw(50);
        printBalance();

//opgave 2

        addAssignmentPoints(25);
        //System.out.println(assignmentPoints);
        addExampoints(30);
        //System.out.println(examPoints);
        addProjectPoints(30);
        //System.out.println(projectPoints);
        printSum();

//opgave 3





    }
















}
