package example.pattern.simplefactory;

public class ShapeFactory {

    public Shape createShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else {
            return null;
        }
    }

}
