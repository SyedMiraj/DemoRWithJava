package org.example;

import org.rosuda.JRI.REXP;
import org.rosuda.JRI.Rengine;

public class SimpleRExample {

    public static void main(String[] args) {
        if(!Rengine.versionCheck()){
            System.err.println("Java version mismatch");
            System.exit(1);
        }

        String my[] = {"--vanilla"};
        Rengine re = new Rengine(my, false, null);
        if(!re.waitForR()){
            System.out.println("Cannot load R");
            System.exit(1);
        }
        REXP result = re.eval("mean(1:6)");
        System.out.println("rexp: " + result.asDouble());
        re.end();
    }
}
