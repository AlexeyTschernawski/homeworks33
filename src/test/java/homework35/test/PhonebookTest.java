package homework35.test;

import de.ait.homework35.Contact;
import de.ait.homework35.Phonebook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PhonebookTest {

    Phonebook phonebook;

    @BeforeEach
    public void setUp(){
        phonebook = new Phonebook();
    }

    @Test
    void testAddValidContact(){
        Contact contact = new Contact("Willis", "049123456");
        Assertions.assertTrue(phonebook.addContact(contact));
        Assertions.assertEquals(contact, phonebook.findContactByName(contact.getName()));
    }

    @Test
    void testAddDuplicateContact(){
        Contact contact = new Contact("Willis", "049123456");
        Contact contactTwo = new Contact("Willis", "049123777");
        phonebook.addContact(contact);
        Assertions.assertFalse(phonebook.addContact(contactTwo));
    }

    @Test
    void testAddNullContact(){
        Assertions.assertFalse(phonebook.addContact(null));
    }

    @Test
    void testDeleteExistingContact(){
        Contact contact = new Contact("Willis", "049123456");
        phonebook.addContact(contact);
        Assertions.assertTrue(phonebook.deleteContact(contact.getName()));
        Assertions.assertNull(phonebook.findContactByName(contact.getName()));
    }

    @Test
    void testDeleteNonexistentContact(){
        Assertions.assertFalse(phonebook.deleteContact("Willi"));
    }

    @Test
    void testFindExistingContact(){
        Contact contact = new Contact("Willis", "049123456");
        phonebook.addContact(contact);
        Assertions.assertEquals(contact, phonebook.findContactByName(contact.getName()));
    }

    @Test
    void testFindNonexistentContact(){
        Assertions.assertNull(phonebook.findContactByName("Noname"));
    }

}