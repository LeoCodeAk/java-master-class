package org.example.Inheritance;

public class Cog extends Cat implements Fetch, Runnable, Comparable {

    @Override
    public void fetch() {
        System.out.println("I got the stick, but not because you asked me to.. I  Did it because I wanted to.");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public void run() {

    }
}
