package in.brytcode.reservnxt.entity;

import javax.persistence.*;

@Entity
public class RoomType {
    @Id
    @SequenceGenerator(name="roomTypeIdSeq", sequenceName = "ROOM_TYPE_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roomTypeIdSeq")
    private int roomTypeId;
    private String roomTypeName;

    public int getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }
}
