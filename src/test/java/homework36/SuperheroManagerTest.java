package homework36;

import de.ait.homework36.Superhero;
import de.ait.homework36.SuperheroManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SuperheroManagerTest {



    private SuperheroManager superheroManager;

    @BeforeEach
    void setUp() {
        superheroManager = new SuperheroManager();
    }

    @Test
    void addSuperheroSuccess() {
        Superhero superheroThor = new Superhero("Thor", 10, 1021);
        superheroManager.addSuperhero(superheroThor);
        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
        int sizeResult = superheroesResult.size();
        Assertions.assertEquals(1, sizeResult);
        Assertions.assertEquals(superheroThor, superheroesResult.get(0));
    }

    @Test
    void addSuperheroFail() {
        Superhero superheroThor = new Superhero("Thor", 10, 1021);
        superheroManager.addSuperhero(superheroThor);
        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
        int sizeResult = superheroesResult.size();
        Assertions.assertEquals(1, sizeResult);
        superheroManager.addSuperhero(superheroThor);
        Assertions.assertEquals(1, sizeResult);
    }

    @Test
    void addSuperheroWrongPowerFail() {
        Superhero superheroThor = new Superhero("Thor", 100, 1021);
        superheroManager.addSuperhero(superheroThor);
        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();

        int sizeResult = superheroesResult.size();
        Assertions.assertEquals(0, sizeResult);

    }


    @Test
    void removeSuperheroSuccess() {
        Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
        Superhero superheroBatman = new Superhero("Batman", 9, 40);
        Superhero superheroSuperman = new Superhero("Superman", 10, 33);

        superheroManager.addSuperhero(superheroIronMan);
        superheroManager.addSuperhero(superheroBatman);
        superheroManager.addSuperhero(superheroSuperman);

        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
        int sizeResult = superheroesResult.size();
        Assertions.assertEquals(3, sizeResult);

        superheroManager.removeSuperhero("Batman");

        List<Superhero> superheroesResultRemove = superheroManager.getAllSuperheroes();
        Assertions.assertEquals(2, superheroesResultRemove.size());

        for (Superhero superhero: superheroesResultRemove){
            Assertions.assertNotEquals("Batman", superhero.getName());
        }

    }

    @Test
    void removeSuperheroFail() {
        Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
        Superhero superheroBatman = new Superhero("Batman", 9, 40);
        Superhero superheroSuperman = new Superhero("Superman", 10, 33);

        superheroManager.addSuperhero(superheroIronMan);
        superheroManager.addSuperhero(superheroBatman);
        superheroManager.addSuperhero(superheroSuperman);

        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
        int sizeResult = superheroesResult.size();
        Assertions.assertEquals(3, sizeResult);

        superheroManager.removeSuperhero("Cat");
        List<Superhero> superheroesResultRemove = superheroManager.getAllSuperheroes();
        Assertions.assertEquals(3, superheroesResultRemove.size());

    }

    @Test
    void getSuperheroSuccess() {
        Superhero superhero = new Superhero("Spider-Man", 9, 30);
        superheroManager.addSuperhero(superhero);
        Assertions.assertNotNull(superheroManager.getSuperhero(superhero.getName()));
        Assertions.assertEquals(superhero, superheroManager.getSuperhero(superhero.getName()));
    }

    @Test
    void getSuperheroFail() {
        Superhero superhero = new Superhero("Spider-Man", 9, 30);
        superheroManager.addSuperhero(superhero);
        Assertions.assertNull(superheroManager.getSuperhero("SpiderMan"));
    }

    @Test
    void getAllSuperheroes() {
        Superhero superheroIronMan = new Superhero("Iron Man", 10, 40);
        Superhero superheroBatman = new Superhero("Batman", 9, 40);
        Superhero superheroSuperman = new Superhero("Superman", 10, 33);

        superheroManager.addSuperhero(superheroIronMan);
        superheroManager.addSuperhero(superheroBatman);
        superheroManager.addSuperhero(superheroSuperman);

        List<Superhero> superheroesResult = superheroManager.getAllSuperheroes();
        Assertions.assertEquals(3, superheroesResult.size());
        Assertions.assertEquals(superheroIronMan, superheroesResult.get(0));
        Assertions.assertEquals(superheroBatman, superheroesResult.get(1));
        Assertions.assertEquals(superheroSuperman, superheroesResult.get(2));

    }

    @Test
    void testUpdateSuperheroSuccess(){
        Superhero superheroIronMan = new Superhero("Iron Man", 5, 40);
        superheroManager.addSuperhero(superheroIronMan);
        Superhero superheroIronManUpdate = new Superhero("Iron Man", 10, 30);
        superheroManager.updateSuperhero("Iron Man", superheroIronManUpdate);
        Superhero superheroResult = superheroManager.getSuperhero("Iron Man");
        Assertions.assertEquals(10, superheroResult.getPower());
        Assertions.assertEquals(30, superheroResult.getAge());

    }




}