public class Calculator {

    public static void welcomeScreen(){
        System.out.println("Hi, and welcome to the calculator.");
    }

    public static int addition(int number1, int number2) {
        int number3=number1+number2;
        System.out.println(number1 + " + " + number2 + " = " + number3);
        return number3;
    }

    public static int subtraction(int number1, int number2){
        int number3=number1-number2;
        System.out.println(number1 + " - " + number2 + " = " + number3);
        return number1-number2;
    }

    public static int multiplication(int number1, int number2){
        int number3=number1*number2;
        System.out.println(number1 + " * " + number2 + " = " + number3);
        return number3;
    }

    public static int division(int number1, int number2){
        int number3=number1/number2;
        System.out.println(number1 + " / " + number2 + " = " + number3);
        return number3;
    }
}
