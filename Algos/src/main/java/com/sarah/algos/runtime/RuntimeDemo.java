/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.runtime;

import java.io.IOException;

/*
 * @author Sarah
 */

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        
        Runtime runtime = Runtime.getRuntime();
        
        Process process = runtime.exec("notepad.exe");
        System.out.println("process alive = " + process.isAlive());
    }
}
