public class ShapeNamePrinter implements NamePrinter{
    private Shape shape;

    public ShapeNamePrinter(Shape shape) {
        this.shape = shape;
    }
    public void printName() {
        System.out.println("Ім'я фігури - " + shape.getName());
    }
}
