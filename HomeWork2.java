import java.util.Arrays;
import java.util.Scanner;

//works are made by Sergey Lapidus;
/// 1 уровень сложности: в этом приложении вы должны будете написать логику для простого бота.
//Ваш бот будет работать в почтовом отделении и служить для того,
//чтобы заранее заполнить все поля и выдать готовый квиток для отправления посылки.
//посылка может быть сборной, но обязательно из одинаковых коробок одинакового веса,
//поэтому мы спрашиваем нашего пользователя:

public class HomeWork2 {

    public static void main(String[] args){
        //primitives();
        // primitiveOperation();
        //informationAboutString();
        //basicStringOperations();
        //simpleMathOperationsInt();
        //simpleMathOperationsDouble();
        tryScanner();}

    private static void tryScanner() {
        Scanner inputParcelsAmount = new Scanner(System.in); //Input your parcels amount
        System.out.println("Please, input your parcels amount");

        int amountParcels = inputParcelsAmount.nextInt(); // User have to input parcels amount

        int parcels = amountParcels;

        Scanner inputParcelsWeight = new Scanner(System.in); //Input your parcels weight
        System.out.println("Please, input one parcel weight in kilo");
        float weightParcels = inputParcelsWeight.nextFloat(); //User have to input parcels amount
        float weight = weightParcels;

        float weightParcelsTotal = amountParcels * weightParcels; //Total parcel's weight
        System.out.println("Total weight of your parcel is " + weightParcelsTotal + " kilo");

        Scanner inputReceiver = new Scanner(System.in); //Input receiver's address
        System.out.println("Please, input receiver's address");
        String inputReceiverAddress = inputReceiver.nextLine();
        System.out.println("Your sender's address is: " + inputReceiverAddress.toUpperCase());


        Scanner inputUsersName = new Scanner(System.in); //Input your name
        System.out.println("Please, input your name");

        String inputUsersNameString = inputUsersName.next();

        //String firstNameLetter = inputUsersNameString.substring(0,1);
        //String endNameLetter = inputUsersNameString.substring(1);
        //String newUserName = inputUsersNameString.substring(0,1).toUpperCase() + inputUsersNameString.substring(1);




        System.out.println("Your sender's name is: " + inputUsersNameString.toUpperCase()); //Sender's name review

        Scanner inputUsersLastName = new Scanner(System.in); //Input your last name
        System.out.println("Please, input your last name");

        String inputUsersLastNameString = inputUsersLastName.next();

        //String firstLastNameLetter = inputUsersLastNameString.substring(0,1);
        //String endLastNameLetter = inputUsersLastNameString.substring(1);
        //String newUserLastName = inputUsersLastNameString.substring(0,1).toUpperCase() + inputUsersLastNameString.substring(1);

        System.out.println("Your sender's Last name is: " + inputUsersLastNameString.toUpperCase());//Sender's Last name review
        System.out.println("You send " + amountParcels + " parcels");
        System.out.println("Your total parcel's weight is: " + weightParcelsTotal + " kilo");
        System.out.println("Sender name is: " + inputUsersNameString.toUpperCase());
        System.out.println("Sender Last name is: " + inputUsersLastNameString.toUpperCase());

        Scanner inputCheckBox = new Scanner(System.in); //Checkbox yes/no
        System.out.println("All data correct?" + " Please input \"Yes\" or \"No\"");
        String inputCheckBoxString = inputCheckBox.next();

        boolean Yes = true;
        boolean No = false;





    }

}
    
    
    

