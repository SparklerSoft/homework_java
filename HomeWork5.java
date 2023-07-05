public class HomeWork5 {
    public static void main(String[] args) {

//  Task 1. Напишите метод, который проверяет, является ли заданное число положительным,
//  отрицательным или нулём и печатает ответ в консоль

        yourNumber(55);
        yourNumber(-34);
        yourNumber(0);

//  Task 2. Напишите метод, который определяет, является ли заданное число чётным или нечётным
//  и печатает ответ в консоль

        yourNumber2(55);

//  Task 3. Напишите метод, который проверяет, является ли заданный год високосным или нет.
//  Метод возвращает boolean
//  Год, который делится на 4 без остатка, является високосным, за исключением:
//  -Годов, которые делятся на 100 без остатка. Они не являются високосными, за исключением:
//  -Годов, которые делятся на 400 без остатка. Они являются високосными.
//  для решения используйте вложенные if-else

        int inputYear = 2000;
        boolean year = yearCheck(inputYear);
        if (year) {
            System.out.println(inputYear + " Високосный год");
        } else {
            System.out.println(inputYear + " Не високосный год");
        }

//  Task 4. Напишите метод, который определяет оценку студента в зависимости от полученного балла:
//90-100 - A, 80-89 - B, 70-79 - C, 60-69 - D, меньше 60 - F.
//Метод принимает число в качестве аргумента и возвращает строку

        studentMark(77); // Введите целое число от 1 до 100.

//  Task 5. Напишите метод, который определяет время года (весна, лето, осень, зима) в зависимости
//  от заданного месяца.
//используйте конструкции if-else-if. Метод принимает строку и возвращает тоже строку

        String month = "june"; // введите название месяца на английском языке
        String season = seasonType(month);
        System.out.println(season);

//  Task 6.Напишите метод, который определяет тип треугольника (равносторонний,
//  равнобедренный, разносторонний) по заданным
//сторонам и возвращает строку "равносторонний", "равнобедренный" или "разносторонний"

        triangleType(5, 6, 7); // Ведите три положительных числа.

//  Task 7.Напишите метод, который определяет, является ли заданное число
//  кратным 3, 5 или обоим и возвращает строку

        numberDetermine(16);
    }
    // Task 1. Decision.
    public static void yourNumber(int number) {
        if (number < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (number > 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели Ноль");
        }
    }
    // Task 2. Decision.
    public static void yourNumber2(double y) {
        if (y % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else System.out.println("Вы ввели нечетное число");
    }
    // Task 3. Decision.
    public static boolean yearCheck(int d) {
        if (d % 4 == 0) {
            if (d % 400 == 0) {
                if (d % 100 != 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return true;
        }
    }
    // Task 4. Decision.
    public static int studentMark(int mark) {
        int result = mark;
        if (mark > 90 && mark < 100) {
            System.out.println("You have got a mark A");
        } else if (mark > 80 && mark < 89) {
            System.out.println("You have got a mark B");
        } else if (mark > 70 && mark < 79) {
            System.out.println("You have got a mark C");
        } else if (mark > 60 && mark < 69) {
            System.out.println("You have got a mark D");
        } else {
            System.out.println("You have got a mark F");
        }
        return result;
    }
    // Task 5. Decision.
    public static String seasonType(String season) {
        String month = season;
        if (month.equals("january") || month.equals("december") || month.equals("february")) {
            return season + " it's a winter";
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            return season + " it's a spring";
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            return season + " it's a summer";
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            return season + " it's an autumn";
        } else {
            System.out.println("Error");
        }
        return season + " incorrect input";
    }
    // Task 6. Decision.
    public static void triangleType(double a, double b, double c) {
        if (a == b && b == c && c == a) {
            System.out.println("Ваш треугольник равносторонний");
        } else if (a == b || a == c || b == c) {
            System.out.println("Ваш треугольник равнобедренный");
        } else {
            System.out.println("Ваш треугольник разносторонний");
        }
    }
    // Task 7. Decision.
    public static void numberDetermine(int number) {
        if (number % 3 == 0 && number%5==0) {
            System.out.println("Ваше число кратно трем и пяти");
            if (number % 3 == 0) {
                System.out.println("Ваше число кратно трем");
                if (number % 5 == 0) {
                    System.out.println("Ваше число кратно пяти");
                }
            }
        } else if (number % 5 == 0) {
            System.out.println("Ваше число кратно 5 и не кратно 3");
        } else if (number % 3 == 0) {
            System.out.println("Ваше число кратно 3 и не кратно 5");
        } else if (number % 3 != 0 && number % 5!=0) {
                System.out.println("Ваше число не кратно 3 и 5");
        }

    }
}










