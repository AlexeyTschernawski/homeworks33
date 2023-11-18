package homework37;

import de.ait.homework37.InventoryManagement;
import de.ait.homework37.MobilePhone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

class InventoryManagementTest {

    private MobilePhone samsungGalaxyS23Ultra = new MobilePhone("S23 Ultra",
            "Android", 1234,900);

    private InventoryManagement inventoryManagement;

    @BeforeEach
    void setUp() {
        inventoryManagement = new InventoryManagement();
    }

    @Test
    void addMobilePhone() {
        Assertions.assertTrue(inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra));
        Assertions.assertEquals(1, inventoryManagement.getAllMobilePhones().size());
    }

    @Test
    void getMobilephoneSuccess() {
        inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra);
        int idSearchMobilephone = samsungGalaxyS23Ultra.getId();
        Assertions.assertNotNull(inventoryManagement.getMobilephone(idSearchMobilephone));
        Assertions.assertEquals(samsungGalaxyS23Ultra,
                inventoryManagement.getMobilephone(idSearchMobilephone));
    }


    @Test
    void getMobilephoneFail() {
        UUID fakeUuid = new UUID(10, 10);
        Assertions.assertNull(inventoryManagement.getMobilephone(fakeUuid));
    }

    @Test
    void updateMobilePhoneSuccess() {
        inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra);
        samsungGalaxyS23Ultra.setPrice(1000);
        int id = samsungGalaxyS23Ultra.getId();
        inventoryManagement.updateMobilePhone(id, samsungGalaxyS23Ultra);
        Assertions.assertTrue(inventoryManagement.updateMobilePhone(id, samsungGalaxyS23Ultra));
        MobilePhone result = inventoryManagement.getMobilephone(id);
        Assertions.assertEquals(1000, result.getPrice());
    }

    @Test
    void updateMobilePhoneFail() {
        UUID fakeUuid = new UUID(10, 10);
        Assertions.assertFalse(inventoryManagement.updateMobilePhone(fakeUuid, samsungGalaxyS23Ultra));
    }


    @Test
    void deleteMobilePhoneSuccess() {
        inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra);
        Assertions.assertTrue(inventoryManagement.deleteMobilePhone(samsungGalaxyS23Ultra.getId()));
        Assertions.assertEquals(0, inventoryManagement.getAllMobilePhones().size());
    }


    @Test
    void deleteMobilePhoneFail() {
        UUID fakeUuid = new UUID(10, 10);
        Assertions.assertFalse(inventoryManagement.deleteMobilePhone(fakeUuid));
    }

    @Test
    void getAllMobilePhones() {
        inventoryManagement.addMobilePhone(samsungGalaxyS23Ultra);
        MobilePhone iPhone15ProMax = new MobilePhone("iPhone", "15 Pro Max");
        inventoryManagement.addMobilePhone(iPhone15ProMax);

        Assertions.assertEquals(2, inventoryManagement.getAllMobilePhones().size());
        Assertions.assertTrue(inventoryManagement.getAllMobilePhones().contains(samsungGalaxyS23Ultra));
        Assertions.assertTrue(inventoryManagement.getAllMobilePhones().contains(iPhone15ProMax));

    }
}