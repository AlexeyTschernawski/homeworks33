package homewort37.test;

import de.ait.homework37.InventoryManagement;
import de.ait.homework37.MobilePhone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class InventoryManagementTest {

    private InventoryManagement inventoryManagement;

    @BeforeEach
    void setUP() {inventoryManagement = new InventoryManagement(); }


    @Test
    void testAddMobilePhone () {

        MobilePhone phone = new MobilePhone(1, "iPhone,", "14+", "OS", 1100);
        inventoryManagement.addMobilePhone(phone);
        assertEquals(1, inventoryManagement.listMobilePhones().size());
    }

    @Test
    void testGetMobilePhone() {
        InventoryManagement inventory = new InventoryManagement();
        MobilePhone phone = new MobilePhone(1, "Brand", "Model", "OS", 999.99);
        inventory.addMobilePhone(phone);
        MobilePhone retrievedPhone = inventory.getMobilePhone(1);
        assertNotNull(retrievedPhone);
        assertEquals(1, retrievedPhone.getId());
    }

    @Test
    void testUpdateMobilePhone() {
        InventoryManagement inventory = new InventoryManagement();
        MobilePhone phone = new MobilePhone(1, "Brand", "Model", "OS", 999.99);
        inventory.addMobilePhone(phone);

        MobilePhone updatedPhone = new MobilePhone(1, "New Brand", "New Model", "New OS", 1299.99);
        inventory.updateMobilePhone(updatedPhone);

        MobilePhone retrievedPhone = inventory.getMobilePhone(1);
        assertEquals("New Brand", retrievedPhone.getBrand());
        assertEquals("New Model", retrievedPhone.getModel());
        assertEquals("New OS", retrievedPhone.getOperatingSystem());
        assertEquals(1299.99, retrievedPhone.getPrice());
    }

    @Test
    void testDeleteMobilePhone() {
        InventoryManagement inventory = new InventoryManagement();
        MobilePhone phone = new MobilePhone(1, "Brand", "Model", "OS", 999.99);
        inventory.addMobilePhone(phone);

        inventory.deleteMobilePhone(1);

        assertEquals(0, inventory.listMobilePhones().size());
    }
}
