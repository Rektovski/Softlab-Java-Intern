package ge.softgen.softlab.tutorial.shape;

import java.util.List;

public class DrawService {
    public void drawShapes(List<Drawable> shapes){
        for(Drawable i : shapes){
            i.draw();
        }
    }
}