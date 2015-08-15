import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Bob_JIANG on 8/15/2015.
 */
public class Problem5 {

    //I've put my thought in the comments in main function
    public static void main(String[] args) {
        //"Reflection" is a language's ability to inspect and dynamically call classes, methods, attributes, etc. at
        // runtime. For example, all objects in Java has the method getClass, which lets you determine its class even
        // if you don't know it at compile time (like if you declared it as Object) - this might seem trivial, but such
        // reflection is not by default possible in less dynamic languages such as C++.

        //Reflection is the ability to "reflect" on the structure of your program. Or more concrete. To look at the
        // objects and classes you have and programmatically get back information on the methods, fields, and interfaces
        // they implement. You can also look at things like annotations.

        //Reflection is important since it lets you write programs that do not have to "know" everything at compile time,
        // making them more dynamic, since they can be tied together at runtime.

        Object o = new ArrayList<>();
        try {
            Method m = o.getClass().getMethod("add", null);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
