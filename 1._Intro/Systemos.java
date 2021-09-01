import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Systemos {


    public static class out{

       // public static void println(String text) {
         //   System.out.println(text);
        //}

        public static void println(int number) {
            System.out.println(number);
        }
        public static void println(double number) {
            System.out.println(number);
        }

        public static void println(char text) {
            System.out.println(text);
        }

        public static void println(float number) {
            System.out.println(number);
        }

        public static void println(long number) {
            System.out.println(number);
        }


        public static void println(Object content) {
            System.out.println(content);

        }

        public static void println(Object[]content) {
            for (Object object : content) {
                println(object);
            }
        }

        // nedenstående hedder lambda
        public static void println(List content) {
                content.forEach(object -> println(object));
            }





    }
}
