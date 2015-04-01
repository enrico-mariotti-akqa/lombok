package test;

import static org.junit.Assert.assertEquals;

public class MyLombokPojoTest {

    @org.junit.Test
    public void testToString() throws Exception {
        //Costructor is generated on the fly thanks to AllArgsConstructor annotation.
        MyLombokPojo lombokPojo = new MyLombokPojo("this is my first attribute", 2);

        //ToString annotation excludes 2nd attribute.
        assertEquals(lombokPojo.toString(), "MyLombokPojo(firstAttribute=this is my first attribute)");

        //Data annotation encapsulates Builder pattern, so that every method returns with its class instance.
        lombokPojo.firstAttribute("I changed it").secondAttribute(2);

        assertEquals(lombokPojo.toString(), "MyLombokPojo(firstAttribute=I changed it)");
    }
}