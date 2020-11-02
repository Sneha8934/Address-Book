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
public interface AddressBookManagerInterface {
    public void newAddressBook();
	public void openAddressBook();
	public void saveAddressBook();
	public void saveAsAddressBook();
	public void closeAddressBook();
	public void quit();
}
