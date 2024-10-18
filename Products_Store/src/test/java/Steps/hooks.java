package Steps;


import Page.HomePage;
import org.junit.After;
import org.junit.Before;


public class hooks {
    HomePage homepage = new HomePage();
@Before
    public void setUp(){
        homepage.open();
    }

    @After
    public void trearDown(){

    }
}