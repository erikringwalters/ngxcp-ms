package csumbcapstonegroup22spring2019.dataservice.business;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import csumbcapstonegroup22spring2019.dataservice.api.entities.AlterEgo;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Hero;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Identity;
import csumbcapstonegroup22spring2019.dataservice.api.entities.Powers;
import csumbcapstonegroup22spring2019.dataservice.data.HeroDbClient;
import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerTester {
    
    @Autowired
    Manager manager;

    @MockBean
    HeroDbClient heroDb;

    @Test
    public void getHeroListReturnsEmptyListWhenNullHeroesInDb() {
        when(heroDb.getHeroData()).thenReturn(null);
        Assert.assertEquals(null, manager.getHeroList());
    }

    
    private List<Hero> FiveStandardHerosStub () {
        List<Hero> result = new ArrayList<Hero>();
        Hero h1 = new Hero("1", new Identity("1"), new AlterEgo("a"), new Powers(Arrays.asList("l","m","o")));
        Hero h2 = new Hero("2", new Identity("2"), new AlterEgo("b"), new Powers(Arrays.asList("l","m","o")));
        Hero h3 = new Hero("3", new Identity("3"), new AlterEgo("c"), new Powers(Arrays.asList("l","m","o")));
        Hero h4 = new Hero("4", new Identity("4"), new AlterEgo("d"), new Powers(Arrays.asList("l","m","o")));
        Hero h5 = new Hero("5", new Identity("5"), new AlterEgo("e"), new Powers(Arrays.asList("l","m","o")));
        result = Arrays.asList(h1,h2,h3,h4,h5);
        return result;
    }
 
    /* What to test Answers from class:
    //Right: manager returns expected results
    //Boundry Test - Error: exception bubbles up
    //boundry test - Error: database connection failure
 
    //boundry test - type or mapping error... misc database error.
    //boundry test - Existance: what happens if there are no heroes
    //boundry test - Range: too many heroes?
    //boundry test - range: no more than 10 heroes are returned at once.
    //performance test: obtain list of 1000 in less than 2 seconds
    //Boundry - conformance: what if hero has no alter ego
    //Boundry - conformance: what if hero has no Identity
    //Boundry - conformance: what if hero has no powers
    */

}
