import attractions.Attraction;
import attractions.Dodgems;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Visitor visitor;
    Attraction dodgems;

    @Before
    public void setUp(){
        dodgems = new Dodgems("Crash", 5);
        themePark = new ThemePark("Thorpe Park");
        visitor = new Visitor(27, 170.00, 100.00);

    }

    @Test
    public void canGetName(){
        assertEquals("Thorpe Park", themePark.getName());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, dodgems);
        assertEquals(1, visitor.returnVisitedAttractions().size());
        assertEquals(1, dodgems.getVisitCount());
    }

    @Test
    public void canGetReviewedAttractions(){
        assertEquals(0, themePark.getReviewedAttractionsAndStalls().size());
    }

    @Test
    public void canGetAttractionsAndStalls(){
        assertEquals(0, themePark.getAttractionsAndStalls().size());
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.getAttractionsAndStalls().size());
    }
}
