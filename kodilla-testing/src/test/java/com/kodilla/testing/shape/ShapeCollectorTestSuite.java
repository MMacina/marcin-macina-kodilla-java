package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("Shape Collector Test  Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    static void beforeAllTests() {
        System.out.println("\nThis is the beginning of tests.");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("All tests are finished.\n");
    }

    @BeforeEach
    void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for modify Collection")
    class ModifyingTests {
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(new Square(5.00));

            //Then
            Assertions.assertEquals(1, collector.numberOfFigures());
        }

        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(4.00));

            //When
            collector.removeFigure(new Square(4.00));

            //Then

            Assertions.assertEquals(0, collector.numberOfFigures());
        }
    }

    @Nested
    @DisplayName("Tests for get Collection")
    class GettingTests {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(3.00));
            collector.addFigure(new Circle(6.00));
            collector.addFigure(new Triangle(4.50, 8.00));

            //When
            Shape theFigure = collector.getFigure(1);

            //Then
            Assertions.assertEquals(new Circle(6.00), theFigure);
            Assertions.assertEquals((3.14 * 6 * 6), theFigure.getField());
        }

        @Test
        void testGetFigureNegative() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(3.00));
            collector.addFigure(new Circle(6.00));
            collector.addFigure(new Triangle(4.50, 8.00));

            //When
            Shape theFigure = collector.getFigure(-1);

            //Then
            Assertions.assertNull(theFigure);
        }

        @Test
        void testGetFigureOutOfRange() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(3.00));
            collector.addFigure(new Circle(6.00));
            collector.addFigure(new Triangle(4.50, 8.00));

            //When
            Shape theFigure = collector.getFigure(5);

            //Then
            Assertions.assertNull(theFigure);
        }
    }
}