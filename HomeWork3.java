
import java.util.Scanner;

public class HomeWork3 {
    // Task 1. Make a new word from two another.
    public static void main(String[] args){
        Scanner firstUserWord = new Scanner (System.in);
        System.out.println("Input your first word");
        String firstUserWordIn = firstUserWord.next();
        Scanner secondUserWord = new Scanner(System.in);
        System.out.println("Input your second word");
        String secondUserWordIn = secondUserWord.next();
        returnNewWord(firstUserWordIn, secondUserWordIn);

        // Task 2. Calculate your numbers
        double num1 = 27; // first number
        double num2 = 3; // second number

        System.out.println(("Sum result is ") + sum(num1, num2));
        System.out.println(("Minus result is ") + minus(num1, num2));
        System.out.println(("Degree result is ") + degree(num1, num2));
        System.out.println(("Multiple result is ") + multiply(num1, num2));;

        // Task 3.
        double num3 = 533; // input your amount in EUR
        double num4 = 1.22; // exchange rate 1 EUR = ..USD
        conversion(num3, num4);

        // Task 4.
        double smallPizza = 24; // diameter in sm desired pizza
        double bigPizza = 28; // diameter in sm another bigger pizza
        double calories = 40; // calories per 1 sq.sm
        calorieCalculator(smallPizza, bigPizza, calories);

        // Task 5.
        double a = 5; // input length rectangle's side a
        double b = 6; // input length rectangle's side b
        double x = 8; // input length triangle's side x
        double y = 10; // input length triangle's side y
        double z = 3; //input length triangle's side z
        double r = 8; //input circle's radius r


        double rectangleArea = calculateRectangleArea(a, b);
        double circleArea = calculateCircleArea(r);
        double triangleArea = calculateTriangleArea(x, y, z);
        System.out.println("\n");

        // Task 6.
        System.out.println(getChars("street", 2,3));// input your word1
        System.out.println(getChars("country", 1,0));// input your word2
        System.out.println(getChars("house", 4,4));// input your word3
    }
    // New word method
    private static String returnNewWord(String firstUserWordIn, String secondUserWord){
        String first = firstUserWordIn.substring(0,firstUserWordIn.length() / 2);
        String second = secondUserWord.substring(secondUserWord.length() / 2);
        String resulString = first+second;
        System.out.println(resulString);
        return resulString;}

    public static double sum(double num1, double num2) { // Calculate method sum
        double result = num1 + num2;
        return result;
    }

    public static double minus(double num1, double num2) { // Calculate method minus
        double result = num1 - num2;
        return result;
    }

    public static double degree(double num1, double num2) { // Calculate method degree/divide
        if (num2 == 0){ throw new ArithmeticException("You can't divide on zero");}
        double result = num1 / num2;
        return result;
    }

    public static double multiply (double num1, double num2){ // Calculate method multiply
        double result = num1 * num2;
        return result;
    }
    public static void conversion(double num3, double num4){ // Conversion method
        double num5 = num3 * num4;
        System.out.printf("При курсе " + num4 + " за 1 EUR, при обмене " + num3 + " EUR, вы получите " + num5 + " USD");
    }
    public static void calorieCalculator(double smallPizza, double bigPizza, double calories){ // Calculate calories method
        double caloriesSmallPizza = Math.round(smallPizza * smallPizza / 4 * Math.PI * calories);
        double caloriesBigPizza = Math.round(bigPizza * bigPizza / 4 * Math.PI * calories);
        double additionalCalories = caloriesBigPizza - caloriesSmallPizza;
        System.out.printf("\nЕсли вы купите пиццу диаметром %.0f сантиметров вместо пиццы %.0f сантиметров, вы получите %.0f дополнительных калорий", bigPizza, smallPizza, additionalCalories);
    }
    public static double calculateRectangleArea(double a, double b){ // Calculate rectangle area method
        double result = a * b;
        System.out.printf("\nRectangle area is " + result);
        return result;
    }

    public static double calculateCircleArea(double r){ // Calculate circle area if you know R method
        double result = Math.PI * Math.pow(r,2);
        System.out.printf("\nCircle area is " + result);
        return result;}

    public static double calculateTriangleArea(double x, double y, double z){ // Calculate triangle area using Geron formula method
        double p = x + y + z;
        double result = p / 2 * (Math.sqrt((p-x)*(p-y)*(p-z)/p));
        System.out.printf("\nTriangle area is " + result);
        return result;}
    public static String getChars(String str, int second, int third){ // Char method
        String result = "";
        result = result + str.charAt(second);
        result = result + str.charAt(third);
        return result;
    }
}

