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
public class Person {
    //attributes
	  public String firstname;  
	  public String lastname;
	  public String phonenumber;
	  public String city;
	  public String state;
	  public String zipcode;
          
    //constructor
	  public Person(String firstname, String lastname, String phonenumber, String city, String state, String zipcode) {
              this.firstname = firstname;
              this.lastname = lastname;
              this.phonenumber = phonenumber;
              this.city = city;
              this.state = state;
              this.zipcode = zipcode;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Person{" + "firstname=" + firstname + ", lastname=" + lastname + ", phonenumber=" + phonenumber + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }
}