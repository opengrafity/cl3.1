package in.brytcode.reservnxt.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Booking {
    @Id
    @SequenceGenerator(name="bookingIdSeq",sequenceName ="BOOKING_ID_SEQ",allocationSize = 1 )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bookingIdSeq")
    int bookingId;
    @ManyToOne
    @JoinColumn(name = "hotelId")
    private Hotel id;
    @ManyToOne
    @JoinColumn(name="roomId")
    private HotelRoom room;
    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;
    private Date bookingDate;
    private Date checkinDate;
    private Date checkoutDate;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Hotel getId() {
        return id;
    }

    public void setId(Hotel id) {
        this.id = id;
    }

    public HotelRoom getRoom() {
        return room;
    }

    public void setRoom(HotelRoom room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getCheckinDate() {
        return checkinDate;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }
}
