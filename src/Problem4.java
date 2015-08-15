import java.util.LinkedList;

/**
 * Created by Bob_JIANG on 8/15/2015.
 */
public class Problem4 {
    public static <T> void fill(T[] array, T elem) {
        for(int i = 0; i < array.length; i++)
            array[i] = elem;
    }


    //I've put my thoughts in the comments in main function
    public static void main(String[] args) {
        //This main function will throw out a runtime error if you try to run it.
        //Templates work, by providing the compiler with a (wait for it...) template that it can use to generate
        // type-safe code by filling in the template parameters.
        //Generics, as i understand them, work the other way around: the type parameters are used by the compiler to
        // verify that the code using them is type-safe, but the resulting code is generated without types at all.
        //Think of C++ templates as a really good macro system, and Java generics as a tool for automatically
        // generating typecasts.

        fill(new String[5], "A string");
        fill(new String[5], 100); // What the ...???

        // Won't compile:
        // Class<String> cs = "abc".getClass();

        Object obj = new LinkedList<Long>();
        // Won't compile:
        // System.out.println(obj instanceof List<Long>);}
    }
}
