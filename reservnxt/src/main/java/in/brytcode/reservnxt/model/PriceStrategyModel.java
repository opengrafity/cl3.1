package in.brytcode.reservnxt.model;

import javax.persistence.Id;
import java.math.BigDecimal;

public class PriceStrategyModel {
    private int hotelId;
    private int roomTypeId;
    private BigDecimal price;

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
