import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {
    @Test
    public void google1() {
        System.out.println("Google1 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google1 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google1 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void google2() {
        System.out.println("Google2 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google2 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google2 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }

    @Test
    public void google3() {
        System.out.println("Google3 Test Started! " + "Thread Id: " +  Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google3 Test's Page title is: " + getDriver().getTitle() +" " + "Thread Id: " +  Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google3 Test Ended! " + "Thread Id: " +  Thread.currentThread().getId());
    }
}