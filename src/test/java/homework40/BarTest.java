package homework40;

import de.ait.homework40.Bar;
import de.ait.homework40.Drink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

class BarTest {

    private Bar bar;

    @BeforeEach
    public void setUp(){
        bar = new Bar();
    }

    @Test
    void addDrinkSuccess() {
        Drink drink = new Drink("Bier", "alcohol", 500);
        Map<String, Drink> resultAllDrinks = bar.getBarCollection();
        Assertions.assertEquals(0, resultAllDrinks.size());
        Assertions.assertTrue(bar.addDrink("1", drink));
        resultAllDrinks = bar.getBarCollection();
        Assertions.assertEquals(1, resultAllDrinks.size());
    }


    @Test
    void addDrinkFailIdNull(){
        Drink drink = new Drink("Bier", "alcohol", 500);
        Assertions.assertFalse(bar.addDrink(null, drink));
    }

    @Test
    void addDrinkFailDrinkNull(){
        Assertions.assertFalse(bar.addDrink("1", null));
    }

    @Test
    void getDrinkSuccess() {
        Drink drink = new Drink("Bier", "alcohol", 500);
        Assertions.assertTrue(bar.addDrink("1", drink));
        Assertions.assertNotNull(bar.getDrink("1"));
        Assertions.assertEquals(drink, bar.getDrink("1"));
    }

    @Test
    void getDrinkFail(){
        Assertions.assertNull(bar.getDrink("2"));
    }

    @Test
    void getBarCollection() {
        Assertions.assertNotNull(bar.getBarCollection());
    }
}