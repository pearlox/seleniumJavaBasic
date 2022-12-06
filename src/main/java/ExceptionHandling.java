public class ExceptionHandling {
    public static void main(String[] args) throws Exception {

        try {
            disp();
        } catch (Exception e) {
            e.printStackTrace();
        }

        disp();

        try {
            int i = 2;
            System.out.println(i/1);

            int[] array = {1,2,3};
            System.out.println(array[3]);

            disp();

        }
        catch (ArithmeticException arithmeticException) {
            arithmeticException.printStackTrace();
            System.out.println(arithmeticException.getMessage());
            System.out.println("Error occured while dividing the number by 0");
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
//            System.exit(1);
//            System.out.println(arrayIndexOutOfBoundsException.getMessage());
            System.out.println("Array out of bound exception occured");
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println("Exception occured");
        }
        finally {
            System.out.println("inside finally");
        }

        display();

        try {
            try {

            } catch (Exception e) {

            }
        } catch (ArithmeticException e) {

        }
        System.out.println("after exception occured");
    }

    public static void disp() throws Exception {
            throw new Exception("user defined exception");
    }

    public static boolean display() {
        try {
            System.out.println("inside try in display");
            return false;
        } catch (Exception e) {
            return false;
        } finally {
            System.out.println("finally");
        }
    }
}
