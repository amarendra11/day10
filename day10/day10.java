package day10;

public class day10 {import java.io.Console;

    public static void main(String[] args) {

    }
import java.util.Scanner;
import java.util.Vector;
    /**
     *
     * AddressBook object with variables firstname, lastName, Birthday, City, State,
     * PhoneNumber, ZipCode, Month, Day, Year.
     *
     */
    public class Address {
        String address;
        private String firstName;
        private String lastName;
        private String birthday;
        private String city;
        private String state;
        private String phonenumber;
        private String zipcode;
        private String month;
        private String day;
        private String year;

        Address(String firstName, String lastName, String birthday, String city, String state, String phonenumber,
                String zipcode, String month, String day, String year){

            this.firstName = "";
            this.lastName = "";
            this.birthday = "";
            this.city = "";
            this.state = "";
            this.phonenumber = "";
            this.zipcode = "";
            this.month = "";
            this. day = "";
            this.year = "";
        }
        /**
         *
         * return the first name
         */
        public String getfirstName() {
            return this.firstName;
        }

        /**
         *
         * Set first name
         */
        public void setfirstName(String newfirstName) {
            this.firstName = newfirstName;
        }
        /**
         *
         * return the last name
         */
        public String getlastName() {
            return this.lastName;
        }

        /**
         *
         * set last name
         */
        public void setlastName(String newlastName) {
            this.lastName = newlastName;
        }
        /**
         *
         * return the birthday
         */
        public String getBirthday() {
            return this.birthday;
        }

        /**
         *
         * Set Birthday
         */
        public void setBirthday(String newBirthday) {
            this.birthday = newBirthday;
        }
        /**
         *
         * return the City
         */
        public String getCity() {
            return this.city;
        }

        /**
         *
         * Set the city
         */
        public void setCity(String newCity) {
            this.city = newCity;
        }
        /**
         *
         * return the state
         */
        public String getState() {
            return this.state;
        }

        /**
         *
         * set the state
         */
        public void setState(String newState) {
            this.state = newState;
        }
        /**
         *
         * return the zipcode
         */
        public String getZipCode() {
            return this.zipcode;
        }

        /**
         *
         * set the zipcode
         */
        public void setZipCode(String newZipCode) {
            this.zipcode = newZipCode;
        }
        /**
         *
         * return the phone number
         */
        public String getPhoneNumber() {
            return this.phonenumber;
        }

        /**
         *
         * Set Phone Number
         */
        public void setPhoneNumber(String newPhoneNumber) {
            this.phonenumber = newPhoneNumber;
        }
        /**
         *
         * return the Month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         *
         * set the Month
         */
        public void setMonth(String newMonth) {
            this.month = newMonth;
        }
        /**
         *
         * return the day
         */
        public String getDay() {
            return this.day;
        }

        public void setDay(String newDay) {
            this.day = newDay;
        }
        /**
         *
         * return the Year
         */
        public String getYear(){
            return this.year;
        }

        /**
         *
         * Set the year
         */
        public void setYear(String newYear) {
            this.year = newYear;
        }
        /**
         *
         * toString all of the objects
         */
        public String toString() {
            return "fisrtName=" + firstName + " " + "lastName=" + lastName + " " + "birthday=" + birthday + " " + "city="
                    + city + " " + "State=" + state + " " + "zipcode=" + zipcode + " " + "phonenumber=" + phonenumber +
                    " " + "month=" + month + " " + "day=" + day + " " + "year=" + year;

        }

        {

            for( int i = 0; i<number; i++){

                System.out.println();

                System.out.println("Enter contact "+(i+1)+ " first name:");

                firstName[i] = console.next();

                outputStream.println();

                outputStream.println("First name: "+first[i]);

                System.out.println("Enter contact "+(i+1)+ " last name:");

                last[i] = console.next();

                outputStream.println("Last name: "+last[i]);

                System.out.println("Enter contact " +(i+1)+ " home address.");

                home[i] = Console.next();

                outputStream.println("Home Address: "+home[i]);

                System.out.println("Enter contact " +(i+1)+ " home phone");

                phone[i] = console.next();

                outputStream.println("Home Number: "+phone[i]);

                System.out.println("Enter contact "+(i+1)+" Birthday");

                cell[i] = Console.next();

                outputStream.println("Birthday: "+birthday[i]);

                System.out.println();
            }
}
