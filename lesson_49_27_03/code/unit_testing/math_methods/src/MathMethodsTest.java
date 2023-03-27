import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathMethodsTest {

    MathMethods mathMethods; // подключили тестируемый класс

    @BeforeEach
    void setUp() {mathMethods = new MathMethods();} // создаем экземпляр тестируемого класса перед каждым тестом

    @Test
    @DisplayName("Тестируем метод isPrimeNumber")
    void testIsPrime() {
        assertTrue(mathMethods.isPrimeNumber(13)); // ожидаю true при числе 13
        assertFalse(mathMethods.isPrimeNumber(121)); // ожидаю false при числе 121
        assertTrue(mathMethods.isPrimeNumber(31));
        assertFalse(mathMethods.isPrimeNumber(45));
    }
    @Test
    @DisplayName("Тестируем метод isEven")
    void testIsEven() {
        assertTrue(mathMethods.isEven(10));
        assertFalse(mathMethods.isEven(23));
    }
    @Test
    @DisplayName("Тестируем метод faktorial")
    void testFactorial() {
        assertEquals(120, mathMethods.faktorial(6), "5! = 120");
    }
}