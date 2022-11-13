package ge.softgen.softlab.tutorial;

import ge.softgen.softlab.tutorial.shape.DrawService;
import ge.softgen.softlab.tutorial.shape.Drawable;
import ge.softgen.softlab.tutorial.shape.Square;
import ge.softgen.softlab.tutorial.shape.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Drawable> drawables = new ArrayList<>();
        drawables.add(new Triangle(3, 4, 5));
        drawables.add(new Triangle(4, 5, 6));
        drawables.add(new Triangle(5, 6, 7));
        drawables.add(new Square(2));
        drawables.add(new Square(3));
        drawables.add(new Square(4));

        DrawService x = new DrawService();
        x.drawShapes(drawables);
    }
}