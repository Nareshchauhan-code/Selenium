package com.selenium;

public class Varargs_Demo_1 {

        // Takes string as a argument followed by varargs
        static void fun2(String str, int... a)
        {
            System.out.println("String: " + str);
            System.out.println("Number of arguments is: "
                    + a.length);

            // using for each loop to display contents of a
            for (int i : a)
                System.out.print(i + " ");

            System.out.println();
        }

        public static void main(String args[])
        {
            // Calling fun2() with different parameter
            fun2("GeeksforGeeks", 100, 200);
            fun2("CSPortal", 1, 2, 3, 4, 5);
            fun2("forGeeks");
        }

}
