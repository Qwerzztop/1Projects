public class Main {
    static byte b = 5;
    static short sh = 8;
    static int it = 99;
    static long l = 99;

    static float fl = 2.6f;
    static Float f2 = 2.7f;
    static double db = 2.9;
    static Double db3 = 2.7;

    static boolean bool1 = true;
    static boolean bool2 = false;

    static String st = "Hello";
    static char c = 'd';

    static final int CONST = 99;

    public static void main (String[] args){
             //Строка закоменнтированна для примера
                //System.out.println("byte: " + b);
               /* System.out.println("short: " + sh);
                System.out.println("int: " + it);*/
                System.out.println("long: " + l);

                System.out.println("float: " + fl);
                System.out.println("double: " + db);

                System.out.println(bool1);
                System.out.println(bool2);

                System.out.println(st + " " + c);

                System.out.println(CONST);

                int c = (int) db;
                double db2 = (double) it;
                System.out.println(c);
                System.out.println(db2);

                Number n1 = f2;
                Number n2 = db3;
                Integer in2 = n1.intValue();
                Integer in3 = n2.intValue();
                System.out.println(in2);
                System.out.println(in3);


                System.out.println(Math.sin(it) + l);

                if (bool1) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

                switch (6){
                    case 5:
                        System.out.println("5");
                        break;
                    case 6:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("1");
                        break;
                }

                if (!(it == l) || bool1) {
                        System.out.println("True");
                } else {
                        System.out.println("False");
                }

                for (int i = 0; i < 10; i++) {
                    System.out.println(i);
                }
                for (int i = 10; i > 0; i--) {
                    System.out.println(i);
                }

                int i = 0;
                while (i < 10) {
                    System.out.println(i);
                    i++;
                }







        }


}
