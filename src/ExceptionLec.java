public class ExceptionLec {

    public static void main(String[] args) throws Exception{



        try {
            System.out.println("Lets'see...");
            int result = 1/0;
            System.out.println("I can divide by zero!");
            System.out.println("result = " + result);
        } catch (ArithmeticException e){
            System.out.println("User tried to divide by zero!");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        } catch (Exception e) {
            //move down the line and move with each Catch block{}
        }

        //An example of an array:

        int[] numbers = {1,2,3};
        int x;
        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run");
        }

    }
}
