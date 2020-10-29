import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(3, 2), new Point(3, -1));
        Rectangle rectangle = new Rectangle(new Point(-9, 2), new Point(-9, -2), new Point(-3, 2));
        Triangle triangle = new Triangle(new Point(-10, -8), new Point(-7, -4), new Point(-3, -8));
        Board board = new Board();

        int functionSelection = 0;
        int figureSelection = 0;
        while (functionSelection != 4) {
            System.out.println("Start the game");
            System.out.println();
            System.out.println("Press 1 to add a shape");
            System.out.println("Press 2 to delete the shape");
            System.out.println("To view the characteristics of figure 3");
            System.out.println("Press 4 to exit the game");
            Scanner newLine = new Scanner(System.in);
            functionSelection = newLine.nextInt();

            if (functionSelection == 1) {
                System.out.println("Select shape");
                System.out.println("square -1");
                System.out.println("rectangle -2");
                System.out.println("triangle -3");

                Scanner lineFigure = new Scanner(System.in);
                figureSelection = lineFigure.nextInt();

                if (figureSelection == 1) {
                    board.addFiqure(square);
                }

                if (figureSelection == 2) {
                    board.addFiqure(rectangle);
                }

                if (figureSelection == 3) {
                    board.addFiqure(triangle);
                }
            }
            if (functionSelection == 2) {

                System.out.println("Select shape");
                System.out.println("square -1");
                System.out.println("rectangle -2");
                System.out.println("triangle -3");

                Scanner lineFigure = new Scanner(System.in);
                figureSelection = lineFigure.nextInt();

                if (figureSelection == 1) {
                    board.deletionFiqure(square);
                }

                if (figureSelection == 2) {
                    board.deletionFiqure(rectangle);
                }

                if (figureSelection == 3) {
                    board.deletionFiqure(triangle);
                }
            }

            if (functionSelection == 3) {
                board.showFiqure();
            }
        }
    }
}
