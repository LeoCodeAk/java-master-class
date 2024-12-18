package org.example.FirstSteps;

public class GarbageCollector {
    public static void main(String[] args) {
    /* What is garbage collector? Java mechanism that automatically manages memory. Its job is to find
        and remove objects that are no longer needed by program.
            ~~Think of it as a housekeeper that cleans up unused objects in memory to prevent memory leaks.
            ~~Garbage Collector will automatically manage memory and removes objects that are no longer reachable.
            ~~It's a part of JVM and runs automatically.
       */


        String unused = new String(" I Am not used");
        unused = null;

        String stillUsed = new String("I am still in used");

    }


}

