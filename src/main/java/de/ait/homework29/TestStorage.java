package de.ait.homework29;


import java.util.ArrayList;
import java.util.List;

public class TestStorage {

    public static void main(String[] args) {
        FileStorage fileStorage = new FileStorage(5);

        fileStorage.store("Item 1");
        fileStorage.store("Item 2");
        fileStorage.store("Item 3");
        fileStorage.store("Item 4");
        fileStorage.store("Item 5");

       System.out.println("count: " + fileStorage.count() +
                " capacity: " + fileStorage.getCapacity());

        fileStorage.store("Item 6");

        System.out.println(fileStorage.retrieve(20));

        System.out.println(fileStorage.getItemsStored());
        System.out.println("-------------");


        List<String> list = new ArrayList<>();
        list.add("Item A");
        list.add("Item B");
        list.add("Item C");
        list.add("Item D");
        FileStorage fileStorageNew = new FileStorage(4, list);
        System.out.println(fileStorageNew.getItemsStored());



        MemoryStorage memoryStorage = new MemoryStorage(3);
        memoryStorage.store("Item 1");
        memoryStorage.store("Item 2");
        memoryStorage.store("Item 3");
        System.out.println("count: " + memoryStorage.count() +
                " capacity: " + memoryStorage.getCapacity());
        System.out.println(memoryStorage.getItemsStored());
        memoryStorage.store("Item 4");
        System.out.println(memoryStorage.getItemsStored());
        System.out.println(memoryStorage.retrieve(0));
        memoryStorage.retrieve(34);





    }
}
