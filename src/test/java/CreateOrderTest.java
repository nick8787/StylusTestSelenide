import dto.AddPersonData;
import enums.LaptopName;
import enums.PaymentType;
import generator.FakeRandomGenerator;
import org.testng.annotations.Test;
import selenide.pages.StylusHomePage;

import static utils.Constants.*;

public class CreateOrderTest extends BaseTest {
    private final PaymentType paymentType = FakeRandomGenerator.getRandomOption(PaymentType.class);
    private final LaptopName laptopName = FakeRandomGenerator.getRandomOption(LaptopName.class);
    private final AddPersonData addPersonData = AddPersonData.builder()
            .lastName(USER_LASTNAME)
            .phoneNumber(USER_PHONE_NUMBER)
            .paymentType(paymentType)
            .build();

    @Test
    public void testCreateOrder() {
        StylusHomePage stylusHomePage = new StylusHomePage();
        stylusHomePage.open()
                .authorizeUser(USER_EMAIL, USER_PASSWORD)
                .openCatalog()
                .openAllLaptops()
                .openAsusRog(laptopName)
                .buyLaptop()
                .confirmNewOrder()
                .finishOrderCreation(addPersonData)
                .acceptOrder()
                .verifyOrderCreated(laptopName);
    }
}