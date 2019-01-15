package think.java4th.inner;

import java.io.OutputStream;

public class Outer {
    int counter = 0;

    class Inner {
        public int incrementCounter() {
            return counter++;
        }
    }

    public Inner createInner() {
        return new Inner();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.toString());
        Inner inner = outer.createInner();
        inner.incrementCounter();
        System.out.println(outer.toString());

        Outer.Inner inner1 = new Outer().new Inner();
    }

    public String toString() {
        return String.valueOf(counter);
    }
}
