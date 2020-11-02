/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author Sneha
 */
import java.util.Comparator;
public class NameComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p1.firstname.compareTo(p2.firstname);
    }
}
