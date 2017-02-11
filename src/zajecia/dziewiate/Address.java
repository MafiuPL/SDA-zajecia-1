package zajecia.dziewiate;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RENT on 2017-02-11.
 */
public class Address {

    public String city;
    public String street;
    public int houseNumber;
    public String zipcode;
    public String country;

    public Address(String city, String street, int houseNumber, String zipcode, String country) {
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
        this.zipcode = zipcode;
        this.country = country;
    }

    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(zipcode)
                .append(" ")
                .append(city)
                .append(" ")
                .append(street)
                .append(" ")
                .append(houseNumber)
                .append(" ")
                .append(country)
                .append(" ");
        String toPrint = stringBuilder.toString();
        System.out.println(toPrint);

    }
}
