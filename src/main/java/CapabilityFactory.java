import org.openqa.selenium.Capabilities;

public class CapabilityFactory {
    public Capabilities capabilities;

    public Capabilities getCapabilities (String browser) {
        if (browser.equals("firefox")) {
            System.out.println("Setting firefox capabilities");
            capabilities = OptionsManager.getFirefoxOptions();
        }
        else {
            System.out.println("Setting chrome capabilities");
            capabilities = OptionsManager.getChromeOptions();
        }

        return capabilities;
    }
}