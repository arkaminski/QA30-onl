package HomeWork.HW8.Task1;

public class MainOfFigures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(2, 3, 4);
        figures[1] = new Rectangle(7, 6);
        figures[2] = new Circle(8);
        figures[3] = new Triangle(5, 7, 12);
        figures[4] = new Rectangle(8, 9);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            totalPerimeter += figure.perimeter();
        }

        System.out.println("Sum of P of all Figures in array: " + totalPerimeter);
    }
}
