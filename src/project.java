import java.util.Scanner;

public class project {
    public static void main(String[] args) {

        //findSmallestNumber(); // Task 1
        //System.out.println(isNumberPositive(10)); // Task 2
        //middleCharOfString("Hej med dig"); // task 3
        //System.out.println(areaOfTriangle(10,15,20)); // task 4



    }





    public static double areaOfTriangle (double a, double b, double c){
        System.out.println("Please type in the 3 side lengths of your triangle to calculate the area.");
        double s = (a+b+c)/2;
        double areal = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        //System.out.println("The area of your triangle is; "+ areal);
        return areal;

    }


    public static char middleCharOfString (String sentence){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a word or sentence to get the middle character.");
        //String sentence = scanner.nextLine();
        sentence = sentence.replaceAll(" ","");
        int length = sentence.length();
        int middle = length/2;
        char middleChar = sentence.charAt(middle);
        System.out.println("The middle character of your sentence is; " + middleChar);
        return middleChar;

    }

    public static String isNumberPositive(int tal){
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number to see if it's positive, negative or ZERO.");
        int num = tal;
        if(num>0){
            return "Your number is positive.";
        }
        else if(num==0){
            return "Your number is zero.";
        }
        else {
            return "Your number is negative.";
        }
    }

    public static int findSmallestNumber (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in 3 numbers to find out which is the smallest!");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int smallestNumber = (Math.min(Math.min(firstNumber,secondNumber),thirdNumber));
        System.out.println("The smallest number typed in is; "+ smallestNumber);
        return smallestNumber;


    }


}




