import java.text.DecimalFormat;

public class Exercise3 {
    // [Bài tập] Access modifier
    public static final DecimalFormat df = new DecimalFormat("0.0000");
    public static void main(String[] args) {
        Circle c = new Circle(15, "black");
        System.out.println(df.format(c.getArea()));
        System.out.println(df.format(c.getPerimeter()));
    }
}
