package in.brytcode.reservnxt.entity;

import java.io.Serializable;

public class StrategyKey implements Serializable {
    private int hotelId;
    private int roomTypeId;

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
}
