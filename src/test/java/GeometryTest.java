import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidDimensionException;
import exceptions.NegativeHeightException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeometryTest {

    @Test
    public void testValidCircle() {
        Circle circle = new Circle(5);
        assertEquals(78.53981633974483, circle.area(), 0.0001); // Проверка площади круга
        assertEquals("Circle with radius: 5.0", circle.toString()); // Проверка строкового представления
    }

    // Тест на выброс исключения при недопустимом радиусе
    @Test
    public void testInvalidCircle() {
        Exception exception = assertThrows(InvalidDimensionException.class, () -> {
            new Circle(-2);
        });
        assertEquals("The radius must be greater than zero.", exception.getMessage()); // Проверка сообщения исключения
    }

    // Тест на корректное создание Rectangle и вычисление площади
    @Test
    public void testValidRectangle() {
        Rectangle rectangle = new Rectangle(4, 6);
        assertEquals(24.0, rectangle.area(), 0.0001); // Проверка площади прямоугольника
        assertEquals("Rectangle with width: 4.0 and height: 6.0", rectangle.toString()); // Проверка строкового представления
    }

    // Тест на выброс исключения при недопустимых размерах прямоугольника
    @Test
    public void testInvalidRectangle() {
        Exception exception = assertThrows(InvalidDimensionException.class, () -> {
            new Rectangle(0, 5);
        });
        assertEquals("The height must be greater than zero.", exception.getMessage()); // Проверка сообщения исключения
    }

    // Тест на корректное создание Cylinder и вычисление объема
    @Test
    public void testValidCylinder() {
        Cylinder cylinder = new Cylinder(new Circle(3), 10);
        assertEquals(282.7433388230814, cylinder.volume(), 0.0001); // Проверка объема цилиндра
        assertEquals("Cylinder with base: Circle with radius: 3.0 and height: 10.0", cylinder.toString()); // Проверка строкового представления
    }

    // Тест на выброс исключения при отрицательной высоте цилиндра
    @Test
    public void testNegativeHeightCylinder() {
        Exception exception = assertThrows(NegativeHeightException.class, () -> {
            new Cylinder(new Rectangle(2, 3), -5);
        });
        assertEquals("The height must be greater than zero.", exception.getMessage()); // Проверка сообщения исключения
    }
}
