import java.util.Scanner;

public class HomeWork7 {
    //Task 1.лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
    // Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем
    // подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый верх. Найдите
    // количество подьемов, которые понадобятся лифту.

    public static void main(String[] args) {
        numberOfLifts(200, 50, 20);

    //Task 2. В классе N учеников, по завершению теста диктуются оценки A, B, C или D.
    //Необходимо посчиать количество каждыъ оценок.
    //реализовать метод counter(int n)
    //оценки задаются через консоль

        System.out.println("Input number of students: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        counter(n);
    }

    public static void numberOfLifts(int floor, int stepUp, int stepDown) {
        int lifts = 0;
        while (floor > 0){
            floor = floor-stepUp;
            lifts++;
            if (floor <= 0){
                break;
            }
            floor = floor+stepDown;
        }
        System.out.println("Number of lifts " + lifts + "\n");
    }
    public static void counter(int n){
        int markA = 0;
        int markB = 0;
        int markC = 0;
        int markD = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < n; i++){
            System.out.println("Input mark (A, B, C or D) for the student: " + (i+1) + " : ");
            String marks = scanner.nextLine();

            switch (marks.toUpperCase()){
                case "A":
                    markA++;
                    break;
                case "B":
                    markB++;
                    break;
                case "C":
                    markC++;
                    break;
                case "D":
                    markD++;
                    break;
                default:
                    System.out.println("Error. You put the wrong mark " + marks);
                    i--;
                    break;

            }
            System.out.println("Number of A marks is: " + markA);
            System.out.println("Number of B marks is: " + markB);
            System.out.println("Number of C marks is: " + markC);
            System.out.println("Number of D marks is: " + markD);
        }
    }
}


