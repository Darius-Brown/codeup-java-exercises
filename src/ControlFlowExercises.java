public class ControlFlowExercises {
    public static void main(String[] args) {

        boolean isAdmin = false;
        boolean isLoggedIn = true;
        boolean isOwner = false;

        System.out.println("(isAdmin && isLoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden portal? " +(isAdmin && isLoggedIn));



        for(int i = 5; i <= 15; i += 1) {
            System.out.println("i is " + i);
        }

        for(int i = 0; i<= 100; i += 2){
            System.out.println(i);
        }
        for(int i = 100; i>= -10; i -= 5){
            System.out.println(i);
        }
        //due to int the code stops at 65536 and infinite loop outputs 0, changed int to long

        for(long i = 2; i<1000000; i *= i ){
            System.out.println(i);
        }

        //FIZZ BUZZ
        for(int i = 1; i<=100; i++){
                if ((i % 5 == 0) && (i % 3 == 0)){
                    System.out.println("FIZZBUZZ");
                } else if (i % 5 == 0){
                    System.out.println("BUZZ");
                } else if (i % 3 == 0){
                    System.out.println("FIZZ");
                } else {
                    System.out.println(i);
                }
        }

    }
}
