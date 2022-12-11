package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: ShapeCollector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("-------------------------------------------------------");
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
        System.out.println("-------------------------------------------------------");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for Circle")
    class TestCircle {
        @Test
        void testGetShapeName() {
            //Given
            Shape figure = new Circle(10);

            //When
            String retrievedName = figure.getShapeName();

            //Then
            Assertions.assertEquals("circle", retrievedName);
        }

        @Test
        void testGetField() {
            //Given
            Shape figure = new Circle(10);

            //When
            int retrievedField = figure.getField();

            //Then
            Assertions.assertEquals(10, retrievedField);
        }

        @Test
        void testAddFigureZeroField() {
            //Given
            Shape figure = new Circle(0);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testAddFigure() {
            Shape figure = new Circle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(figure, shapeCollector.getFigure(0));
        }
        @Test
        void testRemoveFigure() {
            //Given
            Shape figure = new Circle(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape figure = new Circle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testGetFigure() {
            //Given
            Shape figure = new Circle(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(figure, retrievedFigure);
        }
        @Test
        void testGetFigureNotExisting() {
            //Given
            Shape figure = new Circle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrievedFigure = null;
            retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null, retrievedFigure);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
    }


    @Nested
    @DisplayName("Tests for Triangle")
    class TestTriangle {
        @Test
        void testGetShapeName() {
            //Given
            Shape figure = new Triangle(10);

            //When
            String retrievedName = figure.getShapeName();

            //Then
            Assertions.assertEquals("triangle", retrievedName);
        }
        @Test
        void testGetField() {
            //Given
            Shape figure = new Triangle(10);

            //When
            int retrievedField = figure.getField();

            //Then
            Assertions.assertEquals(10, retrievedField);
        }
        @Test
        void testAddFigureZeroField() {
            //Given
            Shape figure = new Triangle(0);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testAddFigure() {
            Shape figure = new Triangle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(figure, shapeCollector.getFigure(0));
        }
        @Test
        void testRemoveFigure() {
            //Given
            Shape figure = new Triangle(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape figure = new Triangle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testGetFigure() {
            //Given
            Shape figure = new Triangle(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(figure, retrievedFigure);
        }
        @Test
        void testGetFigureNotExisting() {
            //Given
            Shape figure = new Triangle(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrievedFigure = null;
            retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null, retrievedFigure);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
    }


    @Nested
    @DisplayName("Tests for Square")
    class TestSquare {
        @Test
        void testGetShapeName() {
            //Given
            Shape figure = new Square(10);

            //When
            String retrievedName = figure.getShapeName();

            //Then
            Assertions.assertEquals("square", retrievedName);
        }
        @Test
        void testGetField() {
            //Given
            Shape figure = new Square(10);

            //When
            int retrievedField = figure.getField();

            //Then
            Assertions.assertEquals(10, retrievedField);
        }
        @Test
        void testAddFigureZeroField() {
            //Given
            Shape figure = new Square(0);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testAddFigure() {
            Shape figure = new Square(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            shapeCollector.addFigure(figure);

            //Then
            Assertions.assertEquals(figure, shapeCollector.getFigure(0));
        }
        @Test
        void testRemoveFigure() {
            //Given
            Shape figure = new Square(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
        @Test
        void testRemoveFigureNotExisting() {
            //Given
            Shape figure = new Square(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(figure);

            //Then
            Assertions.assertFalse(result);
        }
        @Test
        void testGetFigure() {
            //Given
            Shape figure = new Square(10);
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(figure);

            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(figure, retrievedFigure);
        }
        @Test
        void testGetFigureNotExisting() {
            //Given
            Shape figure = new Square(10);
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrievedFigure = null;
            retrievedFigure = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(null, retrievedFigure);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }
    }

    @Nested
    @DisplayName("Tests for collection of figures")
    class TestCollection {
        @Test
        void testShowFiguresEmptyList() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure1 = new Circle(10);
            Shape figure2 = new Triangle(30);
            Shape figure3 = new Square(40);

            //When
            String result = null;
            result = shapeCollector.showFigures();

            //Then
            Assertions.assertEquals(null, result);
            Assertions.assertEquals(0, shapeCollector.getCollectionSize());
        }

        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape figure1 = new Circle(10);
            shapeCollector.addFigure(figure1);
            Shape figure2 = new Triangle(30);
            shapeCollector.addFigure(figure2);
            Shape figure3 = new Square(40);
            shapeCollector.addFigure(figure3);

            //When
            String result = null;
            result = shapeCollector.showFigures();
            String expected = figure1.toString() + figure2.toString() + figure3.toString();

            //Then
            Assertions.assertEquals(expected, result);
        }
    }
}
