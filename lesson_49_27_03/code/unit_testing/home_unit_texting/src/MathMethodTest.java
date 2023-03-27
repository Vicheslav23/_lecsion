import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class MathMethodTest {
    MathMethods mathMethods; // подключили тестируемый класс

    @BeforeEach
    void setUp() {mathMethods = new MathMethods(); } // создаем экземпляр тестируемого класса перед каждым тестом
    @Test
    @DisplayName("Тестируем метод проверки делимости на 3")
    void testIsThree() {
        assertTrue(mathMethods.IsThreeNumber(33)); // ожидаю true при числе 33
    }
    @Test
    @DisplayName("Тестируем метод проверки делимости на 5")
    void testIsEven() {
        assertTrue(mathMethods.IsFiveNumber(10));
       }
}
