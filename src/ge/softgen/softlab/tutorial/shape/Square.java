package ge.softgen.softlab.tutorial.shape;

public class Square implements Drawable{
    private int a;

    public Square(int a){
        this.a=a;
    }

    @Override
    public void draw() {
        System.out.println("ge.softgen.softlab.tutorial.shape.Square:\n" +
                "Side = " + a + "\n");
    }
}