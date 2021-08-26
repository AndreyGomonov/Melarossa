import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CircleUtilTest {
    CircleUtil circle;

    @Before
    public void init() {
        circle = new CircleUtil();
    }

    @Test
    public void diameter_2radius_is4Diameter () {
        //given
        double radius = 2.0;

        //when
        double result = circle.diameter(radius);

        //then
        assertEquals(4, result, 0.0000001);
    }

    @Test
    public void circlePerimeter_2radius_Perimeter12_566 () {
        //given
        double radius = 2.0;

        //when
        double result = circle.circlePerimeter(radius);

        //then
        assertEquals(12.566, result, 0.1);
    }

    @Test
    public void circleArea_2radius_Area12_566 () {
        //given
        double radius = 2.0;

        //when
        double result = circle.circleArea(radius);

        //then
        assertEquals(12.566, result, 0.1);
    }
}
