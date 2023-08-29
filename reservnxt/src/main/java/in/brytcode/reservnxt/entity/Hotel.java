package in.brytcode.reservnxt.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "hotelIdSeq")
    @SequenceGenerator(name="hotelIdSeq",sequenceName = "HOTELID_SEQ",initialValue = 1,allocationSize = 1)
    private int id;
    private String uuid;
    private String name;
    private String address;
    private double rating;
    private String hotelType;
    private String contactNo;
    @OneToMany
    @JoinColumn(name = "id")
    private List<HotelRoom> hotelRooms;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getHotelType() {
        return hotelType;
    }

    public void setHotelType(String hotelType) {
        this.hotelType = hotelType;
    }

    public List<HotelRoom> getHotelRooms() {
        return hotelRooms;
    }

    public void setHotelRooms(List<HotelRoom> hotelRooms) {
        this.hotelRooms = hotelRooms;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
