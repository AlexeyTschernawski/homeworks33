package de.ait.homework37;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class InventoryManagement {

    private List<MobilePhone> mobilePhones;

    public InventoryManagement() {
        this.mobilePhones = new ArrayList<>();
    }

    public boolean addMobilePhone(MobilePhone phone) {
        mobilePhones.add(phone);
        return false;
    }

    public MobilePhone getMobilePhone(int id) {
        for (MobilePhone phone : mobilePhones) {
            if (phone.getId() ==id) {
                return phone;
            }
        }
        return null; // Return null if a phone with the specified ID is not found
    }

    public boolean updateMobilePhone(int fakeUuid, MobilePhone phone) {
        for (int i = 0; i < mobilePhones.size(); i++) {
            if (mobilePhones.get(i).getId() == phone.getId()) {
                mobilePhones.set(i, phone);
                return false;
            }
        }
        return false;
    }

    public boolean deleteMobilePhone(int id) {

        mobilePhones.removeIf(phone -> phone.getId() ==id);
        return false;
    }

    public List<MobilePhone> listMobilePhones() {
        return mobilePhones;
    }

    public Collection<Object> getAllMobilePhones() {
        return null;
    }

    public MobilePhone getMobilephone(UUID idSearchMobilephone) {
        return null;
    }

    public boolean deleteMobilePhone(UUID fakeUuid) {
        return false;
    }

    public MobilePhone getMobilephone(int idSearchMobilephone) {
        return null;
    }

    public boolean updateMobilePhone(UUID fakeUuid, MobilePhone samsungGalaxyS23Ultra) {
        return false;
    }

    public void updateMobilePhone(MobilePhone updatedPhone) {

    }
}





