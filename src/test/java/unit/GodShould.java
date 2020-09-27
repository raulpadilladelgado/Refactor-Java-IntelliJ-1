package unit;

import moveResponsibility.God;
import moveResponsibility.OperatorService;
import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GodShould {
    @Test
    public void say_hello() {
        GodForTest god = new GodForTest();
        god.sayHello();
        Assert.assertEquals("Hello!",god.getHello());
    }
    @Test
    public void say_bye() {
        GodForTest god = new GodForTest();
        god.sayBye();
        Assert.assertEquals("Good bye!",god.getBye());
    }
}
class GodForTest extends God{
    private String hello = "";
    private String bye = "";

    public String getHello() {
        return hello;
    }

    public String getBye() {
        return bye;
    }

    @Override
    public void sayHello() {
        hello = "Hello!";
    }

    @Override
    public void sayBye() {
        bye = "Good bye!";
    }
}
