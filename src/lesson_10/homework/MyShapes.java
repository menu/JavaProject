package lesson_10.homework;

import java.util.ArrayList;
import java.util.List;

public class MyShapes {
    public static void main(String[] args) {
        List<Shape> collectionOfShapes = new ArrayList<>();
        int option = 0;

        while (option != 7) {
            Messages.printMainMenu();
            option = Messages.getMainMenuOption();
            switch (option) {
                case 1:
                    Messages.printShapesMenu();
                    option = Messages.getShapesMenuOption();
                    switch (option) {
                        case 1:
                            collectionOfShapes.add(new Square());
                            break;
                        case 2:
                            collectionOfShapes.add(new Rectangle());
                            break;
                        case 3:
                            collectionOfShapes.add(new Circle());
                            break;
                        case 4:
                            collectionOfShapes.add(new RightTriangle());
                            break;
                    }
                case 2:
                    Messages.printCollection(collectionOfShapes);
                    break;
                case 3:
                    Messages.printSumAllPerimeters(collectionOfShapes);
                    break;
                case 4:
                    Messages.printSumAllAreas(collectionOfShapes);
                    break;
                case 5:
                    Messages.printBiggestPerimeter(collectionOfShapes);
                    break;
                case 6:
                    Messages.printBiggestArea(collectionOfShapes);
                    break;

            }
        }
        System.out.println("Exit the program...");

    }
}

