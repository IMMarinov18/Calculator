import java.util.Scanner;

public class Functions {



//IntFirstNumber

    public static int IntFirstNumber;

    public static int IntSecondNumber;



    //DoubleFirstNumber

    public static double DoubleFirstNumber;

    public static double DoubleSecondNumber;



    //FloatFirstNumber

    public static float FloatFirstNumber;

    public static float FloatSecondNumber;



    //ByteFirstNumber

    public static byte ByteFirstNumber;

    public static byte ByteSecondNumber;



    //BooleanFirstNumber

    private static boolean BooleanFirstNumber;

    private static boolean BooleanSecondNumber;





    static Scanner sc = new Scanner(System.in);



    public static int getIntFirstNumber() {



        IntFirstNumber= sc.nextInt();

        return IntFirstNumber;

    }



    public static int getIntSecondNumber() {

        IntSecondNumber= sc.nextInt();

        return IntSecondNumber;

    }





    public static double getDoubleFirstNumber() {



        DoubleFirstNumber= sc.nextDouble();

        return DoubleFirstNumber;

    }



    public static double getDoubleSecondNumber() {

        DoubleSecondNumber= sc.nextDouble();

        return  DoubleSecondNumber;

    }





    public static float getFloatFirstNumber() {



        FloatFirstNumber= sc.nextFloat();

        return FloatFirstNumber;

    }



    public static float getFloatSecondNumber() {



        FloatSecondNumber= sc.nextFloat();

        return FloatSecondNumber;

    }





    public static byte getByteFirstNumber() {



        ByteFirstNumber= sc.nextByte();

        return ByteFirstNumber;

    }



    public static byte getByteSecondNumber() {

        ByteSecondNumber= sc.nextByte();

        return ByteSecondNumber;

    }





    public static boolean getBooleanFirstNumber() {



        BooleanFirstNumber= sc.nextBoolean();

        return BooleanFirstNumber;

    }



    public static boolean getBooleanSecondNumber() {

        BooleanSecondNumber= sc.nextBoolean();

        return BooleanSecondNumber;

    }



    public static void OptionDev1(){



        System.out.println("Result: " + (IntFirstNumber / IntSecondNumber));

    }

    public static void OptionDev2(){



        System.out.println("Result: " + (DoubleFirstNumber / DoubleSecondNumber));

    }



    public static void OptionDev3(){



        System.out.println("Result: " + (FloatFirstNumber / FloatSecondNumber));

    }



    public static void OptionDev4(){



        System.out.println("Result: " + (ByteFirstNumber / ByteSecondNumber));

    }









    public static void OptionMultiplication1(){



        System.out.println("Result: " + (IntFirstNumber * IntSecondNumber));

    }

    public static void OptionMultiplication2(){



        System.out.println("Result: " + (DoubleFirstNumber * DoubleSecondNumber));

    }



    public static void OptionMultiplication3(){



        System.out.println("Result: " + (FloatFirstNumber * FloatSecondNumber));

    }



    public static void OptionMultiplication4(){



        System.out.println("Result: " + (ByteFirstNumber * ByteSecondNumber));

    }



    public static void OptionMultiplication5(){



        System.out.println("Result: " + (BooleanFirstNumber | BooleanSecondNumber));

    }







}

