import java.util.Scanner;

public class Main {

//opgave 1

    String accountName = "Olga KFW";

    double balance=400;
    double balanceUp = deposit(100);
    double balanceDown = withdraw(50);

    Scanner scan = new Scanner (System.in);

//opgave 1 methods
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


//opgave 2
    int assignmentPoints;
    int examPoints;
    int projectPoints;

//opgave 2 methods
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



//opgave 3
    double basePrice=500.00;
    double discountPercentage =20.00;
    double taxPercentage=25.00;

    double discountedPrice=applyDiscount(basePrice,discountPercentage);
    double finalPrice = addTax(discountedPrice, taxPercentage);

//opgave 3 methods

    double applyDiscount(double basePrice, double discountPercentage){

            return  basePrice-(basePrice*(discountPercentage/100.00));}

    double addTax (double price, double taxPercentage){

            return price*((taxPercentage/100)+1);}

    String priceMessage (double basePrice,double discountPercentage, double finalPrice){
        return "Your original price was: "+basePrice+" but you get "+discountPercentage+"% discount. Your final price is:"+finalPrice+" kr. after discount and tax";}


//opgave 4

   int [] ages = {45,67,23,89,34,56,78};

    int averageAge=calculateAverage(ages);

    int minAge = findMin(ages);

    int maxAge = findMax(ages);

    int aboveAverageCounter=aboveAverage(ages);


//opgave 4 methods

   int calculateAverage (int [] numbers){
       int sumAges=0;
       for (int i=0; i<numbers.length;i++){
           sumAges+=numbers[i];}
       return sumAges/numbers.length  ;}

   int findMin (int [] numbers){
       int minAge = numbers[0];
       for (int i=0; i< numbers.length;i++){
       if (numbers[i]<minAge) {
           minAge=numbers[i];  }
       }
       return minAge;}

   int findMax (int [] numbers){
       int maxAge = numbers[0];
       for (int i=0; i< numbers.length;i++){
       if (numbers[i]>maxAge) {
           maxAge=numbers[i];  }
       }
       return maxAge;}

   int aboveAverage (int [] numbers){
       int counter = 0;
       for (int i=0; i< numbers.length;i++){
       if (numbers[i]>averageAge) {
           counter++;  }
       }
       return counter;}

    void printAllStats (){
        System.out.println("these are the ages in the array:");
        printArray();
        System.out.println(("the average age is: " + averageAge));
        System.out.println(("the minimum age is: " + minAge));
        System.out.println(("the maximum age is: " + maxAge));
        System.out.println((aboveAverageCounter + " people are older than the average age"));

    }

    void printArray(){
        for(int number:ages){
            System.out.print(number+", ");
        }
        System.out.println();
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
        //System.out.println(discountedPrice);
        //System.out.println(finalPrice);
        System.out.println(priceMessage(basePrice,discountPercentage,finalPrice));

//opgave 4
        System.out.println(averageAge);
        System.out.println(minAge);
        System.out.println(maxAge);
        System.out.println(aboveAverageCounter);
        //printArray();
        printAllStats();



    }
















}
