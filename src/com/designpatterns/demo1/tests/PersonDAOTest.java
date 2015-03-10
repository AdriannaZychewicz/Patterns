package com.designpatterns.demo1.tests;

import com.designpatterns.demo1.model.DAOFactory;
import com.designpatterns.demo1.model.Database;
import com.designpatterns.demo1.model.Person;
import com.designpatterns.demo1.model.PersonDAO;
import junit.framework.TestCase;
import org.junit.*;

import java.sql.SQLException;
import java.util.List;

public class PersonDAOTest extends TestCase {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{

        Database.getInstance().connect();
        System.out.println("set up before class");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{


        Database.getInstance().disconnect();
        System.out.println("tear down after class");

    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
        Database.getInstance().connect();
        System.out.println("set up");
        PersonDAO dao = DAOFactory.getPersonDAO();
        dao.deleteAll();


    }

    @After
    public void tearDown() throws Exception {

        Database.getInstance().disconnect();
        System.out.println("tear down");
    }

//    @Test
//    public void testDemo(){
//
//        int value = 7;
//        value +=2;
//        System.out.println("tests tests");
//        assertEquals("Check arithmetic works in Java!",7, value);
//
//    }


    @Test
    public void testCreate() throws SQLException {

        PersonDAO dao = DAOFactory.getPersonDAO();
        Person person1 = new Person("Bob", "test");
        Person person2 = new Person("Sue", "hello");

        dao.addPerson(person1);
        dao.addPerson(person2);

        List<Person> people = dao.getPeople();

        assertEquals("Should be two people in db", 2, people.size());
        assertEquals("These two people be the same", person1, people.get(0));
        assertEquals("These two people be the same", person2, people.get(1));
    }
}