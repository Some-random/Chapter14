/**
 * Created by Bob_JIANG on 8/15/2015.
 */
public class Problem1 {
    public class First {
        private First(Object o){
            o.toString();
        }
    }

    public class Second extends First {
        Second(Object o) {
            super(o);
        }
    }

    //I've put my thoughts in the comments in main function
    public static void main(String[] args) {
        //Basically something like the above code shouldn't compile... But it compiles anyway... In theory, with
        // constructor being private, no inheritance can be done... Private constructor also works when you want to try
        // singleton or when using utility class
    }

}
