package com.bjsxt;

import java.io.File;
import java.io.IOException;

public class fileTest {
    public static void main(String[] args) throws IOException {

         File f1 =new File("a.text");
        //System.out.println( f1.createNewFile());
         System.out.println( f1.getAbsoluteFile());

         System.out.println(f1.exists());


        // System.out.println();

    }

}
