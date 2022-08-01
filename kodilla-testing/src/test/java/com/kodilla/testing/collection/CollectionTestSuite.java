package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.*;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("\nTest Suite: begin \n");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end \n");
    }
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test Case: end \n");
    }

    @DisplayName("When examined empty List" + "then return notice")
    @Test
    void testCaseOddNumberExterminatorEmptyList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> emptyList = numbersExterminator.exterminate(numbers);
        List<Integer> expectedEmptyList = new ArrayList<>();
        //Then
        Assertions.assertEquals(emptyList, expectedEmptyList);
    }

    @DisplayName("When examined filled List " + "then compare with example Even List")
    @Test
    void testCaseOddNumberExterminatorNormalList() {
        //Given
        OddNumbersExterminator numbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
        //When
        List<Integer> evenNumbersList = numbersExterminator.exterminate(numbers);
        //List<Integer> expectedEvenList = new ArrayList<>();
        //for (int i = 0; i < 100; i += 2) {
           //expectedEvenList.add(i);
        //}
        Integer expectedEvenArray[] = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38, 40, 42, 44, 46, 48, 50, 52, 54, 56, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98 };
        List<Integer> expectedEvenList = Arrays.asList(expectedEvenArray);
        //Then
        Assertions.assertEquals(evenNumbersList, expectedEvenList);
        System.out.println("List after extermination contains: " + evenNumbersList);
    }
}