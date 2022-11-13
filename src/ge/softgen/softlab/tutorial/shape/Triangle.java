package ge.softgen.softlab.tutorial.shape;

public class Triangle implements Drawable {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("ge.softgen.softlab.tutorial.shape.Triangle: " +
                "\na side = " + a +
                "\nb side = " + b +
                "\nc side = " + c + "\n"
        );
    }
}