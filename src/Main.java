import java.util.Scanner;





public class Main {

    public static void main(String[] args)

    {



        Scanner scan = new Scanner(System.in);





        System.out.println(" Welcome to my calculator ");

        System.out.println(" Choose type: ");

        System.out.println(" For multiplication press 1 ");

        System.out.println(" For division press 2 ");



        int ActionTypeNumber = scan.nextInt();







        if(ActionTypeNumber == 1)

        {

            System.out.println(" Choose action: ");

            System.out.println(" 1 int");

            System.out.println(" 2 double");

            System.out.println(" 3 float");

            System.out.println(" 4 byte");

            System.out.println(" 5 boolean");



            int DataTypeNumber = scan.nextInt();



            if (DataTypeNumber == 1)

            {

                System.out.println("\na = ");

                Functions.getIntFirstNumber();



                System.out.println("b = ");

                Functions.getIntSecondNumber();

                Functions.OptionMultiplication1();





            }

            else if(DataTypeNumber == 2)

            {

                System.out.println("\na = ");

                Functions.getDoubleFirstNumber();



                System.out.println("b = ");

                Functions.getDoubleSecondNumber();

                Functions.OptionMultiplication2();

            }

            else if(DataTypeNumber == 3)

            {

                System.out.println("\na = ");

                Functions.getFloatFirstNumber();



                System.out.println("b = ");

                Functions.getFloatSecondNumber();

                Functions.OptionMultiplication3();

            }



            else if(DataTypeNumber == 4)

            {

                System.out.println("\na = ");

                Functions.getByteFirstNumber();



                System.out.println("b = ");

                Functions.getByteSecondNumber();

                Functions.OptionMultiplication4();

            }



            else if(DataTypeNumber == 5)

            {

                System.out.println("\na = ");

                Functions.getByteFirstNumber();



                System.out.println("b = ");

                Functions.getByteSecondNumber();

                Functions.OptionMultiplication5();

            }





        }



        if(ActionTypeNumber == 2)

        {

            System.out.println(" Choose action: ");

            System.out.println(" 1 Int");

            System.out.println(" 2 Double");

            System.out.println(" 3 Float");

            System.out.println(" 4 Byte");





            int DataTypeNumber = scan.nextInt();



            if (DataTypeNumber == 1)

            {

                System.out.println("\na = ");

                Functions.getIntFirstNumber();



                System.out.println("b = ");

                Functions.getIntSecondNumber();

                Functions.OptionDev1();





            }

            else if(DataTypeNumber == 2)

            {

                System.out.println("\na = ");

                Functions.getDoubleFirstNumber();



                System.out.println("b = ");

                Functions.getDoubleSecondNumber();

                Functions.OptionDev2();

            }

            else if(DataTypeNumber == 3)

            {

                System.out.println("\na = ");

                Functions.getFloatFirstNumber();



                System.out.println("b = ");

                Functions.getFloatSecondNumber();

                Functions.OptionDev3();

            }



            else if(DataTypeNumber == 4)

            {

                System.out.println("\na = ");

                Functions.getByteFirstNumber();



                System.out.println("b = ");

                Functions.getByteSecondNumber();

                Functions.OptionDev4();

            }







        }







    }

}

