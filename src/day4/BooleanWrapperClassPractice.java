package day4;

public class BooleanWrapperClassPractice {
    public static void main(String[] args) {

        System.out.println("***** UnBoxing ***************");
        //UnBoxing
        boolean b1 = Boolean.parseBoolean("True");
        boolean b2 = Boolean.parseBoolean("true");
        System.out.println("b1 = " + b1); //true
        System.out.println("b2 = " + b2); //true


        System.out.println("******* None - Boxing *************");
        // None - Boxing
        Boolean r1 = Boolean.parseBoolean("TrUe");
        Boolean r2 = Boolean.parseBoolean("true");
        System.out.println("r1 = " + r1); //true
        System.out.println("r2 = " + r2); //true

        System.out.println("****Boolean wrapper class object ****");
        // Boolean wrapper class object
        Boolean r3 = new Boolean("True");
        Boolean r4 = new Boolean(true);
        System.out.println("r3 = " + r3);  //true
        System.out.println("r4 = " + r4); //true

    }
}
