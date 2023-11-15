package de.ait.homework37;

import java.util.ArrayList;
import java.util.List;

public class InventoryManagement {

    private List<MobilePhone> mobilePhones;

    public InventoryManagement() {
        this.mobilePhones = new ArrayList<>();
    }

    public void addMobilePhone(MobilePhone phone) {
        mobilePhones.add(phone);
    }

    public MobilePhone getMobilePhone(int id) {
        for (MobilePhone phone : mobilePhones) {
            if (phone.getId() ==id) {
                return phone;
            }
        }
        return null; // Return null if a phone with the specified ID is not found
    }

    public void updateMobilePhone(MobilePhone phone) {
        for (int i = 0; i < mobilePhones.size(); i++) {
            if (mobilePhones.get(i).getId() == phone.getId()) {
                mobilePhones.set(i, phone);
                return;
            }
        }
    }

    public void deleteMobilePhone(int id) {
        mobilePhones.removeIf(phone -> phone.getId() ==id);
    }

    public List<MobilePhone> listMobilePhones() {
        return mobilePhones;
    }
}





