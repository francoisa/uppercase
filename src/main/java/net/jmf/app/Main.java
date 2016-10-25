package net.jmf.app;

/**
 * Takes the input and converts to upper case
 *
 */
public class Main  {
    public static void main(String[] args) {
    	Uppercase u = new Uppercase(args);
        for (String arg : u) {
        	System.out.print(arg + "|");
        }
        System.out.println("end");
    }
}
